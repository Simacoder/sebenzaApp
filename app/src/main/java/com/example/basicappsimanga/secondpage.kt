package com.example.basicappsimanga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)
        val actionBar = supportActionBar
        actionBar!!.title ="Second Page"
        actionBar.setDisplayHomeAsUpEnabled(true)
        val thirdActivityBtn = findViewById<Button>(R.id.thirdActivityBtn)

        thirdActivityBtn.setOnClickListener{
            val intent = Intent(this, thirdActivity::class.java)
            startActivity(intent)
        }
    }
}