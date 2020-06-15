package com.flashbox.balitrip2019.checklist

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

import com.flashbox.balitrip2019.R
import com.flashbox.balitrip2019.databinding.ChecklistFragmentBinding

class ChecklistFragment : Fragment() {


    private lateinit var viewModel: ChecklistViewModel
    private lateinit var binding: ChecklistFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ChecklistFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ChecklistViewModel::class.java)

        viewModel.data.observe(viewLifecycleOwner, Observer {
            binding.recyclerView.adapter = RecyclerViewAdapter(it)
        })

        val activity = activity as AppCompatActivity
        val actionBar = activity.supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(false)


    }

}
