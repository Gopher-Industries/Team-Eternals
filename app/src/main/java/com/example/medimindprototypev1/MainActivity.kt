package com.example.medimindprototypev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Some Additional Code
//        The code below is used to rename the activity name on the menu bar
        val actionBar = supportActionBar
        actionBar!!.title = "Home"

//        The code below is used to set an onClickListener using the latest version of Kotlin
        // Code for My Medications Button
        val myMedicationBtn: ImageButton = findViewById (R.id.my_medications_btn)
        myMedicationBtn.setOnClickListener() {
            val intent = Intent(this, MyMedication::class.java)
            startActivity(intent)
        }

        // Code for My Rewards Button
        val myRewardsBtn: ImageButton = findViewById (R.id.my_rewards_btn)
        myRewardsBtn.setOnClickListener() {
            val intent = Intent(this, MyRewards::class.java)
            startActivity(intent)
        }

        // Code for My Info Button
        val myInfoBtn: ImageButton = findViewById (R.id.my_info_btn)
        myInfoBtn.setOnClickListener() {
            Toast.makeText(this, "My Info Button was Clicked", Toast.LENGTH_LONG).show()
        }

        // Code for My Report Button
        val myReportsBtn: ImageButton = findViewById (R.id.my_reports_btn)
        myReportsBtn.setOnClickListener() {
            Toast.makeText(this, "My Reports Button was Clicked", Toast.LENGTH_LONG).show()
        }
    }
}