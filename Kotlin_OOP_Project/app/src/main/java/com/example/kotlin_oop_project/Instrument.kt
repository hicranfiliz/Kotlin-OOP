package com.example.kotlin_oop_project

interface Instrument {
    // %100 abstract
    // Kotlinde property'ler initialize edilmez. Bunu implemente ettigimiz siniflarda initial etmemiz gerekiyor.
    // javada ise tam tersi intial etmek zorunlu

    // interface'lerde kod logu olmadan boylece birakabiliyorm..
    // javada -> body yapilmaz.
    // kotlinde body ve body'siz yazabiliyorum.
    fun info() {
        println("Instument info")
    }
}