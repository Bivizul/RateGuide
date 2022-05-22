package com.bivizul.rateguide.presentation.terms

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bivizul.rateguide.data.network.ApiRepository
import com.bivizul.rateguide.domain.Terms
import com.bivizul.rateguide.utils.Constants.TAG
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TermsViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {

    private var _terms = MutableLiveData<Terms>()
    val terms: LiveData<Terms>
        get() = _terms

    fun getTerms() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getTerms().let {
                if (it.isSuccessful) {
                    _terms.postValue(it.body())
                } else {
                    Log.d(TAG, "Failed load: ${it.errorBody()}")
                }
            }
        }
    }
}