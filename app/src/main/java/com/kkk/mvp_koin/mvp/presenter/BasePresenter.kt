package com.kkk.mvp_koin.mvp.presenter

import io.reactivex.disposables.CompositeDisposable
import java.util.*

interface BasePresenter<T>{
    var view:T
    fun onDestory()
}