package com.kkk.mvp_koin.di

import com.kkk.mvp_koin.network.rx.ScheduleProvider
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

val testRxModule = module {
    //provide schedule provider
    factory<ScheduleProvider> { TestSchedulerProvider() }
}
val testAppModule = listOf<Module>(
    testRxModule,
    remoteDatasourceModule,
    noticeModule
)