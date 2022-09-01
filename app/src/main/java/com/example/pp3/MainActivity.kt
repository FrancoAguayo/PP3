package com.example.pp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.concurrent.TimeUnit
import java.util.Scanner

fun main (){
//Crear objeto de clase
    var read = Scanner(System.`in`)
    var auto1 = Vehiculo(5000, "Renault","FBA268","Clio",1999,
        false,100,1,false,0.0)
    println("******************")
    if(auto1.kilometraje>5000){
        println("El auto marca ${auto1.marca} de modelo ${auto1.modelo} año ${auto1.anio}" +
                " con patente ${auto1.patente}. El auto está parado.")
        auto1.encender()
        println("Ingresa tu velocidad.")
        auto1.velocidad=read.nextInt()
        auto1.regularVelocidad(auto1.velocidad)
        auto1.esperar()
        auto1.frenar()
        auto1.apagar()
        println("Señor conductor, por favor bájese del vehículo.")
        auto1.esperar()
        auto1.esperar()
        auto1.encender()
        auto1.esperar()
        auto1.encenderluces()
        auto1.acelerar()
        println("")
        auto1.recorrerDistancia()
        auto1.apagarluces()
        println("")
        auto1.apagar()
    }
}