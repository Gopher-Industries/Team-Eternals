package com.example.medimindrewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medimindrewards.databinding.FragmentMymedicationBinding

class MyMedicationFragment : Fragment() {
    private var _binding: FragmentMymedicationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMymedicationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButtonMyMedication.setOnClickListener {
            findNavController().navigate(R.id.action_MyMedicationFragment_to_HomeFragment)
        }
        binding.homeButtonMyMedication.setOnClickListener {
            findNavController().navigate(R.id.action_MyMedicationFragment_to_HomeFragment)
        }
        binding.buttonAllMedication.setOnClickListener {
            findNavController().navigate(R.id.action_MyMedicationFragment_to_AllMedicationFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}