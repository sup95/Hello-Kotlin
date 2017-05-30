package com.example.ssrivatsa.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews();
    }

    private fun initViews() {
        kotlin_tap.setOnClickListener {
            hello_kotlin_text.setText("Hello Kotlin!");
            hello_kotlin_image.setImageDrawable(resources.getDrawable(R.mipmap.ic_launcher_round));
        }
    }
}
