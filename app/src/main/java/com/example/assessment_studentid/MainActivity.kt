package com.example.assessment_studentid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // After clicking ADD CAR it will direct to the next activity
        findViewById<Button>(R.id.btnAddCar).setOnClickListener {
            val intent = Intent(this, AddCarActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btnCheckCar).setOnClickListener {
            val intent = Intent(this, CheckCarActivity::class.java)
            startActivity(intent)
        }
    }
}