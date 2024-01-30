package com.lespsan543.retrofit.view

import android.os.Debug
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.lespsan543.retrofit.viewModel.DogViewModel

@Composable
fun PantallaBusqueda(viewModel: DogViewModel) {
    val imagen = viewModel.urlImagen
    val texto = viewModel.textoMostrar

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(214, 234, 248)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = texto, fontSize = 25.sp)
        Spacer(modifier = Modifier.height(20.dp))
        AsyncImage(model = imagen, contentDescription = "Imagen Perro",
            modifier = Modifier
                .height(300.dp)
                .width(250.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { viewModel.getDog()
                           viewModel.getTexto() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(99, 166, 213),
                contentColor = Color.Black
            )
        ) {
            Text(text = "Siguiente imagen")
        }
    }
}