package com.davidmartinez.calculadoraderesistencias

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.text.toDouble as textToDouble

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_convertir.setOnClickListener {
            val banda1 = sp_banda1.selectedItemPosition
            val banda2 = sp_banda2.selectedItemPosition
            val banda3 = sp_banda3.selectedItemPosition.toDouble()
            val resultado: String
            val diez= 10


            resultado= "$banda1$banda2"
            //tv_resultado.text = "valor:   $resultado Ohms"
            var resultado2= resultado.textToDouble()
            resultado2= resultado2*Math.pow(diez.toDouble(),banda3)
            tv_resultado.text = "valor:   ${resultado2.toInt()} Ohms"
            animation_view.playAnimation()
        }
    }

}




