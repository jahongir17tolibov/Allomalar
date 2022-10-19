package com.jt17.allomalar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class info_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_page)

        val back = findViewById<ImageView>(R.id.back_to)
        val tool_barTEXT = findViewById<TextView>(R.id.warrior)
        val mainText = findViewById<TextView>(R.id.text_info)

        val top_name = intent.getStringExtra("mess1")

        val main_info = intent.getStringExtra("info1")

        tool_barTEXT.text = top_name
        mainText.text = main_info

        back.setOnClickListener {
            finish()
        }

    }
}