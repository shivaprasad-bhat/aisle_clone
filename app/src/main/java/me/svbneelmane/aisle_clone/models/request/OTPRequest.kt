package me.svbneelmane.aisle_clone.models.request

data class GenerateOTPRequest(
    val number: String
)

data class VerifyOTPRequest(
    val number: String,
    val otp: String
)
