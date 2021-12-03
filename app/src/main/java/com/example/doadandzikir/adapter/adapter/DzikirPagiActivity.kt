package com.example.doadandzikir.adapter.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.R
import com.example.doadandzikir.adapter.adapter.adapter.DzikirDoaAdapter

class DzikirPagiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_pagi)

        val rvDzikirPagi = findViewById<RecyclerView>(R.id.tv_dzikir_pagi)
        rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        rvDzikirPagi.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPagi)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}