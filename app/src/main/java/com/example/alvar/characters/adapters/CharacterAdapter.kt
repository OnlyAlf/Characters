package com.example.alvar.characters.adapters

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.alvar.characters.models.RelatedTopic
import android.databinding.ViewDataBinding
import com.example.alvar.characters.BR
import com.example.alvar.characters.R


class CharacterAdapter (private val items: List<RelatedTopic>, private val context: Context): RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ViewDataBinding =
                DataBindingUtil.inflate(layoutInflater, R.layout.rv_character_item, parent, false)
        return CharacterViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class CharacterViewHolder(private val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: RelatedTopic) {
            binding.setVariable(BR.RelatedTopic, data)
            binding.executePendingBindings()
        }
    }
}