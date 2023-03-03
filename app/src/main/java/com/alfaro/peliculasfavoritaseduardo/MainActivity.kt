package com.alfaro.peliculasfavoritaseduardo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.alfaro.peliculasfavoritaseduardo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            titulointro.text = "Menu Principal"
    }


            fun cambiarPantallaInception(view:View){
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("TITULO","INCEPTION")
                    putExtra("DESCRIPTION","Dom Cobb (Leonardo DiCaprio) es un ladrón con una extraña habilidad para entrar a los sueños de la gente y robarle los secretos de sus subconscientes. Su habilidad lo ha convertido en un atractivo en el mundo del espionaje corporativo, pero ha tenido un gran costo en la gente que ama.")

                }

                startActivity(intent)

            }

            fun cambiarPantalkPie(view:View){
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("TITULO","AMERICAN PIE")
                    putExtra("DESCRIPTION","Cuatro adolescentes se comprometen a perder su virginidad y hacen un pacto. Cada uno trata de ser el primero, pero se encuentran con obstáculos para lograr su objetivo.")
                }

                startActivity(intent)

            }

            fun cambiarPantallaAvengers(view:View){
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("TITULO","CAPITAN AMERICA CIVIL WAR")
                    putExtra("DESCRIPTION","Después de que otro incidente internacional, en el que se ven envueltos los Vengadores, produzca daños colaterales, la presión política obliga a poner en marcha un sistema para depurar responsabilidades.")
                }

                startActivity(intent)
            }




    }

    fun cambiarPantallaMatrix(view: View) {
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO","MATRIX")
            putExtra("DESCRIPTION","El programador informático Thomas Anderson, más conocido en el mundo de los HACKER; como Neo, está en el punto de mira del temible agente Smith. Otros dos piratas informáticos, Trinity y Morfeo, se ponen en contacto con Neo para ayudarlo a escapar. Matrix te posee. Sigue al conejo blanco.")
            putExtra("FOTO","https://www.google.com/url?sa=i&url=https%3A%2F%2Fpeople.com%2Fmovies%2Fkeanu-reeves-said-he-returned-for-matrix-4-because-of-the-beautiful-script%2F&psig=AOvVaw2x7ynh0QMeYe0yt3Rafzrb&ust=1677912367610000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCMizseeUv_0CFQAAAAAdAAAAABAR")
        }

        startActivity(intent)
    }

    fun CambiarPantallaAmericanPie(view: View) {
        val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("TITULO","AMERICAN PIE")
                putExtra("DESCRIPTION","Cuatro adolescentes se comprometen a perder su virginidad y hacen un pacto. Cada uno trata de ser el primero, pero se encuentran con obstáculos para lograr su objetivo.")
                putExtra("FOTO","https://www.google.com/url?sa=i&url=https%3A%2F%2Fmoviesanywhere.com%2Fmovie%2Famerican-pie&psig=AOvVaw1DIYX5Atv6W_fFK66KqbQH&ust=1677915304721000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCMi84N-fv_0CFQAAAAAdAAAAABAE")

            }

    startActivity(intent)
}

    fun CambiarPantallaInception(view: View) {
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO","INCEPTION")
            putExtra("DESCRIPTION","Dom Cobb (Leonardo DiCaprio) es un ladrón con una extraña habilidad para entrar a los sueños de la gente y robarle los secretos de sus subconscientes. Su habilidad lo ha convertido en un atractivo en el mundo del espionaje corporativo, pero ha tenido un gran costo en la gente que ama.")
            putExtra("FOTO","https://www.google.com/url?sa=i&url=https%3A%2F%2Felcomercio.pe%2Fluces%2Fcine%2Finception-cumple-10-anos-conoce-los-detalles-curiosos-de-la-pelicula-de-christopher-nolan-noticia%2F&psig=AOvVaw23hn-rceO8G2zuF6AftdP9&ust=1677918185913000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCLjo5L2qv_0CFQAAAAAdAAAAABAJ")

        }

        startActivity(intent)
    }

    fun CambiarPantallaCivilWar(view: View) {
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO","CIVIL WAR")
            putExtra("DESCRIPTION","Después de que otro incidente internacional, en el que se ven envueltos los Vengadores, produzca daños colaterales, la presión política obliga a poner en marcha un sistema para depurar responsabilidades.")
            putExtra("FOTO","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwipy.tv%2Fteam-captain-america-gano-civil-war%2F&psig=AOvVaw12ykzhmZ4lpujQ8PLT8scz&ust=1677918314560000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCOju9vqqv_0CFQAAAAAdAAAAABAE")

        }

        startActivity(intent)
    }

}



