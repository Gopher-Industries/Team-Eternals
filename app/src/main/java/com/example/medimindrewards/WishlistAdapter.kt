package com.example.medimindrewards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishlistAdapter(private val wishlistList: ArrayList<WishlistVoucher>) : RecyclerView.Adapter<WishlistAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.wishlist_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = wishlistList[position]
        holder.voucherTitle.text = currentItem.voucherName
        holder.voucherRedeemPoints.text = currentItem.voucherPoints
    }

    override fun getItemCount(): Int {
        return wishlistList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val voucherTitle : TextView = itemView.findViewById(R.id.wishlistItemID)
        val voucherRedeemPoints : TextView = itemView.findViewById(R.id.wishlistPointsID)
    }
}