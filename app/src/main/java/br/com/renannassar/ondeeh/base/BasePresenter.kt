package br.com.renannassar.ondeeh.base


import br.com.renannassar.ondeeh.injection.component.DaggerPresenterInjector
import br.com.renannassar.ondeeh.injection.component.PresenterInjector
import br.com.renannassar.ondeeh.injection.module.ContextModule
import br.com.renannassar.ondeeh.injection.module.NetworkModule
import br.com.renannassar.ondeeh.ui.pesquisa.PesquisaPresenter

abstract class BasePresenter <out V:BaseView>(protected val view:V){

    private val injector: PresenterInjector = DaggerPresenterInjector.builder().baseView(view).contextModule(ContextModule).networkModule(NetworkModule).build()

    init {
        inject()
    }

    open fun onViewCreated(){

    }
    open fun onViewDestroyer(){

    }

    private fun inject(){
        when(this){
            is PesquisaPresenter -> injector.inject(this)
        }
    }
}