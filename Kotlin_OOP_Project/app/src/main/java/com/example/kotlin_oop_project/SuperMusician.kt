package com.example.kotlin_oop_project

class SuperMusician(name: String, instrument: String, age: Int) :
    MusicianPrivate(name, instrument, age) {
    fun sing(){
        println("Nothing else matters")
    }
}