package me.svbneelmane.aisle_clone.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import dagger.hilt.android.AndroidEntryPoint
import me.svbneelmane.aisle_clone.R
import me.svbneelmane.aisle_clone.databinding.FragmentOtpBinding

@AndroidEntryPoint
class OTPFragment : Fragment(R.layout.fragment_otp) {
    private lateinit var binding: FragmentOtpBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOtpBinding.bind(view)

        binding.buttonVerifyOTP.setOnClickListener {
            navigateToDashboard()
        }
    }

    private fun navigateToDashboard() {
        Navigation.findNavController(requireView())
            .navigate(OTPFragmentDirections.navigateToDashboardFragment())
    }
}