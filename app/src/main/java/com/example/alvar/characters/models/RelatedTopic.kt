package com.example.alvar.characters.models

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.example.alvar.characters.R
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.squareup.picasso.Picasso

class RelatedTopic {

    @SerializedName("Result")
    @Expose
    var result: String? = null
    @SerializedName("FirstURL")
    @Expose
    var firstURL: String? = null
    @SerializedName("Icon")
    @Expose
    var icon: Icon? = null
    @SerializedName("Text")
    @Expose
    var text: String? = null

    object ImageViewBindingAdapter {
        @BindingAdapter("android:ImageUrl")
        @JvmStatic
        fun loadImage(view: ImageView, url: String) {
            if (url.isEmpty()) {
                view.setImageResource(R.drawable.ic_launcher_background)
            } else{
                Picasso.get().load(url).fit().into(view)
            }
        }
    }
}