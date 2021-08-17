package com.sun.anrdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread.sleep(60000)
        Toast.makeText(this,"aa",Toast.LENGTH_SHORT)
        tv_text_view.setOnClickListener {
            Thread.sleep(60000)
        }
    }
}