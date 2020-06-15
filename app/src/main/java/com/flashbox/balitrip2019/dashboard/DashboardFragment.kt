package com.flashbox.balitrip2019.dashboard

import android.app.Dialog
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.flashbox.balitrip2019.R
import com.flashbox.balitrip2019.SwipeToDeleteCallback

import com.flashbox.balitrip2019.databinding.CustomDialogLayoutBinding
import com.flashbox.balitrip2019.databinding.DashboardFragmentBinding

class DashboardFragment : Fragment() {

    companion object {
        fun newInstance() = DashboardFragment()
    }

    private lateinit var viewModel: DashboardViewModel
    private lateinit var binding: DashboardFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DashboardFragmentBinding.inflate(LayoutInflater.from(context), container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DashboardViewModel::class.java)

        binding.viewModel = viewModel
        val activity = activity as AppCompatActivity
        val actionBar = activity.supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(false)

        viewModel.dash.observe(viewLifecycleOwner, Observer {
            if(null!=it){
                val adapter = RecyclerViewAdapter(it)
                binding.recyclerView.adapter = adapter
            }
        })


        binding.fab.setOnClickListener {
            val dialog = Dialog(it.context)
            val binding = CustomDialogLayoutBinding.inflate(dialog.layoutInflater)
            dialog.setContentView(binding.root)
            dialog.show()

            binding.addButton.setOnClickListener {
                viewModel.addDash(
                    context!!,
                binding.purposeEt.text.toString(),
                binding.amountEt.text.toString(),
                binding.addSpent.selectedItem.toString(),
                binding.cashCard.selectedItem.toString()
                )
                dialog.cancel()
            }

            binding.cancelButton.setOnClickListener {
                dialog.cancel()
            }
        }

        val swipeToDeleteCallback = object : SwipeToDeleteCallback(context!!) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                viewModel.onSwiped(viewHolder, direction)
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchHelper.attachToRecyclerView(binding.recyclerView)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.dashboard_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if(id == R.id.clear_list_menu){
            viewModel.clearList()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
