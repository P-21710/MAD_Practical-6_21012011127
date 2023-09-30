package com.prasadrajyaguru.mad_practical_6_21012011127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Play : FloatingActionButton = findViewById(R.id.play_btn)
        val Stop : FloatingActionButton = findViewById(R.id.stop_btn)
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