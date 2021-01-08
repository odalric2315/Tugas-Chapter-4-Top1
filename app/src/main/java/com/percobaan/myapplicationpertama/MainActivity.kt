package com.percobaan.myapplicationpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageview = findViewById<ImageView>(R.id.imageview)
        val button : Button = findViewById(R.id.button)
        Picasso.get()
            .load("https://images.app.goo.gl/pV1PDfngAsPUpiuM8")
            .into(imageview);
        button.setOnClickListener {
            Log.d("BINARIAN", "NAMAKU ODALRIC")
        }
    }
}