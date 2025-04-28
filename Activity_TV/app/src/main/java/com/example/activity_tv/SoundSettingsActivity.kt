package com.example.activity_tv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Switch
import androidx.core.view.WindowCompat

class SoundSettingsActivity : AppCompatActivity() {

    private lateinit var makeCallSwitch: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sound_settings)

        makeCallSwitch = findViewById(R.id.make_call_switch)
        WindowCompat.setDecorFitsSystemWindows(window, false)

    }
}
