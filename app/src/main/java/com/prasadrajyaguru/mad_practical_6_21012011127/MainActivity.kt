package com.prasadrajyaguru.mad_practical_6_21012011127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Play : Button = findViewById(R.id.button)
        val Stop: Button = findViewById(R.id.button2)

        Play.setOnClickListener {
            Playpause()
        }

        Stop.setOnClickListener {
            Stop()
        }
    }

    fun Playpause() {
        Intent(applicationContext, MyService::class.java).putExtra(
            MyService.PLAYERKEY,
            MyService.PLAYERVALUE
        ).apply {

            startService(this)
        }

    }

    fun Stop() {
        Intent(applicationContext, MyService::class.java).putExtra(
            MyService.PLAYERKEY,
            MyService.PLAYERVALUE
        ).apply {

            stopService(this)
        }
    }


}