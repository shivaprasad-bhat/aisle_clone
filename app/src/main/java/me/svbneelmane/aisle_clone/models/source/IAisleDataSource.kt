package me.svbneelmane.aisle_clone.models.source

import me.svbneelmane.aisle_clone.models.request.GenerateOTPRequest

interface IAisleDataSource {
    suspend fun generateOTP(request: GenerateOTPRequest): Boolean
}