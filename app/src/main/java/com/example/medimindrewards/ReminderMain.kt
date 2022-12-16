package com.example.medimindrewards

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.medimindrewards.databinding.FragmentReminderBinding

class ReminderMain : Fragment() {
    private var _binding : FragmentReminderBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReminderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButtonReminderHome.setOnClickListener {
            findNavController().navigate(R.id.action_ReminderMain_to_HomeNavigation)
        }
        binding.homeButtonReminderHome.setOnClickListener {
            findNavController().navigate(R.id.action_ReminderMain_to_HomeNavigation)
        }
    }
}