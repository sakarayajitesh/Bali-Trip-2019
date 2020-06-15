package com.flashbox.balitrip2019.detail


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.flashbox.balitrip2019.R
import com.flashbox.balitrip2019.SwipeToDeleteCallback
import com.flashbox.balitrip2019.databinding.FragmentDetailBinding
import com.flashbox.balitrip2019.detail.classes.BaseItem
import com.flashbox.balitrip2019.home.Home


class DetailFragment : Fragment() {

    val safeArgs: DetailFragmentArgs by navArgs()
    private lateinit var binding: FragmentDetailBinding
    private lateinit var viewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val home = safeArgs.home
        val application = requireNotNull(this.activity).application

        setupActionBar(home)

        val viewModelFactory = DetailViewModelFactory(application, home)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(DetailViewModel::class.java)

        viewModel.data.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                showRecyclerView(it)
            }
        })

    }

    private fun setupActionBar(home: Home) {
        val activity = activity as AppCompatActivity
        val actionBar = activity.supportActionBar
        actionBar?.title =
            if (home.extra != null && home.extra.isNotEmpty()) "${home.name} - ${home.extra}" else home.name
        context?.let { context ->
            val drawable = when (home.name.toLowerCase()) {
                "flights" -> {
                    R.drawable.back_airport
                }
                "hotels" -> {
                    R.drawable.ic_hotel_black_24dp
                }
                else -> {
                    R.drawable.ic_clear_black_24dp
                }
            }
            actionBar?.setHomeAsUpIndicator(ContextCompat.getDrawable(context, drawable))

        }


    }

    private fun showRecyclerView(it: List<BaseItem>) {
        binding.recyclerView.adapter = RecyclerViewAdapter(it)
        val swipeToDeleteCallback = object : SwipeToDeleteCallback(context!!) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                viewModel.onSwiped(viewHolder, direction)
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchHelper.attachToRecyclerView(binding.recyclerView)
    }
}
