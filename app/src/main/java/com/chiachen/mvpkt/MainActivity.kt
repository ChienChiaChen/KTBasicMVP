package com.chiachen.mvpkt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.chiachen.mvpkt.contract.ContractInterface
import com.chiachen.mvpkt.model.MainActivityModel
import com.chiachen.mvpkt.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ContractInterface.View {

    private var presenter: ContractInterface.Presenter? = null
    private var model:ContractInterface.Model = MainActivityModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this,model)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}
