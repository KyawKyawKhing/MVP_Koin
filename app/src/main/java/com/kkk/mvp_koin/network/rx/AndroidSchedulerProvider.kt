package com.kkk.mvp_koin.network.rx

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class AndroidSchedulerProvider:ScheduleProvider {
    override fun io(): Scheduler {
        return Schedulers.io()
    }

    override fun mainThread(): Scheduler {
       return AndroidSchedulers.mainThread()
    }
}