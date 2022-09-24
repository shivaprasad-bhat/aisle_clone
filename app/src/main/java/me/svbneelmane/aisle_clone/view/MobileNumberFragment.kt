package me.svbneelmane.aisle_clone.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import me.svbneelmane.aisle_clone.R
import me.svbneelmane.aisle_clone.databinding.FragmentMobileNumberBinding

class MobileNumberFragment : Fragment(R.layout.fragment_mobile_number) {

    private lateinit var binding: FragmentMobileNumberBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMobileNumberBinding.bind(view)
    }
}