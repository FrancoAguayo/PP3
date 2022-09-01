package com.example.pp3

class Television {

    var marca : String=""
    var modelo : String=""
    var pantallaPulgadas : Int=0
    var encendido : Boolean=false
    var canal : Int=0

    constructor(marca : String,modelo : String,pantallaPulgadas : Int,encendido:Boolean,canal:Int){
        this.marca = marca
        this.modelo = modelo
        this.pantallaPulgadas = pantallaPulgadas
        this.encendido = encendido
        this.canal = canal
    }

    fun encender(){
        this.encendido = true
        println("El televisor se encendió.")

    }

    fun apagar(){
        this.encendido = false
        println("El televisor se apagó.")
    }

    fun estadoDeEncendido(){
        if (this.encendido==true){
            println("El televisor está encendido.")
        }
        else{
            println("El televisor está apagado.")
        }
    }

    fun consultarCanal(){
        if(this.encendido==true){
            println("Estás en el canal ${this.canal}")
        }
        else{
            println("El televisor está apagado. No hay nada emitiéndose.")
        }
    }

    fun cambiarCanal(){
        if(this.encendido==true){
            this.canal++
            println("Se cambió el canal en emisión.")
        }
        else{
            println("El televisor no está encendido. No puedes cambiar de canal.")
        }
    }
}