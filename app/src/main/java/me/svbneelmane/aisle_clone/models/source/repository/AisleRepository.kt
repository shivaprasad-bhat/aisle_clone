package me.svbneelmane.aisle_clone.models.source.repository

import android.util.Log
import me.svbneelmane.aisle_clone.models.request.GenerateOTPRequest
import me.svbneelmane.aisle_clone.models.request.VerifyOTPRequest
import me.svbneelmane.aisle_clone.models.source.IAisleDataSource
import me.svbneelmane.aisle_clone.network.services.APIServices
import javax.inject.Inject

class AisleRepository @Inject constructor(private val service: APIServices) : IAisleDataSource {
    override suspend fun generateOTP(request: GenerateOTPRequest): Boolean {
        return try {
            service.generateOTP(request)
            true
        } catch (e: Exception) {
            Log.d("$$$", e.printStackTrace().toString())
            false
        }
    }

    override suspend fun verifyOTP(request: VerifyOTPRequest): Boolean {
        return try {
            service.verifyOTP(request)
            true
        } catch (e: Exception) {
            false
        }
    }
}