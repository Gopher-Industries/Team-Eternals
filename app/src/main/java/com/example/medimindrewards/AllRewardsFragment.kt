package com.example.medimindrewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medimindrewards.databinding.FragmentAllrewardsBinding

class AllRewardsFragment : Fragment() {

    private var _binding: FragmentAllrewardsBinding? = null

    private val binding get() = _binding!!

    private lateinit var newRecyclerView2: RecyclerView
    private lateinit var newArrayList2: ArrayList<AllrewardsType>
    lateinit var rewardTypeID: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAllrewardsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButtonAllRewards.setOnClickListener {
            findNavController().navigate(R.id.action_AllRewardsFragment_to_MyRewardsFragment)
        }
        binding.homeButtonAllRewards.setOnClickListener {
            findNavController().navigate(R.id.action_AllRewardsFragment_to_HomeFragment)
        }

        rewardTypeID = arrayOf(
            "Shopping",
            "Food",
            "Events",
            "Health"

        )

        newRecyclerView2 = binding.allRewardsRecycler
        newRecyclerView2.layoutManager = LinearLayoutManager(getContext())
        newRecyclerView2.setHasFixedSize(true)

        newArrayList2 = arrayListOf<AllrewardsType>()

        getData()
    }

    private fun getData() {

        for(i in rewardTypeID.indices){
            val type = AllrewardsType(rewardTypeID[i])
            newArrayList2.add(type)
        }

        newRecyclerView2.adapter = AllrewardsAdapter(newArrayList2)


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}