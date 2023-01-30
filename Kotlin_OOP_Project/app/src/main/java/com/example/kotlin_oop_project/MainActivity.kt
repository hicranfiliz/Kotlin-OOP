package com.example.kotlin_oop_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.runInterruptible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // String class'indan bir nesne olusturmus oldum..
        //var name : String ="myString"

        var myUser=User("Ravza",10)
        //myUser.name="Hicran"
        //myUser.age=22
        myUser.name="Pelin"
        myUser.age=23

        println(myUser.name)
         println(myUser.age.toString())
    }
}