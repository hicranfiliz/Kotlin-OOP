package com.example.kotlin_oop_project

// Musician class'ina ulasilmasin istiyorsam bu:
// Sadece okunabilsin ama degistirilemesin istiyorsam..
class MusicianPrivate(name: String, instrument: String, age: Int) {
    var name: String? = name
        private set
        get


    private var instrument: String? = instrument
     var age: Int? = age
        private set
        get

    private val bandName:String="Metallica"
    fun returnBandName(password:String):String{
        if (password == "h5") {
            return bandName
        }else{
            return "Wrong password!"
        }
    }
}