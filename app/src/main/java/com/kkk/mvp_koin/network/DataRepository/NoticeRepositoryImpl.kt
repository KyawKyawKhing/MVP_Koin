package com.kkk.mvp_koin.network.DataRepository

import com.kkk.mvp_koin.network.ApiService
import com.kkk.mvp_koin.network.NetworkResponse.Notice
import com.kkk.mvp_koin.network.NetworkResponse.NoticeListResponse
import io.reactivex.Observable

class NoticeRepositoryImpl(private val apiService: ApiService):NoticeRepository{
    override fun getNoticeList(): Observable<NoticeListResponse> {
        return apiService.fetchNoticeList()
    }

}