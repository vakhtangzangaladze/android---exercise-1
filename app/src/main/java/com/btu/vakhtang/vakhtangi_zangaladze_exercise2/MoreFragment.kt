package com.btu.vakhtang.vakhtangi_zangaladze_exercise2

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import androidx.fragment.app.Fragment

class MoreFragment: Fragment(R.layout.fragment_more) {

    private lateinit var switchPush: SwitchCompat
    private lateinit var switchEmail: SwitchCompat
    private lateinit var switchSMS: SwitchCompat

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        switchPush = view.findViewById(R.id.switchPush)
        switchEmail = view.findViewById(R.id.switchEmail)
        switchSMS = view.findViewById(R.id.switchSMS)

        switchPush.setOnCheckedChangeListener { _, b ->
            if (b)
                Toast.makeText(requireContext(), "ამიერიდან მიიღებთ შეტყობინებებს", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(requireContext(), "შეტყობინებები გამორთულია", Toast.LENGTH_SHORT).show()
        }

        switchEmail.setOnCheckedChangeListener { _, b ->
            if (b)
                Toast.makeText(requireContext(), "ამიერიდან მიიღებთ ელ.ფოსტებს", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(requireContext(), "ელ. ფოსტებს აღარ მიიღებთ", Toast.LENGTH_SHORT).show()
        }

        switchSMS.setOnCheckedChangeListener { _, b ->
            if (b)
                Toast.makeText(requireContext(), "SMS შეტყობინებები ჩაირთო", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(requireContext(), "SMS შეტყობინებები გამორთულია", Toast.LENGTH_SHORT).show()
        }
    }
}