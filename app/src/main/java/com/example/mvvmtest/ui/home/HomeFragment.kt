package com.example.mvvmtest.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmtest.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private  var _binding:FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
       _binding = FragmentHomeBinding.inflate(inflater,container,false)
        var view = binding.root

        _binding!!.textHome.text = "nay Ye Lin"
        val layoutManager = LinearLayoutManager(context)
        binding.homeRecyclerView.layoutManager = layoutManager
        val list = homeViewModel.getArrayList()
        binding.homeRecyclerView.adapter = HomeAdapter(list)


        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}