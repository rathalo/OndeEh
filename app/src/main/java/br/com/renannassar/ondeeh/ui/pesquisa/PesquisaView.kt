package br.com.renannassar.ondeeh.ui.pesquisa

import br.com.renannassar.ondeeh.base.BaseView
import br.com.renannassar.ondeeh.model.Endereco

interface PesquisaView:BaseView {
    fun atualizaEndereco(endereco: Endereco)


    fun showErro(erro:String)


    fun showLoading()


    fun hideLoading()

}