package com.example.yanolja.ui.view

class LocalRecDataSource : RecommendDataSource {
    override fun fetchNewHotItem(): MutableList<String> {
        return mutableListOf<String>(
            "고속버스", "풀빌라", "물놀이특가", "아이야놀자", "호캉스패키지", "맛집"
        )
    }

    override fun fetchGridItem(): MutableList<String> {
        return mutableListOf(
            "돈버는놀테크", "코인뽑기머신", "나만의쿠폰", "카드할인", "8월혜택모음", "선착순쿠폰", "무한쿠폰룸", "모텔특가", "호텔특가", "펜션특가"
        )
    }

    override fun fetchTodayPriceItem(): MutableList<TodayPriceItem> {
        return mutableListOf(
            TodayPriceItem("단, 7일!~111", "소노 호텔&리조트", "9만원대부터", "대충 이미지링크"),
            TodayPriceItem("단, 7일!~222", "소노 호텔&리조트", "9만원대부터", "대충 이미지링크"),
            TodayPriceItem("단, 7일!~222", "소노 호텔&리조트", "9만원대부터", "대충 이미지링크")
        )
    }

    override fun fetchTripAreaItem(): MutableList<TripAreaItem> {
        return mutableListOf(
            TripAreaItem("이미지 링크", "제주도11"),
            TripAreaItem("이미지 링크", "제주도22"),
            TripAreaItem("이미지 링크", "제주도33"),
            TripAreaItem("이미지 링크", "제주도44")
        )
    }
}