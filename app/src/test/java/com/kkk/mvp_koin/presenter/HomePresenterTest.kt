package com.kkk.mvp_koin.presenter

import com.kkk.mvp_koin.di.testAppModule
import com.kkk.mvp_koin.mvp.contract.HomeContract
import com.kkk.mvp_koin.network.DataRepository.NoticeRepository
import com.kkk.mvp_koin.network.DataRepository.NoticeRepositoryImpl
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.parameter.parametersOf
import org.koin.standalone.StandAloneContext
import org.koin.standalone.inject
import org.koin.test.KoinTest
import org.mockito.Mockito.mock

class HomePresenterTest : KoinTest {
    private val view: HomeContract.View = mock(HomeContract.View::class.java)
    private val presenter: HomeContract.Presenter by inject<HomeContract.Presenter> { parametersOf(view) }
    private val repository: NoticeRepository = mock(NoticeRepositoryImpl::class.java)

    @Before
    fun before() {
        StandAloneContext.startKoin(testAppModule)
    }

    @After
    fun after() {
        StandAloneContext.stopKoin()
    }

    @Test
    fun getNoticeList() {
        presenter.loadNoticeList()
        view.displayNoticetList(emptyList())
        view.displayError("no error")
        //then
//        then(view).should().displayNoticetList(emptyList())
    }

}