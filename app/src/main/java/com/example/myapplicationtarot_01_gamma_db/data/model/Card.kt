package com.example.myapplicationtarot_01_gamma_db.data.model

data class Card (
    val type: String,
    val name: String,
    val name_short: String,
    val value: String,
    val value_int: Int,
    val meaning_up: String,
    val meaning_rev: String,
    val desc: String
        )