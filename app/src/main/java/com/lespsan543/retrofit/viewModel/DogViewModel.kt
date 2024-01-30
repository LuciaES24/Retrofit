package com.lespsan543.retrofit.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lespsan543.retrofit.model.DogModel
import com.lespsan543.retrofit.model.DogService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.random.Random
import kotlin.random.nextInt

class DogViewModel: ViewModel() {
    private var dogService = DogService()

    var urlImagen by mutableStateOf("")

    var textoMostrar by mutableStateOf("")

    private val posiblesTextos = mutableListOf("¡Mira qué mono!","¡Qué bonito!","¡Qué gracioso!","¡Es monísimo!")

    init {
        getDog()
        getTexto()
    }

    fun getDog(){
        viewModelScope.launch(Dispatchers.IO) {
            val dog = dogService.getDog()
            urlImagen = dog.message
        }
    }

    fun getTexto(){
        val random = Random.nextInt(0..posiblesTextos.size-1)
        textoMostrar = posiblesTextos[random]
    }
}