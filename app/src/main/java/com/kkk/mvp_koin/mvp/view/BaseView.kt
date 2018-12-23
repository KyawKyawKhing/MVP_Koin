package com.kkk.mvp_koin.mvp.view

import com.kkk.mvp_koin.mvp.presenter.BasePresenter

interface BaseView<out P:BasePresenter<*>>{
    val presenter:P
}