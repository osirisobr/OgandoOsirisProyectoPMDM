package com.murallaromana.dam.segundo.osirisogandoproyectopmdp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
     private lateinit var btregistrate:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btregistrate=findViewById(R.id.btregistrate)
        btregistrate.setOnClickListener(){

            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)

        }

    }
}