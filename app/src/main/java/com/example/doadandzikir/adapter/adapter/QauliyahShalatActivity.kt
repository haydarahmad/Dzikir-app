package com.example.doadandzikir.adapter.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.R
import com.example.doadandzikir.adapter.adapter.adapter.DzikirDoaAdapter

class QauliyahShalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qauliyah_shalat)
        val rvQauliyah =findViewById<RecyclerView>(R.id.rv_Qauliyah_shalat)
        rvQauliyah.layoutManager = LinearLayoutManager(this)
        rvQauliyah.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}