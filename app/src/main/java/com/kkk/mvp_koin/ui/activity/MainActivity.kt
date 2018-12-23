package com.kkk.mvp_koin.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.kkk.mvp_koin.R
import com.kkk.mvp_koin.mvp.contract.HomeContract
import com.kkk.mvp_koin.network.NetworkResponse.Notice
import com.kkk.mvp_koin.ui.adapter.NoticeListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.ParameterList
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity(), HomeContract.View {

    override val presenter: HomeContract.Presenter by inject { parametersOf(this) }

    private lateinit var mAdapter: NoticeListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAdapter = NoticeListAdapter(this@MainActivity, "")
        rvNotice.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 1) as RecyclerView.LayoutManager?
        }
        presenter.loadNoticeList()
    }


    override fun displayNoticetList(dataList: List<Notice>) {
        mAdapter.setNewList(dataList)
    }

    override fun displayError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestory()
    }
}
