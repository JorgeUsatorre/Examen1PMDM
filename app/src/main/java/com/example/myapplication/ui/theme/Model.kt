package com.example.myapplication.ui.theme



import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class Model : ViewModel() {
    // Variables para el estado de la aplicación
    var isStarted: Boolean = false // Indica si la aplicación ha comenzado
    var nombre = mutableStateOf("") // Almacena un nombre en un estado mutable
    var aleatorio = mutableStateOf(0) // Almacena un valor aleatorio en un estado mutable
    var lista = mutableStateListOf<Int>() // Almacena una lista de números enteros en un estado mutable

    // Genera un valor aleatorio y lo almacena en aleatorio
    fun random() {
        aleatorio.value = ((0..10).random())
        Log.d("Estado", aleatorio.value.toString()) // Registra el valor aleatorio en el registro de eventos
    }

    // Genera un valor aleatorio y lo agrega a la lista
    fun randomLista() {
        aleatorio.value = ((0..8).random())
        lista.add(aleatorio.value) // Agrega el valor aleatorio a la lista
        Log.d("Estado", "Números Lista: " + aleatorio.value.toString()) // Registra el valor aleatorio en el registro de eventos
    }

    // Obtiene una copia de la lista
    fun getLista(): List<Int> {
        return lista.toList()
    }

    // Obtiene el valor aleatorio actual
    fun getRandom(): Int {
        return aleatorio.value
    }

    // Obtiene el nombre actual
    fun getNombre(): String {
        return nombre.value
    }

    // Restablece el estado (pendiente de implementar)
    fun reset() {
        TODO("Not yet implemented")
    }

    // Variable para contar las rondas
    private var ronda = mutableStateOf(0)

    // Obtiene el valor actual de la ronda
    fun getRonda(): Int {
        return ronda.value
    }

    // Incrementa el valor de la ronda
    fun sumarRonda() {
        ronda.value += 1
    }
}