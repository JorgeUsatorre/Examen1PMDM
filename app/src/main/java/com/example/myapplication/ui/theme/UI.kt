package com.example.myapplication.ui.theme


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun buttons(miModel: Model) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = miModel.getNombre(),
            onValueChange = { miModel.nombre.value = it },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = { miModel.randomLista() },
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Blue) // Cambio de color de fondo a azul
                ) {
                }
                Text(text = "")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = { miModel.random() },
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Green) // Cambio de color de fondo a verde
                ) {
                }
                Text(text = "")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Red) // Cambio de color de fondo a rojo
                ) {
                }
                Text(text = "")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = { /* TODO */ },
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Yellow) // Cambio de color de fondo a amarillo
                ) {
                }
                Text(text = "")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = {
                        if (miModel.isStarted) {
                            miModel.isStarted = false
                            miModel.reset()
                        } else {
                            miModel.isStarted = true
                        }
                    },
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.White) // Cambio de color de fondo a gris
                ) {
                }
                Text(text = if (miModel.isStarted) "Reset" else "Start")
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = {
                        if (miModel.isStarted) {
                            miModel.sumarRonda()
                        }
                    },
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Black) // Cambio de color de fondo a rojo
                ) {
                }
                Text(text = "Sumar Ronda")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { miModel.randomLista() }, // Acción al hacer clic en el botón
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .background(Color.White) // Establece el color de fondo en blanco
            ) {
                Text(text = "Tonal_List") // Texto del botón
            }

            OutlinedButton(
                onClick = { miModel.random() }, // Acción al hacer clic en el botón
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .background(Color.White) // Establece el color de fondo en blanco
            ) {
                Text(text = "Random") // Texto del botón
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Textos(miModel: Model) {
    Column {
        Text(
            fontSize = 40.sp,
            text = miModel.getRandom().toString()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = miModel.getLista().toString(),
            fontSize = 20.sp
        )
    }
}

@Composable
fun Greeting(miModel: Model) {
    Column {
        Text(
            text = "Ronda: ${miModel.getRonda()}",
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )

        buttons(miModel)
        Spacer(modifier = Modifier.height(50.dp))
        Textos(miModel)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(miModel: Model) {
    MyApplicationTheme {
        Greeting(miModel)
    }
}