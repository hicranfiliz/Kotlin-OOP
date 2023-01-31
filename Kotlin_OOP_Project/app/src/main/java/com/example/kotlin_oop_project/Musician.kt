package com.example.kotlin_oop_project

// Musician class'ina ulasilsin istiyorsam bu:
// class'lar default olarak final gelir. Baska yerde kullanilmaz,inheritance alinmaz. Open'a cekersek ineritance alabiliriz.
open class Musician(name: String, instrument: String, age: Int) {
    var name: String? = name
    var instrument: String? = instrument
    var age: Int? = age

}