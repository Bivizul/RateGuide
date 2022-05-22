package com.bivizul.rateguide.presentation.strategy

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bivizul.rateguide.data.network.ApiRepository
import com.bivizul.rateguide.domain.Strategy
import com.bivizul.rateguide.utils.Constants.TAG
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StrategyViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {

    private var _strategy = MutableLiveData<Strategy>()
    val strategy: LiveData<Strategy>
        get() = _strategy

    fun getStrategy() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getStrategy().let {
                if (it.isSuccessful) {
                    _strategy.postValue(it.body())
                } else {
                    Log.d(TAG, "Failed load: ${it.errorBody()}")
                }

            }
        }
    }
}
