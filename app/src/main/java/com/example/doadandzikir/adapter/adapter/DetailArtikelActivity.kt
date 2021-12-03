package com.example.doadandzikir.adapter.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.doadandzikir.R
import com.example.doadandzikir.R.id.tv_detail_desc

class DetailArtikelActivity : AppCompatActivity() {

    companion object {
        const val Data_TITLE = "title"
        const val Data_Desc = "desc"
        const val Data_IMAGE = "image"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_artikel)

        val dataTitle = intent.getStringExtra(Data_TITLE)
        val datadesc = intent.getStringExtra(Data_Desc)
        val dataImage = intent.getIntExtra(Data_IMAGE,0)

        val tvtitle: TextView = findViewById(tv_detail_desc)
        tvtitle.text = dataTitle
        val tvDesc:TextView =findViewById(tv_detail_desc)
        tvDesc.text=datadesc
        val imgArtikel = findViewById<ImageView>(R.id.img_detail)
        imgArtikel.setImageResource(dataImage)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}