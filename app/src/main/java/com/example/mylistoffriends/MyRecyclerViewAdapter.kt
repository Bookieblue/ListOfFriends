package com.example.mylistoffriends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter (val friendslist : List<String>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val  listItem = layoutInflater.inflate(R.layout.my_list,parent,false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val friends = friendslist[position]
        holder.myTextView.text = friends
    }

    override fun getItemCount(): Int {
        return friendslist.size
    }

}



class MyViewHolder (val view :View) : RecyclerView.ViewHolder(view){
    val myTextView = view.findViewById<TextView>(R.id.nameID)

}