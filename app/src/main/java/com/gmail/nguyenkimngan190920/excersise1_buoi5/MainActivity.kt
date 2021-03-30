package com.gmail.nguyenkimngan190920.excersise1_buoi5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    val countrySource = listOf<String>(
        "Global Fashion Group", "Orient Software Development Corp", "Netcompany", "Vinova", "Techbase Vietnam",
            "Nexus Frontier Tech", "VNG Corporation", "Sun* Inc", "Anxon Active", "Big Whale Data", "SoftOne", "AG CORP",
            "Fractal", "Tripath Vietnam Co., Ltd", "Titan Technology", "FPT Software", "LogiGear Vietnam"

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countryListView = findViewById<ListView>(R.id.countryLV)
        val countryAdapter = ArrayAdapter<String>(  this, R.layout.row_item_country ,
        R.id.nameTV,countrySource)
        countryListView.adapter = countryAdapter
    }
}