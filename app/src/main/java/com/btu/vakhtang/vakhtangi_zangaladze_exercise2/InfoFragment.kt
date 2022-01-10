package com.btu.vakhtang.vakhtangi_zangaladze_exercise2

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import kotlin.random.Random

class InfoFragment : Fragment(R.layout.fragment_info) {

    private lateinit var btnChangeColor: Button
    private lateinit var root: FrameLayout
    private val colors =
        listOf(
            Color.WHITE,
            Color.YELLOW,
            Color.BLUE,
            Color.RED,
            Color.CYAN,
            Color.GREEN,
            Color.MAGENTA,
            Color.LTGRAY
        )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        root = view.findViewById(R.id.root)
        btnChangeColor = view.findViewById(R.id.btnChangeColor)

        btnChangeColor.setOnClickListener {
            root.setBackgroundColor(getRandomColor())
        }
    }

    private fun getRandomColor(): Int {
        Random.apply {
            return colors[nextInt(colors.size)]
        }
    }
}