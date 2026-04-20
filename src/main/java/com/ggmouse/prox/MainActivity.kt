package com.ggmouse.prox

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(50, 50, 50, 50)

        val title = TextView(this)
        title.text = "GG Mouse ProX"
        title.textSize = 28f
        title.gravity = Gravity.CENTER

        val btnEnable = Button(this)
        btnEnable.text = "ACTIVAR SERVICIO DE ACCESIBILIDAD"
        btnEnable.setOnClickListener {
            startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
        }

        layout.addView(title)
        layout.addView(btnEnable)
        setContentView(layout)
    }
}
