package com.nathanhtml.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation (
    @StringRes val stringId : Int,
    @DrawableRes val imageId : Int
)