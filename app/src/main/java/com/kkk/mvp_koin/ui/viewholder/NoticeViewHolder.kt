package com.kkk.mvp_koin.ui.viewholder

import android.view.View
import android.widget.TextView
import com.kkk.mvp_koin.R
import com.kkk.mvp_koin.network.NetworkResponse.Notice
import kotlinx.android.synthetic.main.list_item_notice.view.*

class NoticeViewHolder(itemView: View, private val homeDelegate: String) : BaseViewHolder<Notice>(itemView) {

    override fun setData(data: Notice) {
        with(itemView) {
            txtNoticeTitle.text = data.title
            txtNoticeBrief.text = data.brief
            txtNoticeFilePath.text = data.fileSource
            txtNoticeFilePath.setOnClickListener { data.fileSource }
        }
    }
}
