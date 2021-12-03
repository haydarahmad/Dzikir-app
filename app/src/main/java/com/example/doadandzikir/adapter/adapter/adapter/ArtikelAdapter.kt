package com.example.doadandzikir.adapter.adapter.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.R
import com.example.doadandzikir.adapter.adapter.DetailArtikelActivity
import com.example.doadandzikir.adapter.adapter.artikel

class ArtikelAdapter (private val listArtikel: ArrayList<artikel> ) :
    RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {
  inner class MyViewHolder(view:View):RecyclerView.ViewHolder(view) {
          val ImgArtikel:ImageView = view.findViewById(R.id.img_artikel)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return  MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_item_artikel,parent,false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.ImgArtikel.setImageResource(listArtikel[position].imgArtikel)

        holder.ImgArtikel.setOnClickListener {
              val intent = Intent (holder.itemView.context, DetailArtikelActivity::class.java)
            intent.putExtra(DetailArtikelActivity.Data_TITLE,listArtikel[position].titleArtikel)
            intent.putExtra(DetailArtikelActivity.Data_Desc,listArtikel[position].descArtikel)
            intent.putExtra(DetailArtikelActivity.Data_IMAGE,listArtikel[position].imgArtikel)
            holder.itemView.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return  listArtikel.size
    }
}