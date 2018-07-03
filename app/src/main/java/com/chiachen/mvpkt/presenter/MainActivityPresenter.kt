package com.chiachen.mvpkt.presenter

import com.chiachen.mvpkt.contract.ContractInterface

/**
 * Created by jianjiacheng on 2018/7/3.
 */

class MainActivityPresenter(view: ContractInterface.View, model:ContractInterface.Model) : ContractInterface.Presenter {

    private var mView: ContractInterface.View = view
    private var mModel: ContractInterface.Model = model

    init {
        mView.initView()
    }

    override fun incrementValue() {
        mModel.incrementCounter()
        mView.updateViewData()
    }

    override fun getCounter() = mModel.getCounter().toString()

}