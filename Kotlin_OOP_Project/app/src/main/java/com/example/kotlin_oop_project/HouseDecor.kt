package com.example.kotlin_oop_project


interface HouseDecor {
    // %100 abstract
    // Kotlinde property'ler initialize edilmez. Bunu implemente ettigimiz siniflarda initial etmemiz gerekiyor.
    // javada ise tam tersi intial etmek zorunlu

    var roomName: String

}