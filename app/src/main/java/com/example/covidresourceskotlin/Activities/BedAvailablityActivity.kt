package com.example.covidresourceskotlin.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.covidresourceskotlin.R
import kotlinx.android.synthetic.main.activity_bed_availablity.*

class BedAvailablityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bed_availablity)

        addResource.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,PostActivity::class.java)
            startActivity(intent)

        })




    }


}