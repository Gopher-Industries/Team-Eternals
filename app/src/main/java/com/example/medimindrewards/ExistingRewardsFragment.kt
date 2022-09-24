package com.example.medimindrewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medimindrewards.databinding.FragmentExisitngrewardsBinding

class ExistingRewardsFragment : Fragment() {

    private var _binding: FragmentExisitngrewardsBinding? = null

    private val binding get() = _binding!!

    private lateinit var newRecyclerView3: RecyclerView
    private lateinit var newArrayList3: ArrayList<ExistingVoucher>
    lateinit var existingTypeId: Array<String>
    lateinit var existingNameId: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExisitngrewardsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButtonExistingRewards.setOnClickListener {
            findNavController().navigate(R.id.action_ExistingRewardsFragment_to_MyRewardsFragment)
        }
        binding.homeButtonExistingRewards.setOnClickListener {
            findNavController().navigate(R.id.action_ExistingRewardsFragment_to_HomeFragment)
        }
        existingTypeId = arrayOf(
            "Shopping",
            "Event",
            "Food"

        )
        existingNameId = arrayOf(
            "Woolworths Voucher 10%",
            "Sporting Event 15%",
            "Domino's Pizza 20%",
        )

        newRecyclerView3 = binding.existingRewardsRecycler
        newRecyclerView3.layoutManager = LinearLayoutManager(getContext())
        newRecyclerView3.setHasFixedSize(true)

        newArrayList3 = arrayListOf<ExistingVoucher>()

        getData()
    }

    private fun getData() {

        for(i in existingTypeId.indices){
            val name = ExistingVoucher(existingTypeId[i], existingNameId[i])
            newArrayList3.add(name)
        }

        newRecyclerView3.adapter = ExistingAdapter(newArrayList3)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}