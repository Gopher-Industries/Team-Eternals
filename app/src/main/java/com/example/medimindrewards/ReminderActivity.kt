package com.example.medimindrewards

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.medimindrewards.databinding.FragmentReminderBinding

class ReminderActivity : AppCompatActivity() {
    private lateinit var binding: FragmentReminderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentReminderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val add_btn : Button = findViewById(R.id.add)
        add_btn.setOnClickListener {
            val intent = Intent(this, CreateNewReminderItem::class.java)
            startActivity(intent)
        }

    }
}