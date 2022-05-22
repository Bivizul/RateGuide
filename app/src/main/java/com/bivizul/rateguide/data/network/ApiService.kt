package com.bivizul.rateguide.data.network

import com.bivizul.rateguide.domain.Strategy
import com.bivizul.rateguide.domain.Terms
import com.bivizul.rateguide.domain.TypesBets
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/4rateguide/types_of_bets.json")
    suspend fun getTypes(): Response<TypesBets>

    @GET("/4rateguide/terms.json")
    suspend fun getTerms(): Response<Terms>

    @GET("/4rateguide/strategy.json")
    suspend fun getStrategy(): Response<Strategy>

}