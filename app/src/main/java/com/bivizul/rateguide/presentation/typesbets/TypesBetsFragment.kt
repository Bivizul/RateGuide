package com.bivizul.rateguide.presentation.typesbets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bivizul.rateguide.R
import com.bivizul.rateguide.databinding.FragmentTypesBetsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TypesBetsFragment : Fragment() {

    private var _binding: FragmentTypesBetsBinding? = null
    private val binding: FragmentTypesBetsBinding
        get() = _binding ?: throw RuntimeException("FragmentTypesBetsBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentTypesBetsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            btBigAndSmall.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.big_and_small)))
            }
            btValueBets.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.value_bets)))
            }
            btWillfulVictory.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.willful_victory)))
            }
            btAssist.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.assist)))
            }
            btDoubleChance12.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.double_chance_12)))
            }
            btLongTerm.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.long_term)))
            }
            btIndividual.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.individual)))
            }
            btIndividualTotal.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.individual_total)))
            }
            btCoefficients.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.coefficient)))
            }
            btCashout.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.cashout)))
            }
            btMargin.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.margin)))
            }
            btOnOut.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.on_out)))
            }
            btOnCorridor.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.on_corridor)))
            }
            btToStatistics.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.to_statistics)))
            }
            btBothToScore.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.both_to_score)))
            }
            btOrdinaries.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.ordinaries)))
            }
            btLoadLine.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.load_line)))
            }
            btSystem.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.system)))
            }
            btTotal.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.total)))
            }
            btTotalThreeWay.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.total_three_way)))
            }
            btHandicap.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.handicap)))
            }
            btExpress.setOnClickListener {
                findNavController().navigate(R.id.action_typesBetsFragment_to_typeBetFragment,
                    bundleOf(TypeBetFragment.TYPE_BETS to getString(R.string.express)))
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}