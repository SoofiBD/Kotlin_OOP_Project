package com.example.kotlin_oop_project

class SuperMusician {
    class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {

        fun sing() {
            println("nothing else matters")
        }


    }
}