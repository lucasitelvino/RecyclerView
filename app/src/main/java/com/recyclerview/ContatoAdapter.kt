package com.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContatoAdapter : RecyclerView.Adapter<ContatoHolder> {

    var dados:List<Contato>?=null
    var geradorView:LayoutInflater?=null

    constructor(dados: List<Contato>?, context: Context?) {
        this.dados = dados
        geradorView = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoHolder {
        return ContatoHolder(geradorView!!.inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ContatoHolder, position: Int) {
        holder.cont!!.text = (1+position).toString()
        holder.nome!!.text = dados!![position].nome
        holder.email!!.text = dados!![position].email
    }

    override fun getItemCount() = dados?.size!!
}