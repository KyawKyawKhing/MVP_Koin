package com.kkk.mvp_koin.di

import com.kkk.mvp_koin.mvp.contract.HomeContract
import com.kkk.mvp_koin.mvp.presenter.HomePresenter
import com.kkk.mvp_koin.network.ApiService
import com.kkk.mvp_koin.network.DataRepository.NoticeRepository
import com.kkk.mvp_koin.network.DataRepository.NoticeRepositoryImpl
import com.kkk.mvp_koin.network.rx.AndroidSchedulerProvider
import com.kkk.mvp_koin.network.rx.ScheduleProvider
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext
import org.koin.dsl.module.module


val noticeModule = module(definition = {

    //provide data repository
    single<NoticeRepository> { NoticeRepositoryImpl(get()) }
    //Presenter for Home
    factory<HomeContract.Presenter> { (view:HomeContract.View) -> HomePresenter(get(),get(),view)}

})

val rxModule = module {
    //provide schedule provider
    factory<ScheduleProvider> { AndroidSchedulerProvider() }
}

val appModule = listOf<Module>(remoteDatasourceModule, rxModule, noticeModule)
