package com.example.Snake.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.Snake.R
import com.example.Snake.model.homeDataModel

class HomeViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String> = _desc

    fun loadData(): List<homeDataModel> {
        return listOf(
            homeDataModel(
                R.string.desc_snake1,
                R.string.snake1,
                R.drawable.snake_1
            ),
            homeDataModel(
                R.string.desc_snake2,
                R.string.snake2,
                R.drawable.snake_2
            ),
            homeDataModel(
                R.string.desc_snake3,
                R.string.snake3,
                R.drawable.snake_3
            ),
            homeDataModel(
                R.string.desc_snake4,
                R.string.snake4,
                R.drawable.snake_4
            ),
            homeDataModel(
                R.string.desc_snake5,
                R.string.snake5,
                R.drawable.snake_5
            ),
            homeDataModel(
                R.string.desc_snake6,
                R.string.snake6,
                R.drawable.snake_6
            ),
            homeDataModel(
                R.string.desc_snake7,
                R.string.snake7,
                R.drawable.snake_7
            ),
            homeDataModel(
                R.string.desc_snake8,
                R.string.snake8,
                R.drawable.snake_8
            ),
            homeDataModel(
                R.string.desc_snake9,
                R.string.snake9,
                R.drawable.snake_9
            ),
            homeDataModel(
                R.string.desc_snake10,
                R.string.snake10,
                R.drawable.snake_10
            )
        )
    }

    fun setData(data: homeDataModel, context: Context) {
        _name.value = context.getString(data.NameResId)
        _image.value = data.ImageResId
        _desc.value = context.getString(data.DescriptionResId)
    }
}