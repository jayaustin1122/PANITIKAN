package com.example.pampanitikan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.navigation.Navigation.findNavController

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)

        // Hide the action bar
        (this as? AppCompatActivity)?.supportActionBar?.hide()

    }

    override fun onDestroy() {
        super.onDestroy()
        (this as? AppCompatActivity)?.supportActionBar?.show()
        supportActionBar?.hide()
    }
}