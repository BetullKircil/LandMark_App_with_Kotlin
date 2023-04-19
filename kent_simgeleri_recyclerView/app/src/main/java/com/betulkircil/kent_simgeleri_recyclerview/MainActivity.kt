package com.betulkircil.kent_simgeleri_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.betulkircil.kent_simgeleri_recyclerview.databinding.ActivityDetailsBinding
import com.betulkircil.kent_simgeleri_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landMarks: ArrayList<LandMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)   //xml ile kodu baglarken layoutinflater kullanilir
        val view = binding.root
        setContentView(view)

        landMarks = ArrayList<LandMark>()

        val pisaKulesi = LandMark("Pisa Kulesi", "İtalya", R.drawable.pisa)
        val kolezyum = LandMark("Kolezyum", "İtalya", R.drawable.kolezyum)
        val eyfel = LandMark("Eyfel", "Fransa", R.drawable.eyfel)
        val askCesmesi = LandMark("Ask Cesmesi", "İtalya", R.drawable.ask_cesmesi)

        landMarks.add(pisaKulesi)
        landMarks.add(kolezyum)
        landMarks.add(eyfel)
        landMarks.add(askCesmesi)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        val landMarkAdapter = LandMarkAdapter(landMarks)
        binding.recycler.adapter = landMarkAdapter
    }
}