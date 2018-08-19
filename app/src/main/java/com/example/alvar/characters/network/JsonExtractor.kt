package com.example.alvar.characters.network

import android.arch.lifecycle.MutableLiveData
import com.example.alvar.characters.BuildConfig.SEARCH
import com.example.alvar.characters.models.Items
import com.example.alvar.characters.models.RelatedTopic
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class JsonExtractor {
    private val api by lazy {
        Api.create()
    }

    fun setMutable(liveData: MutableLiveData<List<RelatedTopic>>){


        api.getJson(SEARCH, "json").enqueue(object : Callback<Items>{
            override fun onFailure(call: Call<Items>?, t: Throwable?) {
                t?.printStackTrace()
            }

            override fun onResponse(call: Call<Items>?, response: Response<Items>?) {
               val relatedTopicList: List<RelatedTopic>? = response?.body()?.relatedTopics
                liveData.postValue(relatedTopicList)

            }
        })
    }
}
