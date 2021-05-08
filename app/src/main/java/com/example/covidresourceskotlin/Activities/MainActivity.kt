package com.example.covidresourceskotlin.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.covidresourceskotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        covid.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, CovidCases::class.java)
            startActivity(intent)

        })

        beds.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, BedAvailablityActivity::class.java)
            startActivity(intent)
        })



    }
}