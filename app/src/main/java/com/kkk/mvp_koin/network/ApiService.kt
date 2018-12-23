package com.kkk.mvp_koin.network

import com.kkk.mvp_koin.network.NetworkResponse.NoticeListResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    @GET("bins/1bsqcn/")
    fun fetchNoticeList(): Observable<NoticeListResponse>
}