package com.example.sumasyrestasunaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sumasyrestasunaactivity.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener {
            val entero1=binding.cajanum1.text.toString().toInt()
            val entero2=binding.cajanum2.text.toString().toInt()
            if(binding.sumar.isChecked) {
                val suma=entero1+entero2
                binding.resultado.text = "$suma"

            }else{
                val resta=entero1-entero2
                binding.resultado.text = "$resta"
            }
        }
        binding.titulo.setOnClickListener {
            Toast.makeText(this,R.string.title,Toast.LENGTH_LONG).show()
        }

        binding.resultado.setOnClickListener {
            Snackbar.make(binding.sumar,"Aqui Calculo Resultado",Snackbar.LENGTH_LONG)
                .setAction("Sumando"){
                    println("HOLA")
                    binding.sumar.isChecked=true
                }.show()
        }

    }
}