package com.example.medimindrewards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AllMedicationAdapter(private val medicationTypeList: ArrayList<MedicationType>)  : RecyclerView.Adapter<AllMedicationAdapter.MyViewHolder4>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder4 {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.allmedication_item, parent, false)
        return  MyViewHolder4(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder4, position: Int) {
        val currentItem = medicationTypeList[position]
        holder.medicationTitle.text = currentItem.medicationNameData
        holder.medicationDosage.text = currentItem.medicationDosageData
        holder.medicationEffect.text = currentItem.medicationEffectData
    }

    override fun getItemCount(): Int {
        return medicationTypeList.size
    }

    class MyViewHolder4(itemView: View) : RecyclerView.ViewHolder(itemView){
        val medicationTitle : TextView = itemView.findViewById(R.id.medicationName)
        val medicationDosage : TextView = itemView.findViewById(R.id.medicationDosage)
        val medicationEffect : TextView = itemView.findViewById(R.id.medicationSideEffect)
    }

}