package com.example.pp3

class Impresora {

    var marca : String=""
    var modelo : String=""
    var tipoHoja : String=""
    var cantidadHoja : Int =0
    var encendido : Boolean=false

    constructor(marca: String, modelo: String, tipoHoja: String, cantidadHoja: Int, encendido: Boolean){
        this.marca = marca
        this.modelo = modelo
        this.tipoHoja = tipoHoja
        this.cantidadHoja = cantidadHoja
        this.encendido = encendido
    }

    fun encender(){
        this.encendido = true
        println("La impresora se encendió.")

    }

    fun apagar(){
        this.encendido = false
        println("La impresora se apagó.")
    }

    fun estadoDeEncendido(){
        if (this.encendido==true){
            println("La impresora está encendida.")
        }
        else{
            println("La impresora está apagada.")
        }
    }

    fun consultarHojas(){
        println("Te quedan ${this.cantidadHoja} hojas.")
    }

    fun imprimir (){
        if (this.encendido==true){
            this.cantidadHoja--
            println("Se hizo una impresión.")
        }

        else if(cantidadHoja==0){
            println("No quedan hojas para imprimir.")
        }

        else{
            println("La impresora no está prendida. No se puede imprimir")
        }
    }
}