package com.example.kotlin_oop_project

class Dog {
    class Dog : Animal() {

        fun test() {
            super.sing()
        }

        override fun sing() {
            println("dog class")
        }
}
}