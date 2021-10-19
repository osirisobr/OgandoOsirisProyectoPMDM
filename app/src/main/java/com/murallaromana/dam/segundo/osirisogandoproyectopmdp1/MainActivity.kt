package com.murallaromana.dam.segundo.osirisogandoproyectopmdp1

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.session.MediaSession
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
     private lateinit var btregistrate:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btregistrate=findViewById(R.id.btregistrate)
        btregistrate.setOnClickListener(){

            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)

          //  val tvGuardarDatos = findViewById<TextView>(R.id.tvGuardarDatos)
          //  val etEnail = findViewById<EditText>(R.id.etEnail)

          //      tvGuardarDatos.setOnClickListener{
           //         var sharedPrefs = getPreferences(Context.MODE_PRIVATE)
           //         var editor = SharedPreferences.edit() //Iniciando transaccion
            //        editor.putString("", etEnail.text.toString())






                }




        }

    }
