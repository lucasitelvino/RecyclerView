package com.recyclerview

import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContatoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val cont: TextView?=itemView.findViewById(R.id.tv_cont)
    val nome: TextView?=itemView.findViewById(R.id.tv_nome)
    val email: TextView?=itemView.findViewById(R.id.tv_email)
}
