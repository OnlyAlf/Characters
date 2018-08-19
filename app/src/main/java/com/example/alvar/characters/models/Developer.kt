package com.example.alvar.characters.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Developer {

    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("url")
    @Expose
    var url: String? = null

}