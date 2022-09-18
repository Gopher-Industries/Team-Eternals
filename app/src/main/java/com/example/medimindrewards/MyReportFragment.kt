package com.example.medimindrewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medimindrewards.databinding.FragmentMyreportBinding

class MyReportFragment : Fragment() {
    private var _binding: FragmentMyreportBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMyreportBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButtonMyReport.setOnClickListener {
            findNavController().navigate(R.id.action_MyReportFragment_to_HomeFragment)
        }
        binding.homeButtonMyReport.setOnClickListener {
            findNavController().navigate(R.id.action_MyReportFragment_to_HomeFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}