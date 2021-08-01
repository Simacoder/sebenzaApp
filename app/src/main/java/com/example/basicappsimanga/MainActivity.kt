package com.example.basicappsimanga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val actionBar = supportActionBar
        actionBar!!.title ="Home Page"

        val secondActivityBtn = findViewById<Button>(R.id.secondActivityBtn)
        secondActivityBtn.setOnClickListener{
            val intent = Intent(this, secondpage::class.java)
            startActivity(intent)
        }


        fun getSet(view: View){
            val editTxt = findViewById<EditText>(R.id.streetAddresInput)
            val msg = editTxt.text.toString()
            val texView =findViewById<TextView>(R.id.bottomTextView).apply{
                text = msg
            }

        }

    }

    fun getSet(view: View) {}
}