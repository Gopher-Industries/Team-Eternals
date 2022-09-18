package com.example.medimindrewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medimindrewards.databinding.FragmentAllmedicationBinding

class AllMedicationFragment : Fragment() {

    private var _binding: FragmentAllmedicationBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAllmedicationBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButtonAllMedication.setOnClickListener {
            findNavController().navigate(R.id.action_AllMedicationFragment_to_MyMedicationFragment)
        }
        binding.homeButtonAllMedication.setOnClickListener {
            findNavController().navigate(R.id.action_AllMedicationFragment_to_HomeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}