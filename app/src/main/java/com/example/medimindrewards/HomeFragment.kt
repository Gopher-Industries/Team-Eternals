package com.example.medimindrewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medimindrewards.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.homeCardOneButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_MyMedicationFragment)
        }
        binding.homeCardTwoButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_MyRewardsFragment)
        }
        binding.homeCardThreeButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_MyReportFragment)
        }
        binding.homeCardFourButton.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_MyInformationFragment)
        }
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_HomeNavigation_to_reminderMain)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}