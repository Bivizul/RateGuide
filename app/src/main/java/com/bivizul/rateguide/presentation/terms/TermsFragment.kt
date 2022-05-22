package com.bivizul.rateguide.presentation.terms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bivizul.rateguide.R
import com.bivizul.rateguide.databinding.FragmentTermsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TermsFragment : Fragment() {

    private var _binding: FragmentTermsBinding? = null
    private val binding: FragmentTermsBinding
        get() = _binding ?: throw RuntimeException("FragmentTermsBinding is null")

    lateinit var viewModel: TermsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentTermsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTitle.text = getString(R.string.terms)

        viewModel = ViewModelProvider(this)[TermsViewModel::class.java]

        viewModel.getTerms()
        viewModel.terms.observe(viewLifecycleOwner) {
            binding.tvText.text = it.terms
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}