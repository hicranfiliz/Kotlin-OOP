package com.example.kotlin_oop_project

// constructor yapip inheritance'i kullanabiliyoruz.
class Dog : Animal() {
    fun test() {
        // super: kalitim aldigi sinifa miras verir.
        super.sing()
    }

    override fun sing() {
        println("Dog class sing")
    }
}