package com.bivizul.rateguide.presentation.typesbets

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bivizul.rateguide.data.network.ApiRepository
import com.bivizul.rateguide.domain.TypesBets
import com.bivizul.rateguide.utils.Constants.TAG
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TypeBetViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {

    private val _typeBets = MutableLiveData<TypesBets>()
    val typeBets: LiveData<TypesBets>
        get() = _typeBets

    fun getTypesBets() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getTypesBets().let {
                if (it.isSuccessful) {
                    _typeBets.postValue(it.body())
                } else {
                    Log.d(TAG, "Failed load: ${it.errorBody()}")
                }
            }
        }
    }
}