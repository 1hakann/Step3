package com.badlogic.androidgames.step2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var myImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImg = findViewById(R.id.ivPic)
        val myBtn : Button = findViewById(R.id.btnAra)
        myBtn.setOnClickListener {
            karisikSec()
        }
        val resetBtn : Button = findViewById(R.id.btnReset)
        resetBtn.setOnClickListener {
            resetImg()
        }
    }

    private fun resetImg() {
        myImg = findViewById(R.id.ivPic)
        myImg.setImageResource(R.drawable.emptyness)


    }

    private fun karisikSec() {
        var randomNumber = (1..7).random()

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