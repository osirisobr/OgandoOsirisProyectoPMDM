package com.murallaromana.dam.segundo.osirisogandoproyectopmdp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistroActivity : AppCompatActivity() {
    private lateinit var btRegistro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at_acceder)
        btRegistro=findViewById(R.id.btRegistro)
        btRegistro.setOnClickListener(){

            val intent = Intent(this, RegistroActivity::class.java)

            onBackPressed()

        }








    }
}