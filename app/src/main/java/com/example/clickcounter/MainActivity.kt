package com.example.clickcounter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var szamlalo : TextView
    lateinit var plusz: Button
    lateinit var minusz: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        plusz.setOnClickListener{

            val eredmeny = Integer.parseInt(szamlalo.text.toString())+1;
            szamlalo.text = eredmeny.toString();
            if(eredmeny>0){
                szamlalo.setTextColor(Color.GREEN)
            }
            if(eredmeny == 0){
                szamlalo.setTextColor(Color.BLUE)
            }
        }
        minusz.setOnClickListener{

            val eredmeny = Integer.parseInt(szamlalo.text.toString())-1;
            szamlalo.text = eredmeny.toString();
            if(eredmeny == 0){
                szamlalo.setTextColor(Color.BLUE)
            }
            if(eredmeny < 0){
                szamlalo.setTextColor(Color.RED)
            }
        }
        szamlalo.setOnClickListener{
            szamlalo.text = "0";
            szamlalo.setTextColor(Color.BLUE)
        }
    }
    fun init(){
        szamlalo = findViewById(R.id.szamlalo)
        plusz = findViewById(R.id.plusz)
        minusz = findViewById(R.id.minusz)
    }
}