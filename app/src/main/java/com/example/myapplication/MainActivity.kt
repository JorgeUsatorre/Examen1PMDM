package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.myapplication.ui.theme.Greeting
import com.example.myapplication.ui.theme.Model
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Crear una instancia del modelo
        val miModel: Model = Model()

        setContent {
            MyApplicationTheme {
                // Configurar la superficie de la aplicación
                Surface(
                    modifier = androidx.compose.ui.Modifier.fillMaxSize(), // Ocupa todo el espacio disponible
                    color = MaterialTheme.colorScheme.primary // Color de fondo de la superficie
                ) {
                    // Llamar a la función Greeting con el modelo miModel
                    Greeting(miModel = miModel)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // Registrar un mensaje en el registro de eventos al destruir la actividad
        Log.d("Estado", "Funcion on Destroy")
    }
}