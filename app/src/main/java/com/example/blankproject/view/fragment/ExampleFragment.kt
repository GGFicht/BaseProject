package com.example.blankproject.view.fragment

import android.os.Bundle
import android.view.View
import com.example.blankproject.R
import com.example.blankproject.databinding.FragmentExampleBinding
import com.example.blankproject.model.ModelExample
import com.example.blankproject.view.adapter.SimpleAdapter
import com.example.blankproject.view.base.BaseFragment

class ExampleFragment : BaseFragment<FragmentExampleBinding>(R.layout.fragment_example) {

    private lateinit var adapter: SimpleAdapter
    private val listSize = 3

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = SimpleAdapter (onClick = {
            activity?.onBackPressed()
        })

        val dummyList = mutableListOf<ModelExample>()

        for(i in 0 until listSize) {
            dummyList.add(ModelExample(getString(R.string.example_text), getString(R.string.example_description)))
        }

        binding.recyclerView.adapter = adapter
        adapter.models = dummyList
    }
}