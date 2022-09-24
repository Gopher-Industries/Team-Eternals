package com.example.medimindrewards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExistingAdapter (private val existingList: ArrayList<ExistingVoucher>) : RecyclerView.Adapter<ExistingAdapter.MyViewHolder3>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder3 {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.existingrewards_item, parent, false)
        return ExistingAdapter.MyViewHolder3(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder3, position: Int) {
        val currentItem3 = existingList[position]
        holder.existingTitle.text = currentItem3.existingType
        holder.existingNameVoucher.text = currentItem3.existingName
    }

    override fun getItemCount(): Int {
        return existingList.size
    }

    class MyViewHolder3(itemView: View) : RecyclerView.ViewHolder(itemView){

        val existingTitle : TextView = itemView.findViewById(R.id.existingType)
        val existingNameVoucher : TextView = itemView.findViewById(R.id.existingVoucher)

    }
}