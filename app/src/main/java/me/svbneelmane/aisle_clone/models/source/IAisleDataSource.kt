package me.svbneelmane.aisle_clone.models.source

import me.svbneelmane.aisle_clone.models.request.GenerateOTPRequest
import me.svbneelmane.aisle_clone.models.request.VerifyOTPRequest

interface IAisleDataSource {
    suspend fun generateOTP(request: GenerateOTPRequest): Boolean

    suspend fun verifyOTP(request: VerifyOTPRequest): Boolean
}