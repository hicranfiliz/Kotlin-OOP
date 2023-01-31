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

        var myUser = User("Ravza", 10)
        //myUser.name="Hicran"
        //myUser.age=22
        myUser.name = "Pelin"
        myUser.age = 23
        println(myUser.information())

        println(myUser.name)
        println(myUser.age.toString())

        var myMusician = Musician("Hicran", "Keman", 22)
        println(myMusician.name + "-" + myMusician.instrument + "-" + myMusician.age)

        //encapsulation
        var nur = MusicianPrivate("Nur", "Gitar", 18)
        //nur.name="Şazi"
        println(nur.name + "-" + nur.age)

        println(nur.returnBandName("h5"))
        println(nur.returnBandName("as"))

        //inheritance : Bir sinifta olusturdugumuz property'leri baska siniflarda kullanabiliriz.
        var lars = SuperMusician("Katy", "Drams", 23)
        println(lars.name)
        println(lars.age)
        println(lars.returnBandName("h5"))
        lars.sing()

        //polymorphism: Ayni ismi kullanarak farkli islemler yapabilme ozelligi
        // static polymorphism : Ayni sinifta ayni isimli fonksiyonlarla yapmak istersem..
        var mathematic = Mathematic()
        println(mathematic.sum())
        println(mathematic.sum(3, 5))
        println(mathematic.sum(2, 3, 5))

        // dynamic polymorphism : Farkli siniflarla yapmak istersem:
        var animal = Animal()
        animal.sing()

        var bob = Dog()
        bob.sing()
        bob.test()

        // abstract & interface
        // neden soyut sinif olusturulur?  Soyut sinif bir instance, bir obje olusturamadigmiz siniftir.
        // Abstract genelde inheritance (kalitim) a maruz kalsin dşye kullaniyoruz.

        //var myPeople=People()
        // inheritance'in bazi limitleri var : 2 class'tan inheritance alamiyoruz.
        // Bu durumdda interface kullnarak abstract yapilar olusturulabilir ve birden fazla kalitim alabiliriz.

        var piano = Piano()
        piano.brand = "Yamaha"
        piano.digital = false
        println(piano.brand)
        println(piano.digital)
        println(piano.roomName)
        piano.info()
    }
}