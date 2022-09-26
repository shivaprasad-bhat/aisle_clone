package me.svbneelmane.aisle_clone.models.response

data class GenerateOTPResponse(
    var status: Boolean
)

data class VerifyOTPResponse(
    val token: String?
)