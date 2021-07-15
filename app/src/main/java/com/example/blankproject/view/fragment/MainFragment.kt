package com.example.blankproject.view.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.blankproject.R
import com.example.blankproject.databinding.FragmentMainBinding
import com.example.blankproject.view.base.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSubmit.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_exampleFragment)
        }
    }
}