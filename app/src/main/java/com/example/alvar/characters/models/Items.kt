package com.example.alvar.characters.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Items {

    @SerializedName("Infobox")
    @Expose
    var infobox: String? = null
    @SerializedName("AnswerType")
    @Expose
    var answerType: String? = null
    @SerializedName("Entity")
    @Expose
    var entity: String? = null
    @SerializedName("Results")
    @Expose
    var results: List<Any>? = null
    @SerializedName("Abstract")
    @Expose
    var abstract: String? = null
    @SerializedName("DefinitionSource")
    @Expose
    var definitionSource: String? = null
    @SerializedName("Definition")
    @Expose
    var definition: String? = null
    @SerializedName("AbstractURL")
    @Expose
    var abstractURL: String? = null
    @SerializedName("Answer")
    @Expose
    var answer: String? = null
    @SerializedName("Redirect")
    @Expose
    var redirect: String? = null
    @SerializedName("AbstractText")
    @Expose
    var abstractText: String? = null
    @SerializedName("meta")
    @Expose
    var meta: Meta? = null
    @SerializedName("Type")
    @Expose
    var type: String? = null
    @SerializedName("AbstractSource")
    @Expose
    var abstractSource: String? = null
    @SerializedName("ImageIsLogo")
    @Expose
    var imageIsLogo: Int? = null
    @SerializedName("Heading")
    @Expose
    var heading: String? = null
    @SerializedName("Image")
    @Expose
    var image: String? = null
    @SerializedName("RelatedTopics")
    @Expose
    var relatedTopics: List<RelatedTopic>? = null
    @SerializedName("ImageHeight")
    @Expose
    var imageHeight: Int? = null
    @SerializedName("ImageWidth")
    @Expose
    var imageWidth: Int? = null
    @SerializedName("DefinitionURL")
    @Expose
    var definitionURL: String? = null

}