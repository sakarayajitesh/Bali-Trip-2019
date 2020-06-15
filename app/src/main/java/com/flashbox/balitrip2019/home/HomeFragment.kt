package com.flashbox.balitrip2019.home


import android.app.Activity
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.flashbox.balitrip2019.R
import com.flashbox.balitrip2019.databinding.CustomActionBarBinding
import com.flashbox.balitrip2019.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel
    private  var width:Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.lifecycleOwner= viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val displaymetrics = DisplayMetrics()
        (context as Activity).windowManager.defaultDisplay.getMetrics(displaymetrics)
        width = displaymetrics.widthPixels / 2
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        viewModel.items.observe(this, Observer {
            if(it!=null)
                bindList(it)
        })

        viewModel.openItem.observe(this, Observer {
            if(it!=null){
                openItem(it)
                viewModel.onClickedCompleted()
            }
        })


    }


    private fun openItem(id: Home){
        this.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(id))
    }

    private fun bindList(list: List<Home>){
        val recyclerViewAdapter = RecyclerViewAdapter(width, list, RecyclerViewAdapter.OnClickListener {
            viewModel.onClicked(it)
        })
        binding.recyclerView.adapter = recyclerViewAdapter
    }
}
