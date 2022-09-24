package me.svbneelmane.aisle_clone.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import me.svbneelmane.aisle_clone.R
import me.svbneelmane.aisle_clone.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    private lateinit var binding: FragmentDashboardBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDashboardBinding.bind(view)
    }

}