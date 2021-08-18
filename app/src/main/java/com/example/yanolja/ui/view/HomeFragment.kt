package com.example.yanolja.ui.view

import com.example.yanolja.R
import com.example.yanolja.databinding.FragmentHomeBinding
import com.example.yanolja.ui.base.BaseFragment
import com.example.yanolja.ui.view.adapter.NewHotAdapter
import com.example.yanolja.ui.view.adapter.TodayPriceAdapter
import com.example.yanolja.ui.view.adapter.TripAreaAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home){

    private lateinit var newHotAdapter: NewHotAdapter
    private lateinit var gridAdapter: NewHotAdapter
    private lateinit var todayPriceAdapter: TodayPriceAdapter
    private lateinit var tripAreaAdapter: TripAreaAdapter
    private var homeDataSource: RecommendDataSource = LocalRecDataSource()

    override fun initView() {
        initHomeTab()
        initNewHotAdapter()
        initGridAdapter()
        initTodayPriceAdapter()
        initTripAreaAdapter()
    }

    private fun initHomeTab() {
        //vpadapter 달기
//        val tabLayout = binding.tabMain
//        TabLayoutMediator(tabLayout, binding.vpHome) { tab, position ->
//        }.attach()
    }

    private fun initNewHotAdapter() {
        newHotAdapter = NewHotAdapter()
        binding.rvNewHot.adapter = newHotAdapter
        newHotAdapter.contentList = homeDataSource.fetchNewHotItem()
        newHotAdapter.notifyDataSetChanged()
    }

    private fun initGridAdapter() {
        gridAdapter = NewHotAdapter()
        binding.rvBtn.adapter = gridAdapter
        gridAdapter.contentList = homeDataSource.fetchGridItem()
        gridAdapter.notifyDataSetChanged()
    }

    private fun initTodayPriceAdapter() {
        todayPriceAdapter = TodayPriceAdapter()
        binding.rvTodayPrice.adapter = todayPriceAdapter
        todayPriceAdapter.contentList = homeDataSource.fetchTodayPriceItem()
        todayPriceAdapter.notifyDataSetChanged()
    }

    private fun initTripAreaAdapter() {
        tripAreaAdapter = TripAreaAdapter()
        binding.rvTripArea.adapter = tripAreaAdapter
        tripAreaAdapter.contentList = homeDataSource.fetchTripAreaItem()
        tripAreaAdapter.notifyDataSetChanged()
    }
}