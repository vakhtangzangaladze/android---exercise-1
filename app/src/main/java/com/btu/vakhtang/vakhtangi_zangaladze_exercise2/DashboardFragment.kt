package com.btu.vakhtang.vakhtangi_zangaladze_exercise2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    private lateinit var tvAge: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvAge = view.findViewById(R.id.tvAge)

        arguments?.let {
            val args = DashboardFragmentArgs.fromBundle(it)
            tvAge.text = args.age
        }
    }
}