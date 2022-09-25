package me.svbneelmane.aisle_clone.services

import me.svbneelmane.aisle_clone.models.request.GenerateOTPRequest
import me.svbneelmane.aisle_clone.models.response.GenerateOTPResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Url

interface APIServices {

    @POST
    fun generateOTP(
        @Url url: String,
        @Body body: GenerateOTPRequest
    ): Call<GenerateOTPResponse>
}