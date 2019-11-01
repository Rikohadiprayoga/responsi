package com.example.responsi_092

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_register.*

class REGISTER : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val NAMA = findViewById<EditText>(R.id.ET_NAMA)
        val NIM  = findViewById<EditText>(R.id.ET_NIM)
        val USERNAME = findViewById<EditText>(R.id.ET_USERNAME)
        val EMAIL  = findViewById<EditText>(R.id.ET_EMAIL)
        val PASSWORD = findViewById<EditText>(R.id.ET_PASSOWRD)

        BT_REGISTER .setOnClickListener(){
            val Nama  = NAMA.text.toString()
            val nim  = NIM.text.toString()
            val email  = EMAIL.text.toString()
            val username   = USERNAME.text.toString()
            val password  = PASSWORD.text.toString()

            val intent = Intent(this,AccountActivity::class.java)
            intent.putExtra("nama",Nama)
            intent.putExtra("nim",nim)
            intent.putExtra("email",email)
            intent.putExtra("username",username)
            intent.putExtra("password",password)

            startActivity(intent)

        }
    }
}
