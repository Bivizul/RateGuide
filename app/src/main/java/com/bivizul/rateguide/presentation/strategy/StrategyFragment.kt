package com.bivizul.rateguide.presentation.strategy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bivizul.rateguide.R
import com.bivizul.rateguide.databinding.FragmentStrategyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StrategyFragment : Fragment() {

    private var _binding: FragmentStrategyBinding? = null
    private val binding: FragmentStrategyBinding
        get() = _binding ?: throw RuntimeException("FragmentStrategyBinding is null")

    lateinit var viewModel: StrategyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentStrategyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val typeStrategy = arguments?.get(TYPE_STRATEGY)

        viewModel = ViewModelProvider(this)[StrategyViewModel::class.java]
        viewModel.getStrategy()
        viewModel.strategy.observe(viewLifecycleOwner) {
            with(binding) {
                tvTitle.text = when (typeStrategy) {
                    getString(R.string.catch_up) -> getString(R.string.catch_up)
                    getString(R.string.corridor) -> getString(R.string.corridor)
                    getString(R.string.even_odd) -> getString(R.string.even_odd)
                    getString(R.string.ladder) -> getString(R.string.ladder)
                    getString(R.string.martingale) -> getString(R.string.martingale)
                    getString(R.string.penalty) -> getString(R.string.penalty)
                    getString(R.string.surebets) -> getString(R.string.surebets)
                    getString(R.string.yellow_cards) -> getString(R.string.yellow_cards)
                    else -> "Error"
                }
                tvText.text = when (typeStrategy) {
                    getString(R.string.catch_up) -> it.catch_up
                    getString(R.string.corridor) -> it.corridor
                    getString(R.string.even_odd) -> it.even_odd
                    getString(R.string.ladder) -> it.ladder
                    getString(R.string.martingale) -> it.martingale
                    getString(R.string.penalty) -> it.penalty
                    getString(R.string.surebets) -> it.surebets
                    getString(R.string.yellow_cards) -> it.yellow_cards
                    else -> "Error"
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        const val TYPE_STRATEGY = "TYPE_STRATEGY"
    }
}