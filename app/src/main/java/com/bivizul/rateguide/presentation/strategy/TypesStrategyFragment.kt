package com.bivizul.rateguide.presentation.strategy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bivizul.rateguide.R
import com.bivizul.rateguide.databinding.FragmentTypesStrategyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TypesStrategyFragment : Fragment() {

    private var _binding: FragmentTypesStrategyBinding? = null
    private val binding: FragmentTypesStrategyBinding
        get() = _binding ?: throw RuntimeException("FragmentTypesStrategyBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentTypesStrategyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            btCatchUp.setOnClickListener {
                findNavController().navigate(R.id.action_typesStrategyFragment_to_strategyFragment,
                    bundleOf(StrategyFragment.TYPE_STRATEGY to getString(R.string.catch_up))
                )
            }
            btCorridor.setOnClickListener {
                findNavController().navigate(R.id.action_typesStrategyFragment_to_strategyFragment,
                    bundleOf(StrategyFragment.TYPE_STRATEGY to getString(R.string.corridor))
                )
            }
            btEvenOdd.setOnClickListener {
                findNavController().navigate(R.id.action_typesStrategyFragment_to_strategyFragment,
                    bundleOf(StrategyFragment.TYPE_STRATEGY to getString(R.string.even_odd))
                )
            }
            btLadder.setOnClickListener {
                findNavController().navigate(R.id.action_typesStrategyFragment_to_strategyFragment,
                    bundleOf(StrategyFragment.TYPE_STRATEGY to getString(R.string.ladder))
                )
            }
            btMartingale.setOnClickListener {
                findNavController().navigate(R.id.action_typesStrategyFragment_to_strategyFragment,
                    bundleOf(StrategyFragment.TYPE_STRATEGY to getString(R.string.martingale))
                )
            }
            btPenalty.setOnClickListener {
                findNavController().navigate(R.id.action_typesStrategyFragment_to_strategyFragment,
                    bundleOf(StrategyFragment.TYPE_STRATEGY to getString(R.string.penalty))
                )
            }
            btSurebets.setOnClickListener {
                findNavController().navigate(R.id.action_typesStrategyFragment_to_strategyFragment,
                    bundleOf(StrategyFragment.TYPE_STRATEGY to getString(R.string.surebets))
                )
            }
            btYellowCards.setOnClickListener {
                findNavController().navigate(R.id.action_typesStrategyFragment_to_strategyFragment,
                    bundleOf(StrategyFragment.TYPE_STRATEGY to getString(R.string.yellow_cards))
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}