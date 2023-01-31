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

        // Lambda expressions
        // bir fonksiyonu tek bir satirda yazmak icin kullanilan yazim.
        // fonksiyonu body olara degil hemen inputunu alip outputunu dondurecegi olayini vermemizi saglar.

        fun printString(myString: String) {
            println(myString)
        }
        printString("my Test String")

        // bunu tek satirda birebir lambda gosterimiyle yazalim
        val testString = { myString: String -> println(myString) }
        testString("my lambda string")

        val multiplyLambda = { x: Int, y: Int -> println(x * y) }
        multiplyLambda(3, 5)

        // ayni islemin farkli yazilisi:
        val multiplyLambda2: (Int, Int) -> Int = { x, y -> x * y }
        println(multiplyLambda2(5, 8))

        // lambda gostermleri genelde internetten bir veri indirirken, internetteki islemlerle calisirken kullanilir.
        // Cunku asyncron denilen islemler var
        // asynchrnous :genelde bir islem uzun surerken onu beklemeyip diger islemlerin devam etmesş icin bunu yapariz.
        // callback function :  islem bittikten sonra ne olacak
        // listener function :  islemi dinler bitti mi bitmedi mi
        // completion function : tamamlanma fonksiyonu. tamamlandiginda ne yapacagim

        fun downloadMusicians(url: String, completion: (Musician) -> Unit) {
            // bu gec inecekse indigini bana haber veren fonksiyonlara ihtiyacim var.
            // Burada lambda gsoterimleri cok kullanilir.
            val kirk = Musician("Kirk", "Guitaar", 50)
            completion(kirk)
        }

        downloadMusicians("metallica.com", { musician ->
            // println icine kirk'un ozelliklerini verebilirm. Bu "it" ile yapilir.
            // Ya da it yazan yere kendi obje ismimi verebilri.
            println(musician.name)
        })
    }
}