package com.example.taller_v1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.taller_v1.R.id.text_n


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        variables()
        tabla()
        listado()
        vehiculo()
    }

    private fun variables(){
        val numero = 25

        if ((numero >= 18)) {
            println ("$numero es mayor de edad")

        }else if(numero < 18){
            print("$numero es menor de edad")
        }
    }

    private fun tabla(){

        //val txt_i = findViewById<EditText>(R.id.text_n)
        val txt_r = findViewById<TextView>(R.id.text_tb)
        val btn_t = findViewById<Button>(R.id.button)

        btn_t.setOnClickListener{
            var tablas = ""
            for (i in 1..10){
                tablas+= i.toString() +"x"+ txt_i.text.toString()+ "="+
                        (i*txt_i.text.toString().toInt())+"\n"
            }
            txt_r.setText(tablas)

        }

    }

    private fun listado(){

    }

    private fun vehiculo(){

    }
}