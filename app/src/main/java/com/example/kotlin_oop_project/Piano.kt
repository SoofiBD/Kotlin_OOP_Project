package com.example.kotlin_oop_project

class Piano {
    class Piano : HouseDecor, Instrument {


        override var roomName: String
            get() = "Kitchen"
            set(value) {}


        var brand: String? = null
        var digital : Boolean? = null
    }
}