package com.cxz.wanandroid.adapter

import android.content.Context
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.cxz.wanandroid.R
import com.cxz.wanandroid.mvp.model.bean.KnowledgeTreeBody

/**
 * Created by chenxz on 2018/5/9.
 */
class KnowledgeAdapter(private val context: Context?, datas: MutableList<KnowledgeTreeBody>) : BaseQuickAdapter<KnowledgeTreeBody, BaseViewHolder>(R.layout.item_knowledge_list, datas) {

    override fun convert(helper: BaseViewHolder?, item: KnowledgeTreeBody?) {
        helper?.setText(R.id.title_first, item?.name)
    }

}