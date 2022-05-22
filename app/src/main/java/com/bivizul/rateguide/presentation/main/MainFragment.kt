package com.bivizul.rateguide.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.bivizul.rateguide.R
import com.bivizul.rateguide.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get() = _binding ?: throw RuntimeException("FragmentMainBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            imgMoney.load("http://65.109.10.118/4rateguide/money6.png")

            btStrategy.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_typesStrategyFragment)
            }
            btTypes.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_typesBetsFragment)
            }
            btTerms.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_termsFragment)
            }
            imgBtSettings.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_settingsFragment)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}