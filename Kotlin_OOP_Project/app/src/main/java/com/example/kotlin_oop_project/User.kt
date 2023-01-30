package com.example.kotlin_oop_project

class User {
    // alttakiler property'ler. Yani User classi'indan urettigim nesnelerde isim ve yas ozelligi olabilir demek.
    var name: String? = null
    var age: Int? = null

    // constructor her bir obje olusturuldugunda cagrilir..
    // constructor kotlinde genelde boyle kullanilmaz. Onun yerine primary const kullanilir.
    constructor(nameInput: String, ageInput: Int) {
        this.name = nameInput
        this.age = ageInput
        println("User created")
    }

    // init : baslatici   Ayri bir islem yapacaksak const degil init kullaniyoruz.
    // Class'tan bir obje yaratildiginda ilk init cagrilir.
    init {
        println("Hello init")
    }

}