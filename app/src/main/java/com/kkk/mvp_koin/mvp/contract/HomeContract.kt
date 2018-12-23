package com.kkk.mvp_koin.mvp.contract

import com.kkk.mvp_koin.mvp.presenter.BasePresenter
import com.kkk.mvp_koin.mvp.view.BaseView
import com.kkk.mvp_koin.network.NetworkResponse.Notice

class HomeContract{
    interface View:BaseView<Presenter>{
        fun displayNoticetList(dataList:List<Notice>)
        fun displayError(error:String)
    }
    interface Presenter:BasePresenter<View>{
        fun loadNoticeList()
    }
}