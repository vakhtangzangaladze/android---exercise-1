package com.btu.vakhtang.vakhtangi_zangaladze_exercise2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var etAge: EditText
    private lateinit var btnSend: Button
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)

        btnSend.setOnClickListener { send() }
    }

    private fun init(view: View) {
        etAge = view.findViewById(R.id.etAge)
        btnSend = view.findViewById(R.id.btnSend)
        navController = findNavController()
    }

    private fun send() {
        val age: String = etAge.text.toString()
        navController.navigate(R.id.nav_dashboart, DashboardFragmentArgs(age).toBundle())
    }
}