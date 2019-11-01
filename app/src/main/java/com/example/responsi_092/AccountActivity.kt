package com.example.responsi_092

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val bundle = intent.extras
        val nama = bundle?.get("nama")
        val nim = bundle?.get("nim")
        val username = bundle?.get("ussername")
        val email = bundle?.get("email")
        val password = bundle?.get("password")

        tx_nama.text =("Nama: "+(nama))
        tx_nim.text = ("Nim : "+(nim))
        tx_username.text = ("Username :"+(username))
        tx_email.text= ("email :" + (email))
        tx_password.text = ("Password :"+(password))
    }
}
