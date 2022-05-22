package com.bivizul.rateguide.domain

import androidx.annotation.Keep

@Keep
data class Strategy(
    val catch_up: String,
    val corridor: String,
    val even_odd: String,
    val ladder: String,
    val martingale: String,
    val penalty: String,
    val surebets: String,
    val yellow_cards: String,
)