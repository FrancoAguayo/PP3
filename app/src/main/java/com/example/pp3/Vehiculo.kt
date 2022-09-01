package com.example.pp3

import java.util.concurrent.TimeUnit

//Otra manera de declarar clases con el constructor incluido

class Vehiculo {

    var kilometraje: Int=0
        get() {
            return field
        }
        set(value) {
            if(value<=5000){
                VerificarApto(value)
            }
            else{
                field = value
            }
        }
    var marca : String=""
    var patente: String=""
    var modelo: String=""
    var anio: Int=0
    var encendido: Boolean=false
    var velocidad: Int=0
    var revoluciones: Int=0
    var luces: Boolean=false
    var distancia: Double=0.0

    constructor(kilometraje: Int,marca: String, patente:String, modelo:String, anio:Int,
                encendido:Boolean, velocidad:Int,
                revoluciones:Int,luces:Boolean,distancia: Double){
            this.marca = marca
            this.patente = patente
            this.modelo = modelo
            this.anio = anio
            this.encendido = encendido
            this.velocidad = velocidad
            this.revoluciones = revoluciones
            this.luces = luces
            this.distancia = distancia
            this.kilometraje = kilometraje
        }
    fun encender(){
        this.encendido = true
        println("El vehiculo se encendió.")
    }
    fun apagar(){
        this.encendido = false
        println("El vehiculo se apagó.")
    }
    fun estadoDeEncendido(){
        if (this.encendido==true){
            println("El vehiculo está encendido.")
        }
        else{
            println("El vehiculo está apagado.")
        }
    }
    fun acelerar(){
        while(this.encendido==true && this.velocidad!=20){
            this.velocidad=velocidad+5
            println("Acelerando. Velocidad actual: ${this.velocidad}")
            esperar()
        }
    }
    fun esperar(){
        try {
            TimeUnit.SECONDS.sleep(1)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
    fun frenar(){
        while(this.velocidad!=0){
            if(this.encendido==true){
                this.velocidad=velocidad-5
                println("Frenando. Velocidad actual: ${this.velocidad}")
            }
            esperar()
        }
    }
    fun regularVelocidad(velocidad: Int){
        if(this.velocidad>20){
            while(this.velocidad>20){
                this.velocidad--
                println("Frenando. Velocidad actual: ${this.velocidad}.")
                esperar()
            }
        }
    }
    fun recorrerDistancia(){
        while(velocidad==20 && distancia!=1.0){
            this.distancia=distancia+0.2
            println("Midiendo distancia. Distancia actual: ${this.distancia}")
            esperar()
        }
    }
    fun encenderluces(){
        this.luces=true
        println("Encendiendo luces...")
    }
    fun apagarluces(){
        this.luces=false
        println("Apagando luces...")
    }
    fun VerificarApto(kilometraje: Int){
        println("Tu auto solo tiene $kilometraje km recorridos. No necesita hacer la verificación. Vuelva otro" +
                " día.")
    }
}