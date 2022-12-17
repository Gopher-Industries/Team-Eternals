package com.example.medimindrewards

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.medimindrewards.databinding.FragmentReminderBinding
import kotlinx.android.synthetic.main.activity_create_new_reminder.view.*
import kotlinx.android.synthetic.main.fragment_reminder.*

class ReminderActivity : AppCompatActivity(){
    private lateinit var binding: FragmentReminderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentReminderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newReminderBtn.setOnClickListener {
            val newCardView = LayoutInflater.from(this).inflate(R.layout.activity_create_new_reminder, null)
            val newCardBuilder = AlertDialog.Builder(this).setView(newCardView).setTitle("New Reminder")
            val newCardDialog = newCardBuilder.show()

            newCardView.save.setOnClickListener {
                newCardDialog.dismiss()
                val title = newCardView.new_title.text.toString()
                val content = newCardView.new_content.text.toString()
            }

            newCardView.cancel.setOnClickListener {
                newCardDialog.dismiss()
            }
        }
    }
}