package com.example.pampanitikan.ui.home

import HomeViewModel
import HomeViewModel2
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pampanitikan.R

class HomeFragment : Fragment(), Myadapter.OnItemClickListener,Myadapter2.OnItemClickListener2 {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var homeViewModel2: HomeViewModel2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView: RecyclerView = root.findViewById(R.id.cropRecycler)

        homeViewModel2 = ViewModelProvider(this).get(HomeViewModel2::class.java)
        val recyclerView2: RecyclerView = root.findViewById(R.id.cropRecycler1)

        // Use GridLayoutManager with 2 columns
        val layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.layoutManager = layoutManager

        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                // Set span size to 1 for each item
                return 1
            }
        }
        // Use GridLayoutManager with 2 columns
        val layoutManager2 = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.layoutManager = layoutManager2




        val adapter = Myadapter(requireContext())
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(this)

        homeViewModel.dataList.observe(viewLifecycleOwner, Observer {
            adapter.setDataList(it)
        })


        val adapter2 = Myadapter2(requireContext())
        recyclerView2.adapter = adapter2
        adapter2.setOnItemClickListener(this)

        homeViewModel2.dataList.observe(viewLifecycleOwner, Observer {
            adapter2.setDataList(it)
        })

        return root
    }
    override fun onItemClick(data: Datas) {
        // Navigate to new fragment and pass data
        val bundle = Bundle().apply {
            putInt("imageResId", data.imageResId)
            putString("title", getString(data.titleResId))
            putString("content", getString(data.contentResId))
        }
        val detailFragment = DetailFragment()
        detailFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_content_main, detailFragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onItemClick2(data: Datas) {
        // Navigate to new fragment and pass data
        val bundle = Bundle().apply {
            putInt("imageResId", data.imageResId)
            putString("title", getString(data.titleResId))
            putString("content", getString(data.contentResId))
        }
        val detailFragment = DetailFragment()
        detailFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_content_main, detailFragment)
            .addToBackStack(null)
            .commit()
    }
}
