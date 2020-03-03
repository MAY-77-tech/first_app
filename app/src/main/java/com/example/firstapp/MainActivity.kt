package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener {
            Toast.makeText(applicationContext, "Count : ${txtCount.text}", Toast.LENGTH_LONG).show()
        }

        btnCount.setOnClickListener {
            var count: Int = txtCount.text.toString().toInt()
            count++
            txtCount.text = count.toString()
        }
    }

}
