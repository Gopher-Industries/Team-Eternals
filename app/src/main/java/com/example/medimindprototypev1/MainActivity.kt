package com.example.medimindprototypev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_medication)
/*
//        Some Additional Code
//        The code below is used to rename the activity name on the menu bar
        val actionBar = supportActionBar
        actionBar!!.title = "Home"

//        The code below is used to set an onClickListener using the latest version of Kotlin
        val myRewardsBtn: Button = findViewById (R.id.myRewardsBtn)
        myRewardsBtn.setOnClickListener() {
            val intent = Intent(this, MyRewards::class.java)
            startActivity(intent)
        } */
    }
}