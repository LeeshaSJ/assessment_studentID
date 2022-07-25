package com.example.assessment_studentid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnAddCar).setOnClickListener {
            val intent = Intent(this,AddCarActivity::class.java)
            startActivity(intent)
        }

    }
}