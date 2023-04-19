package com.betulkircil.kent_simgeleri_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.betulkircil.kent_simgeleri_recyclerview.databinding.ActivityDetailsBinding

class Details_Activity : AppCompatActivity() {

    private lateinit var bindingDetail: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDetail = ActivityDetailsBinding.inflate(layoutInflater)   //xml ile kodu baglarken layoutinflater kullanilir
        val view = bindingDetail.root
        setContentView(view)
        val intent = intent
        val selected = intent.getSerializableExtra("landMark") as LandMark
        bindingDetail.nameText.text = selected.name
        bindingDetail.countryText.text = selected.country
        bindingDetail.imageView.setImageResource(selected.img)
    }
}