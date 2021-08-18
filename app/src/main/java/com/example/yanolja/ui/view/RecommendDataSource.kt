package com.example.yanolja.ui.view

interface RecommendDataSource {
    fun fetchNewHotItem(): MutableList<String>
    fun fetchGridItem(): MutableList<String>
    fun fetchTodayPriceItem(): MutableList<TodayPriceItem>
    fun fetchTripAreaItem(): MutableList<TripAreaItem>
}