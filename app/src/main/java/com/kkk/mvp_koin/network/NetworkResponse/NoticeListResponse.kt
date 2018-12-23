package com.kkk.mvp_koin.network.NetworkResponse

import com.google.gson.annotations.SerializedName

class NoticeListResponse {
    @SerializedName("notice_list")
    var noticeList: List<Notice>? = ArrayList()
}

class Notice {
    @SerializedName("id")
    var id: String? = null
    @SerializedName("title")
    var title: String? = null
    @SerializedName("brief")
    var brief: String? = null
    @SerializedName("filesource")
    var fileSource: String? = null
}
