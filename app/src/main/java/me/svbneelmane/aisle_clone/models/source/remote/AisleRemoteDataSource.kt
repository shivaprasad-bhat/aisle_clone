package me.svbneelmane.aisle_clone.models.source.remote

import me.svbneelmane.aisle_clone.models.request.GenerateOTPRequest
import me.svbneelmane.aisle_clone.models.source.IAisleDataSource
import me.svbneelmane.aisle_clone.network.services.APIServices
import javax.inject.Inject

class AisleRemoteDataSource @Inject constructor(private val service: APIServices) :
    IAisleDataSource {
    override suspend fun generateOTP(request: GenerateOTPRequest): Boolean {
        return false
    }
}