package me.svbneelmane.aisle_clone.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.svbneelmane.aisle_clone.models.request.GenerateOTPRequest
import me.svbneelmane.aisle_clone.models.request.VerifyOTPRequest
import me.svbneelmane.aisle_clone.models.source.repository.AisleRepository
import javax.inject.Inject

@HiltViewModel
class AisleViewModel @Inject constructor(private val repository: AisleRepository) : ViewModel() {

    private var _success = MutableLiveData(false)
    val success: LiveData<Boolean>
        get() = _success

    private var _otpValidationSuccess = MutableLiveData(false)
    val otpValidationSuccess: LiveData<Boolean>
        get() = _otpValidationSuccess

    val mobileNumber = MutableLiveData("")
    val otp = MutableLiveData("")

    /**
     * Generate OTP API call initialization
     */
    fun generateOTP() {
        _success.postValue(false)
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val result =
                    repository.generateOTP(GenerateOTPRequest(mobileNumber.value.toString()))
                _success.postValue(result)
            }

        }
    }

    /**
     * Verify OTP call initialization
     */
    fun verifyOTP() {
        _otpValidationSuccess.postValue(false)
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val result = repository.verifyOTP(
                    VerifyOTPRequest(
                        mobileNumber.value.toString(),
                        otp.value.toString()
                    )
                )
                _otpValidationSuccess.postValue(result)
            }
        }
    }
}