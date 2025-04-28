package com.example.activity_tv

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {

    private lateinit var itemNetwork: LinearLayout
    private lateinit var itemBluetooth: LinearLayout
    private lateinit var itemProjector: LinearLayout
    private lateinit var itemImageVideo: LinearLayout
    private lateinit var itemSound: LinearLayout
    private lateinit var itemSystem: LinearLayout
    private lateinit var itemSignalSource: LinearLayout
    private lateinit var itemSmartWall: LinearLayout
    private lateinit var itemAbout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        itemNetwork      = findViewById(R.id.item_network)
        itemBluetooth    = findViewById(R.id.item_bluetooth)
        itemProjector    = findViewById(R.id.item_projector)
        itemImageVideo   = findViewById(R.id.item_image_video)
        itemSound        = findViewById(R.id.item_sound)
        itemSystem       = findViewById(R.id.item_system)
        itemSignalSource = findViewById(R.id.item_signal_sourc)
        itemSmartWall = findViewById(R.id.item_signal_source)
        itemAbout        = findViewById(R.id.item_about)

        // 网络
        itemNetwork.setOnClickListener {
            it.isSelected = true
            startActivity(Intent(this, NetworkSettingsActivity::class.java))
        }

// 蓝牙
        itemBluetooth.setOnClickListener {
            it.isSelected = true
            startActivity(Intent(this, BluetoothSettingsActivity::class.java))
        }

// 投影
        itemProjector.setOnClickListener {
            it.isSelected = true
            startActivity(Intent(this, ProjectorSettingsActivity::class.java))
        }

// 图像视频
        itemImageVideo.setOnClickListener {
            it.isSelected = true
            startActivity(Intent(this, ImageVideoSettingsActivity::class.java))
        }

// 声音
        itemSound.setOnClickListener {
            it.isSelected = true
            startActivity(Intent(this, SoundSettingsActivity::class.java))
        }

// 系统
        itemSystem.setOnClickListener {
            it.isSelected = true
            startActivity(Intent(this, SystemSettingsActivity::class.java))
        }

// 信号源
        itemSignalSource.setOnClickListener {
            it.isSelected = true
            startActivity(Intent(this, SignalSourceSettingsActivity::class.java))
        }

// 智慧墙
        itemSmartWall.setOnClickListener {
            it.isSelected = true
            startActivity(Intent(this, SmartWallSettingsActivity::class.java))
        }

// 关于本机
        itemAbout.setOnClickListener {
            it.isSelected = true
            startActivity(Intent(this, AboutSettingsActivity::class.java))
        }

    }
}