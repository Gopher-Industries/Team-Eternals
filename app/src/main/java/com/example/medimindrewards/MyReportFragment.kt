package com.example.medimindrewards

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medimindrewards.databinding.FragmentMyreportBinding
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter

class MyReportFragment : Fragment() {
    private var _binding: FragmentMyreportBinding? = null
    private val binding get() = _binding!!

    lateinit var barChart: BarChart

    lateinit var barData: BarData

    lateinit var barDataSet: BarDataSet

    lateinit var barEntriesList: ArrayList<BarEntry>

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

        barChart = view.findViewById(R.id.idBarChart)
        getBarChartData()

        barDataSet = BarDataSet(barEntriesList, "Bar Chart Data")
        barData = BarData(barDataSet)
        barChart.data = barData
        barDataSet.valueTextColor = Color.BLACK
        barDataSet.setColor(resources.getColor(R.color.main_blue))
        barDataSet.valueTextSize = 16f
        barChart.description.isEnabled = false
        barData.setDrawValues(false)
        barData.barWidth = 0.2f
        barData.setBarWidth(0.5f)

        val labels = arrayListOf(
            "M", "T", "W", "T", "F", "S", "S"
        )
        barChart.xAxis.valueFormatter = IndexAxisValueFormatter(labels)
        barChart.xAxis.position = XAxis.XAxisPosition.BOTTOM
        barChart.setDrawGridBackground(false)
        barChart.axisLeft.isEnabled = false
        barChart.axisRight.isEnabled = false
        barChart.description.isEnabled = false
        barChart.getLegend().isEnabled = false
        barChart.invalidate()
    }

    private fun getBarChartData() {
        barEntriesList = ArrayList()
        barEntriesList.add(BarEntry(0f, 5f))
        barEntriesList.add(BarEntry(1f, 2f))
        barEntriesList.add(BarEntry(2f, 4f))
        barEntriesList.add(BarEntry(3f, 4f))
        barEntriesList.add(BarEntry(4f, 5f))
        barEntriesList.add(BarEntry(5f, 4f))
        barEntriesList.add(BarEntry(6f, 5f))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}