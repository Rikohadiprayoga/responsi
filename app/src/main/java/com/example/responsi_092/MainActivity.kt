package com.example.responsi_092

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username= findViewById<EditText>(R.id.ET_username)
        val password= findViewById<EditText>(R.id.ET_password)


        val bundle = intent.extras
        val Username = bundle?.get("username")
        val Password = bundle?.get("password")

        BT_login.setOnClickListener(){
        if (username.text.isEmpty()||password.text.isEmpty()){
            Toast.makeText(applicationContext, "coba lagi",Toast.LENGTH_LONG).show()

        }else if (username.text.toString()== "riko" && password.text.toString()== "riko123"){
             intent = Intent (this,MainActivity::class.java)
            Toast.makeText(applicationContext,"Berhasil",Toast.LENGTH_LONG).show()

            startActivity(intent)

        }else {
            Toast.makeText(applicationContext,"username dan password salah",Toast.LENGTH_LONG).show()
        }
            BT_Register.setOnClickListener(){
                intent = Intent(this, REGISTER:: class.java)

                startActivity(intent)
            }


        }

    }
}

