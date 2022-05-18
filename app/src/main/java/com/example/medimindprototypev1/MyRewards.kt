package com.example.medimindprototypev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MyRewards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_rewards)

        val actionBar = supportActionBar
        actionBar!!.title = "My Rewards"
        actionBar.setDisplayHomeAsUpEnabled(true)

        //        The code below is used to set an onClickListener using the latest version of Kotlin
        val myWishList: Button = findViewById (R.id.my_wish_list)
        myWishList.setOnClickListener() {
            Toast.makeText(this, "My Wish List Button was Clicked", Toast.LENGTH_LONG).show()
//           ###### Use this code below to go to the desired page when the button is clicked #####
//            val intent = Intent(this, Add the My Wish List Class Here::class.java)
//            startActivity(intent)
        }

        val allRewards: Button = findViewById (R.id.all_rewards)
        allRewards.setOnClickListener() {
            Toast.makeText(this, "All Rewards Button was Clicked", Toast.LENGTH_LONG).show()
        }

        val claimRewards: Button = findViewById (R.id.claim_rewards)
        claimRewards.setOnClickListener() {
            Toast.makeText(this, "My Claimed Rewards Button was Clicked", Toast.LENGTH_LONG).show()
        }
    }
}
