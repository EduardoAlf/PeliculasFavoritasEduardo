package com.alfaro.peliculasfavoritaseduardo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alfaro.peliculasfavoritaseduardo.databinding.ActivityDetailBinding
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater).apply {
            setContentView(root)

//  Obtener Valores

            val titulostr = intent.getStringExtra("TITULO")
            val descripcionstr = intent.getStringExtra("DESCRIPTION")
            val fotostr = intent.getStringExtra("FOTO")

//  Establecer Valores

            titulodetail.text = titulostr
            des.text = descripcionstr
            Picasso.get().load("fotostr").into(fotopelicula);

        }

    }



   fun cerrar(view: View){
       finish()
   }
}