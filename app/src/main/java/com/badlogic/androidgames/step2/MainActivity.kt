package com.badlogic.androidgames.step2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn : Button = findViewById(R.id.btnAra)
        myBtn.setOnClickListener {
            karisikSec()
        }
    }

    private fun karisikSec() {
        var randomNumber = (1..7).random()
        val myImg : ImageView = findViewById(R.id.ivPic)

        val drawableResource = when(randomNumber) {
            1 -> R.drawable.images_1
            2 -> R.drawable.images_2
            3 -> R.drawable.images_3
            4 -> R.drawable.images_4
            5 -> R.drawable.images_5
            6 -> R.drawable.images_6
            else -> R.drawable.images_7
        }
        myImg.setImageResource(drawableResource)
    }
}