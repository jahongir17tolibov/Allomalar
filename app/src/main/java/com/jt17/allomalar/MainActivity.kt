package com.jt17.allomalar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a_Navoi = findViewById<MaterialCardView>(R.id.navoi)
        val beruni = findViewById<MaterialCardView>(R.id.beruniy)
        val a_ibnSino = findViewById<MaterialCardView>(R.id.sino)
        val xorazmi = findViewById<MaterialCardView>(R.id.xorazmiy)
        val bobur = findViewById<MaterialCardView>(R.id.bobur)
        val ulug = findViewById<MaterialCardView>(R.id.ulugbek)
        val share = findViewById<ImageView>(R.id.share)

        share.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "https://t.me/JT1771TJ")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share Via"))
        }

        /** Navoiy get info text */
        a_Navoi.setOnClickListener {
            setted("Alisher Navoiy", R.string.navoi_wiki)
        }

        /** Beruniy get info text */
        beruni.setOnClickListener {
            setted("Abu Rayhon Beruniy", R.string.beruniy_wiki)
        }

        /** Ibn Sino get info text */
        a_ibnSino.setOnClickListener {
            setted("Abu Ali ibn Sino", R.string.ibn_sino_wiki)
        }

        /** Xorazmiy get info text */
        xorazmi.setOnClickListener {
            setted("Muhammad al-Xorazmiy", R.string.xorazmiy_wiki)
        }

        /** Bobur get info text */
        bobur.setOnClickListener {
            setted("Zahiriddin Muhammad Bobur", R.string.bobur_wiki)
        }

        /** Ulugbek get info text */
        ulug.setOnClickListener {
            setted("Mirzo Ulug`bek", R.string.ulugber_wiki)
        }
    }

    private fun setted(top_text: String, named: Int) {
        val intent = Intent(this, info_page::class.java)
        intent.putExtra("mess1", top_text)
        intent.putExtra("info1", getString(named))
        startActivity(intent)
    }
}