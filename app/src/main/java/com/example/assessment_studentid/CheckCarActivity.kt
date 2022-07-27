package com.example.assessment_studentid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CheckCarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_car)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Check Car"

        val brand = findViewById<EditText>(R.id.txtCarBrand)
        val model = findViewById<EditText>(R.id.txtCarModel)
        val price = findViewById<TextView>(R.id.txtCarPrice)
        val db = DBHelper(baseContext, null)

        findViewById<Button>(R.id.btnCheckPrice).setOnClickListener {
            val c = db.getPrice(brand.text.toString(), model.text.toString()).toString()
            price.text = c
        }
    }
}