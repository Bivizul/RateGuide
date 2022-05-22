package com.bivizul.rateguide.data.network

import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getTypesBets() = apiService.getTypes()

    suspend fun getTerms() = apiService.getTerms()

    suspend fun getStrategy() = apiService.getStrategy()

}