package com.lespsan543.retrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.lespsan543.retrofit.ui.theme.RetrofitTheme
import com.lespsan543.retrofit.view.PantallaBusqueda
import com.lespsan543.retrofit.viewModel.DogViewModel

class MainActivity : ComponentActivity() {
    private val viewModel : DogViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetrofitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaBusqueda(viewModel)
                }
            }
        }
    }
}