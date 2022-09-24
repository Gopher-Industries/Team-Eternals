package com.example.medimindrewards

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medimindrewards.databinding.FragmentMywishlistBinding

class MyWishlistFragment : Fragment() {

    private var _binding: FragmentMywishlistBinding? = null

    private val binding get() = _binding!!

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<WishlistVoucher>
    lateinit var titleId: Array<String>
    lateinit var contentId: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMywishlistBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backButtonWishlist.setOnClickListener {
            findNavController().navigate(R.id.action_MyWishlistFragment_to_MyRewardsFragment)
        }
        binding.homeButtonWishlist.setOnClickListener {
            findNavController().navigate(R.id.action_MyWishlistFragment_to_HomeFragment)
        }

        titleId = arrayOf(
            "Woolworths",
            "Coles",
            "JB HI-FI",
            "Pizza Hut"

        )
        contentId = arrayOf(
            "20",
            "20",
            "30",
            "5"
        )

        newRecyclerView = binding.wishlistRecycler
        newRecyclerView.layoutManager = LinearLayoutManager(getContext())
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<WishlistVoucher>()

        getData()
    }

    private fun getData() {

        for(i in titleId.indices){
            val name = WishlistVoucher(titleId[i], contentId[i])
            newArrayList.add(name)
        }

        newRecyclerView.adapter = WishlistAdapter(newArrayList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}