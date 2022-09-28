package com.example.medimindrewards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AllrewardsAdapter(private val allrewardsList: ArrayList<AllrewardsType>) : RecyclerView.Adapter<AllrewardsAdapter.MyViewHolder2>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2 {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.allrewards_item, parent, false)
        return AllrewardsAdapter.MyViewHolder2(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder2, position: Int) {
        val currentItem = allrewardsList[position]
        holder.rewardType.text = currentItem.rewardType
    }

    override fun getItemCount(): Int {
        return allrewardsList.size
    }

    class MyViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val rewardType : TextView = itemView.findViewById(R.id.typeID)

    }
}