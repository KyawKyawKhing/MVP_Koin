package com.kkk.mvp_koin.network.DataRepository

import com.kkk.mvp_koin.network.NetworkResponse.Notice
import com.kkk.mvp_koin.network.NetworkResponse.NoticeListResponse
import io.reactivex.Observable

interface NoticeRepository{
    fun getNoticeList(): Observable<NoticeListResponse>
}