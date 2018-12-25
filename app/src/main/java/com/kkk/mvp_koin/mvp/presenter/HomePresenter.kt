package com.kkk.mvp_koin.mvp.presenter

import android.annotation.SuppressLint
import android.support.annotation.MainThread
import com.kkk.mvp_koin.mvp.contract.HomeContract
import com.kkk.mvp_koin.network.DataRepository.NoticeRepository
import com.kkk.mvp_koin.network.rx.AndroidSchedulerProvider
import com.kkk.mvp_koin.network.rx.ScheduleProvider
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class HomePresenter(
    private val repository: NoticeRepository,
    private val schedulerProvider: ScheduleProvider,
    override var view: HomeContract.View
) : BasePresenter<HomeContract.View>, HomeContract.Presenter {

    private val compositeDisposable = CompositeDisposable()

    override fun loadNoticeList() {
        compositeDisposable.add(
            repository.getNoticeList()
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.mainThread())
                .subscribe({
                    view.displayNoticetList(it.noticeList!!)
                },
                    {
                        view.displayError(it.localizedMessage)
                    })
        )
    }

    override fun onDestory() {
        compositeDisposable.clear()
    }

}