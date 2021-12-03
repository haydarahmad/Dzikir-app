package com.example.doadandzikir.adapter.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.R
import com.example.doadandzikir.adapter.adapter.adapter.DzikirDoaAdapter

class HarianDzkirDoaActivity : AppCompatActivity() {

    private val listDzikir: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harian_dzkir_doa)

        val rvDzikirDoaharian = findViewById<RecyclerView>(R.id.rv_dzikir_doa_harian)
        rvDzikirDoaharian.layoutManager = LinearLayoutManager(this)
        rvDzikirDoaharian.adapter = DzikirDoaAdapter(listDzikir)
    }

    private fun initData(){
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (data in desc.indices){
            val dzikir = DzikirDoa(
                desc  [data],
                lafaz  [data],
                terjemah [data]
            )
            listDzikir.add(dzikir)
        }
        }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}