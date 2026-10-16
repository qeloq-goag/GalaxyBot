package com.qeloq.galaxybot

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(18, 20, 30))
        }

        val title = TextView(this).apply {
            text = "GALAXY BOT"
            textSize = 30f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val info = TextView(this).apply {
            text = "\nWersja testowa\n\nAutomatyczne rozpoznawanie planszy nie jest jeszcze dostępne."
            textSize = 17f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val button = Button(this).apply {
            text = "GOTOWY DO TESTÓW"
            setOnClickListener {
                info.text = "\nAplikacja działa poprawnie.\n\nSterowanie grą dodamy w kolejnej wersji."
            }
        }

        layout.addView(title)
        layout.addView(info)
        layout.addView(button)
        setContentView(layout)
    }
}
