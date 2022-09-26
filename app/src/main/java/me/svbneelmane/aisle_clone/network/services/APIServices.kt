package me.svbneelmane.aisle_clone.network.services

import me.svbneelmane.aisle_clone.models.request.GenerateOTPRequest
import me.svbneelmane.aisle_clone.models.request.VerifyOTPRequest
import me.svbneelmane.aisle_clone.models.response.GenerateOTPResponse
import me.svbneelmane.aisle_clone.models.response.VerifyOTPResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface APIServices {

    @POST("users/phone_number_login")
    suspend fun generateOTP(
        @Body body: GenerateOTPRequest
    ): GenerateOTPResponse

    @POST("users/verify_otp")
    suspend fun verifyOTP(
        @Body body: VerifyOTPRequest
    ): VerifyOTPResponse
}