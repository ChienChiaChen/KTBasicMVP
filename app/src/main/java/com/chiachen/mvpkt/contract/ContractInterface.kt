package com.chiachen.mvpkt.contract

/**
 * Created by jianjiacheng on 2018/7/3.
 */
interface ContractInterface {

    interface View {
        fun initView()
        fun updateViewData()
    }

    interface Presenter {
        fun incrementValue()
        fun getCounter():String
    }

    interface Model {
        fun getCounter():Int
        fun incrementCounter()
    }

}