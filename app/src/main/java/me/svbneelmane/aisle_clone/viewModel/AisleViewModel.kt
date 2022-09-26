package me.svbneelmane.aisle_clone.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.svbneelmane.aisle_clone.models.repository.AisleRepository
import me.svbneelmane.aisle_clone.models.request.GenerateOTPRequest
import javax.inject.Inject

@HiltViewModel
class AisleViewModel @Inject constructor(private val repository: AisleRepository) : ViewModel() {

    private var _success = MutableLiveData(false)
    val success: LiveData<Boolean>
        get() = _success

    val mobileNumber = MutableLiveData("")

    fun generateOTP() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val result = repository.generateOTP(GenerateOTPRequest("+918747068436"))
                _success.postValue(result)
            }

        }
    }
}