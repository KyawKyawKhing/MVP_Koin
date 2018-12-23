package com.kkk.mvp_koin.network.rx

import io.reactivex.Scheduler


interface ScheduleProvider {
    fun io(): Scheduler
    fun mainThread():Scheduler
}