package com.example.medimindprototypev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyRewards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_rewards)

        val actionBar = supportActionBar
        actionBar!!.title = "My Rewards"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}
