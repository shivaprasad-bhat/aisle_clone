package me.svbneelmane.aisle_clone.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import dagger.hilt.android.AndroidEntryPoint
import me.svbneelmane.aisle_clone.R
import me.svbneelmane.aisle_clone.databinding.FragmentMobileNumberBinding
import me.svbneelmane.aisle_clone.viewModel.AisleViewModel


@AndroidEntryPoint
class MobileNumberFragment : Fragment(R.layout.fragment_mobile_number) {

    private lateinit var binding: FragmentMobileNumberBinding
    private val aisleViewModel: AisleViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMobileNumberBinding.bind(view)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = aisleViewModel
        }
        observe()
    }

    private fun navigateToOTPScreen() {
        Navigation.findNavController(requireView())
            .navigate(MobileNumberFragmentDirections.navigateToOtpFragment())
    }

    private fun observe() {
        aisleViewModel.success.observe(viewLifecycleOwner) {
            if (it) navigateToOTPScreen()
        }
    }
}