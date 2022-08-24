package com.example.medimindrewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medimindrewards.databinding.FragmentMyrewardsBinding

class MyRewardsFragment : Fragment() {
    private var _binding: FragmentMyrewardsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMyrewardsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.wishlistButton.setOnClickListener {
            findNavController().navigate(R.id.action_MyRewardsFragment_to_MyWishlistFragment)
        }

        binding.rewardsButton.setOnClickListener {
            findNavController().navigate(R.id.action_MyRewardsFragment_to_AllRewardsFragment)
        }

        binding.existingButton.setOnClickListener {
            findNavController().navigate(R.id.action_MyRewardsFragment_to_ExistingRewardsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}