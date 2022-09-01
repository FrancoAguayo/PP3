package com.example.GetAndSet

class Registro {

    var nombre: String=""
        get() {
            return field.uppercase()
        }
        set(value) {
            if(value=="Osama Bin Laden"){
                llamarFBI(value)
            }
            else{
                field = value
            }
        }
    var edad: Int=0
    fun mensaje(nombre: String){
        println("Se ingresó ${nombre}")
    }
    constructor(nombre: String, edad: Int){
        this.nombre=nombre
        this.edad=edad
    }
    fun llamarFBI(nombre: String){
        println("Intruso detectado llamado $nombre. FBI en camino")
    }
}