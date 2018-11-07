package br.com.renannassar.ondeeh.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<P: BasePresenter<BaseView>>:BaseView, AppCompatActivity(){

    protected lateinit var presenter:P

    protected abstract fun instantiatePresenter():P

    override fun getContext(): Context {
        return this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = instantiatePresenter()
    }

}