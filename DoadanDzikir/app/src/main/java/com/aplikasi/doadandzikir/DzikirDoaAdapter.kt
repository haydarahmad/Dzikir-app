package com.aplikasi.doadandzikir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>) :
    RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //  Inisialisasi View dari Layout row_item_dzikir_doa.xml
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvlafaz: TextView = view.findViewById(R.id.tv_lafaz)
        val tvTerjemahan: TextView = view.findViewById(R.id.tv_terjemah)
    }

    //  Digunakan untuk memanggilkan data sesuai dengan view yang ada
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    //  Mengikat View dengan data class
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvDesc.text = listDzikirDoa[position].desc
        holder.tvlafaz.text = listDzikirDoa[position].lafaz
        holder.tvTerjemahan.text = listDzikirDoa[position].terjemahan
    }

    override fun getItemCount() = listDzikirDoa.size
}