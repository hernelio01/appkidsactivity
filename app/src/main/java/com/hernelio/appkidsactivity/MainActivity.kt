package com.hernelio.appkidsactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import com.hernelio.appkidsactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var imagenes1: ImageView


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)

        texto = binding.texto
        imagenes1 = binding.imageView2

       // setContentView(R.layout.activity_main)
        setContentView(binding.root)
    }

    fun radio1(view: View){

        if (view.getId()==R.id.radio1){
            texto.setText("OSO")
            imagenes1.setImageResource(R.drawable.oso)
        }
        if (view.getId()==R.id.radio2){
            texto.setText("Flor")
            imagenes1.setImageResource(R.drawable.flor)
        }

        if (view.getId()==R.id.radio3){
            texto.setText("Niña")
            imagenes1.setImageResource(R.drawable.ni_a)
        }
        if (view.getId()==R.id.radio4){
            texto.setText("Pez")
            imagenes1.setImageResource(R.drawable.pez)
        }
        if (view.getId()==R.id.radio5){
            texto.setText("Perro")
            imagenes1.setImageResource(R.drawable.perro)
        }
        if (view.getId()==R.id.radio6){
            texto.setText("Agua")
            imagenes1.setImageResource(R.drawable.agua)
        }
        if (view.getId()==R.id.radio7){
            texto.setText("Azul")
            imagenes1.setImageResource(R.drawable.azul)

        }
        if (view.getId()==R.id.radio8){
            texto.setText("Sol")
            imagenes1.setImageResource(R.drawable.sol)
        }
        if (view.getId()==R.id.radio9){
            texto.setText("Gato")
            imagenes1.setImageResource(R.drawable.gato)
        }
        if (view.getId()==R.id.radio10){
            texto.setText("Pc")
            imagenes1.setImageResource(R.drawable.pc)
        }
        if (view.getId()==R.id.radio11){
            texto.setText("Rojo")
            imagenes1.setImageResource(R.drawable.rojo)
        }
        if (view.getId()==R.id.radio12){
            texto.setText("Nube")
            imagenes1.setImageResource(R.drawable.nube)
        }
        if (view.getId()==R.id.radio13){
            texto.setText("Caballo")
            imagenes1.setImageResource(R.drawable.caballo)
        }
        if (view.getId()==R.id.radio14){
            texto.setText("Niño")
            imagenes1.setImageResource(R.drawable.ni_o)
        }
        if (view.getId()==R.id.radio15){
            texto.setText("Verde")
            imagenes1.setImageResource(R.drawable.verde)
        }
        if (view.getId()==R.id.radio16){
            texto.setText("Gota")
            imagenes1.setImageResource(R.drawable.gota)
        }

    }
}