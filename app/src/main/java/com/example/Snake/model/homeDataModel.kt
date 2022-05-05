package com.example.Snake.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class homeDataModel (

    @StringRes val DescriptionResId: Int,
    @StringRes val NameResId: Int,
    @DrawableRes val ImageResId: Int
    )