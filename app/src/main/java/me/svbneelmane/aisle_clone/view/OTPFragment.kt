package me.svbneelmane.aisle_clone.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import dagger.hilt.android.AndroidEntryPoint
import me.svbneelmane.aisle_clone.R
import me.svbneelmane.aisle_clone.databinding.FragmentOtpBinding
import me.svbneelmane.aisle_clone.viewModel.AisleViewModel

@AndroidEntryPoint
class OTPFragment : Fragment(R.layout.fragment_otp) {
    private lateinit var binding: FragmentOtpBinding
    private val aisleViewModel: AisleViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOtpBinding.bind(view)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = aisleViewModel
        }

        observe()
        Toast.makeText(
            requireContext(),
            "Mobile Number is ${aisleViewModel.mobileNumber.value}",
            Toast.LENGTH_LONG
        ).show()
    }

    private fun navigateToDashboard() {
        Navigation.findNavController(requireView())
            .navigate(OTPFragmentDirections.navigateToDashboardFragment())
    }

    private fun observe() {
        aisleViewModel.otpValidationSuccess.observe(viewLifecycleOwner) {
            if (it) navigateToDashboard()
        }
    }
}