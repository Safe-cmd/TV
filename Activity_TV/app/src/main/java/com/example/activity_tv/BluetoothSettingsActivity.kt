package com.example.activity_tv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import android.widget.Button
import androidx.core.view.WindowCompat

class BluetoothSettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bluetooth_settings)

        val scanningButton = findViewById<Button>(R.id.scanning_button)

        WindowCompat.setDecorFitsSystemWindows(window, false)
        scanningButton.setOnClickListener {
            scanningButton.setBackgroundColor(ContextCompat.getColor(this, R.color.orange))
            // 模拟扫描过程
            scanningButton.postDelayed({
                scanningButton.setBackgroundColor(ContextCompat.getColor(this, R.color.light_blue))
            }, 2000) // 2秒后恢复
        }
    }
}