package com.chiachen.mvpkt.model

import com.chiachen.mvpkt.contract.ContractInterface

/**
 * Created by jianjiacheng on 2018/7/3.
 */

class MainActivityModel : ContractInterface.Model {

    private var mCounter = 0

    override fun getCounter(): Int {
       return mCounter
    }

    override fun incrementCounter() {
        mCounter++
    }
}