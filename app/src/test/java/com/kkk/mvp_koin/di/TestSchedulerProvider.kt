package com.kkk.mvp_koin.di

import com.kkk.mvp_koin.network.rx.ScheduleProvider
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

class TestSchedulerProvider: ScheduleProvider {
    override fun io(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun mainThread(): Scheduler {
        return Schedulers.trampoline()
    }
}