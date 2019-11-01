package com.example.responsi_092

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvgambar = findViewById(R.id.rv_gambar)
        gambar.setHasFixedSize(true)
        List.addAll(detail.listgambar)
        show



    }
}
