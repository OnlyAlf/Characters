package com.example.alvar.characters

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.example.alvar.characters.adapters.CharacterAdapter
import com.example.alvar.characters.models.RelatedTopic
import com.example.alvar.characters.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CharacterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.main_activity_rv)

        val mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        mainViewModel.init()

            mainViewModel.getMutable()?.observe(this, Observer { setRecycler(it?.toList())

        })
    }

    private fun setRecycler(items: List<RelatedTopic>?){
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.setHasFixedSize(false)
        adapter = CharacterAdapter(items!!, this)
        recyclerView.adapter = adapter
    }
}
