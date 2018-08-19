package com.example.alvar.characters.viewmodels

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.alvar.characters.models.Items
import com.example.alvar.characters.models.RelatedTopic
import com.example.alvar.characters.models.SrcOptions
import com.example.alvar.characters.network.JsonExtractor

class MainViewModel: ViewModel() {

    private var liveDataItems: MutableLiveData<List<RelatedTopic>> = MutableLiveData()

    fun init() {
        val jsonExtractor = JsonExtractor()
        jsonExtractor.setMutable(liveDataItems)

    }

    fun getMutable(): MutableLiveData<List<RelatedTopic>>? {
        return liveDataItems
    }

}