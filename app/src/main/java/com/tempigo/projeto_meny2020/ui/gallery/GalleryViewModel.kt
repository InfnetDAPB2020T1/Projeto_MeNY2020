package com.tempigo.projeto_meny2020.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is sparta Fragment"
    }
    val text: LiveData<String> = _text
}