package com.bivizul.rateguide.presentation.typesbets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bivizul.rateguide.R
import com.bivizul.rateguide.databinding.FragmentTypeBetBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TypeBetFragment : Fragment() {

    private var _binding: FragmentTypeBetBinding? = null
    private val binding: FragmentTypeBetBinding
        get() = _binding ?: throw RuntimeException("FragmentTypeBetBinding is null")

    lateinit var viewModel: TypeBetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentTypeBetBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val typeBets = arguments?.get(TYPE_BETS)

        viewModel = ViewModelProvider(this)[TypeBetViewModel::class.java]

        viewModel.getTypesBets()
        viewModel.typeBets.observe(viewLifecycleOwner) {
            with(binding) {
                tvTitle.text = when (typeBets) {
                    getString(R.string.big_and_small) -> getString(R.string.big_and_small)
                    getString(R.string.value_bets) -> getString(R.string.value_bets)
                    getString(R.string.willful_victory) -> getString(R.string.willful_victory)
                    getString(R.string.assist) -> getString(R.string.assist)
                    getString(R.string.double_chance_12) -> getString(R.string.double_chance_12)
                    getString(R.string.long_term) -> getString(R.string.long_term)
                    getString(R.string.individual) -> getString(R.string.individual)
                    getString(R.string.individual_total) -> getString(R.string.individual_total)
                    getString(R.string.coefficient) -> getString(R.string.coefficient)
                    getString(R.string.cashout) -> getString(R.string.cashout)
                    getString(R.string.margin) -> getString(R.string.margin)
                    getString(R.string.on_out) -> getString(R.string.on_out)
                    getString(R.string.on_corridor) -> getString(R.string.on_corridor)
                    getString(R.string.to_statistics) -> getString(R.string.to_statistics)
                    getString(R.string.both_to_score) -> getString(R.string.both_to_score)
                    getString(R.string.ordinaries) -> getString(R.string.ordinaries)
                    getString(R.string.load_line) -> getString(R.string.load_line)
                    getString(R.string.system) -> getString(R.string.system)
                    getString(R.string.total) -> getString(R.string.total)
                    getString(R.string.total_three_way) -> getString(R.string.total_three_way)
                    getString(R.string.handicap) -> getString(R.string.handicap)
                    getString(R.string.express) -> getString(R.string.express)
                    else -> "Error"
                }
                tvText.text = when (typeBets) {
                    getString(R.string.big_and_small) -> it.bigmarkets_and_smallmarkets
                    getString(R.string.value_bets) -> it.value_bets
                    getString(R.string.willful_victory) -> it.willful_victory
                    getString(R.string.assist) -> it.assist
                    getString(R.string.double_chance_12) -> it.double_chance_12
                    getString(R.string.long_term) -> it.long_term
                    getString(R.string.individual) -> it.individual
                    getString(R.string.individual_total) -> it.individual_total
                    getString(R.string.coefficient) -> it.coefficient
                    getString(R.string.cashout) -> it.cashout
                    getString(R.string.margin) -> it.margin
                    getString(R.string.on_out) -> it.outcome
                    getString(R.string.on_corridor) -> it.on_corridor
                    getString(R.string.to_statistics) -> it.per_statistics
                    getString(R.string.both_to_score) -> it.both_to_score
                    getString(R.string.ordinaries) -> it.ordinary
                    getString(R.string.load_line) -> it.load_lines
                    getString(R.string.system) -> it.system
                    getString(R.string.total) -> it.total
                    getString(R.string.total_three_way) -> it.total_three_way
                    getString(R.string.handicap) -> it.handicap
                    getString(R.string.express) -> it.express
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
        const val TYPE_BETS = "TYPE_BETS"
    }
}