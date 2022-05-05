package com.example.Snake.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.Snake.R
import com.example.Snake.model.galleryDataModel

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    fun loadData(): List<galleryDataModel> {
        return listOf(
            galleryDataModel(R.drawable.snake_1),
            galleryDataModel(R.drawable.snake_2),
            galleryDataModel(R.drawable.snake_3),
            galleryDataModel(R.drawable.snake_4),
            galleryDataModel(R.drawable.snake_5),
            galleryDataModel(R.drawable.snake_6),
            galleryDataModel(R.drawable.snake_7),
            galleryDataModel(R.drawable.snake_8),
            galleryDataModel(R.drawable.snake_9),
            galleryDataModel(R.drawable.snake_10)
        )
    }

    fun setData(data: galleryDataModel) {
        _image.value = data.ImageResId
    }
}