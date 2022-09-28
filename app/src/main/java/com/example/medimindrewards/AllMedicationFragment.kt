package com.example.medimindrewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medimindrewards.databinding.FragmentAllmedicationBinding

class AllMedicationFragment : Fragment() {

    private var _binding: FragmentAllmedicationBinding? = null

    private val binding get() = _binding!!

    private lateinit var newRecyclerView4: RecyclerView
    private lateinit var newArrayList4: ArrayList<MedicationType>
    lateinit var medicationId: Array<String>
    lateinit var doseId: Array<String>
    lateinit var effectId: Array<String>

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

        medicationId = arrayOf(
            "Panadol",
            "Zoloft",
            "Klanopin"
        )

        doseId = arrayOf(
            "Dose: 400mg per day",
            "Dose: 50mg per day",
            "Dose: 4mg per day"
        )

        effectId = arrayOf(
            "Drowsiness",
            "Nausea, Insomnia",
            "Diziness, Blurred Vision"
        )

        newRecyclerView4 = binding.allmedicationRecycler
        newRecyclerView4.layoutManager = LinearLayoutManager(getContext())
        newRecyclerView4.setHasFixedSize(true)
        newRecyclerView4.apply {
            layoutManager = GridLayoutManager(getContext(), 2)
        }

        newArrayList4 = arrayListOf<MedicationType>()

        getData()

    }

    private fun getData() {
        for(i in medicationId.indices){
            val med = MedicationType(medicationId[i], doseId[i], effectId[i])
            newArrayList4.add(med)
        }

        newRecyclerView4.adapter = AllMedicationAdapter(newArrayList4)
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}