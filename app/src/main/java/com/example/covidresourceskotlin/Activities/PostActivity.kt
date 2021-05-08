package com.example.covidresourceskotlin.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.covidresourceskotlin.R
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        val cities = resources.getStringArray(R.array.cities)
        val arrayAdapter = ArrayAdapter(this, R.layout.drop_down_item, cities)
        autoComplete.setAdapter(arrayAdapter)

        post.setOnClickListener{
            Toast.makeText(this,autoComplete.text,Toast.LENGTH_SHORT).show()
        }

        addImage.setOnClickListener{




        }

    }
}