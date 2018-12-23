package com.kkk.mvp_koin

import android.app.Application
import com.kkk.mvp_koin.di.appModule
import com.kkk.mvp_koin.di.noticeModule
import com.kkk.mvp_koin.di.remoteDatasourceModule
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module

class NoticeApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, appModule)
    }
}