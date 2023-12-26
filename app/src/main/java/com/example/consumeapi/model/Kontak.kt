package com.example.consumeapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    @SerialName(value = "id")
    val id: Int,
    @SerialName(value = "nama")
    val nama: String,
    val email: String,
    val nohp: String
)
