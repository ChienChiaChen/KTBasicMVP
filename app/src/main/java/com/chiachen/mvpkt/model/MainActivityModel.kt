package com.chiachen.mvpkt.model

import com.chiachen.mvpkt.contract.ContractInterface

/**
 * Created by jianjiacheng on 2018/7/3.
 */

//https://medium.com/mindorks/android-mvp-pattern-debunked-for-beginners-kotlin-c56c888222e0
class MainActivityModel : ContractInterface.Model {

    private var mCounter = 0

    override fun getCounter(): Int {
       return mCounter
    }

    override fun incrementCounter() {
        mCounter++
    }
}