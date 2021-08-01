package com.example.basicappsimanga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        /*val  topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val  middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation)
        val  bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        topTextView.startAnimation(topAnimation)
        middleTextView.startAnimation(middleAnimation)
        bottomTextView.startAnimation(bottomAnimation)
        val mainActivityTimeOut = 4000
        val homeIntent = Intent (this@SplashScreenActivity, MainActivity::class.java)

        Handler().postDelayed({
            startActivity(homeIntent)
            finish()
        }, mainActivityTimeOut.toLong())*/

    }

    fun getSet(view: View) {}
}