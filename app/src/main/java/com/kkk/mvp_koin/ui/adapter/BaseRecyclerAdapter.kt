package com.kkk.mvp_koin.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import com.kkk.mvp_koin.ui.viewholder.BaseViewHolder
import java.util.ArrayList


abstract class BaseRecyclerAdapter<V : BaseViewHolder<O>, O>(context: Context) : RecyclerView.Adapter<V>() {
    protected var mDataList: List<O>
    protected var mInflater: LayoutInflater

    init {
        mDataList = ArrayList()
        mInflater = LayoutInflater.from(context)
    }

    override fun onBindViewHolder(holder: V, position: Int) {
        holder.setData(mDataList[position])
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    fun setNewList(newList: List<O>) {
        mDataList = newList
        notifyDataSetChanged()
    }
}
