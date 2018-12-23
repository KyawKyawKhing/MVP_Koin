package com.kkk.mvp_koin.ui.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View


abstract class BaseViewHolder<O>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun setData(data: O)
}
