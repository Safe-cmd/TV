package com.example.activity_tv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat // 添加这一行导入 WindowCompat 类

class AboutSettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_settings)

        // 添加这一行代码，让内容可以绘制到系统栏 (包括状态栏) 后面
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // 您可以在这里继续添加获取视图和设置监听器的代码，例如：
        // val deviceNameTextView = findViewById<TextView>(R.id.text_device_name) // 假设设备名称有一个ID
        // deviceNameTextView.text = "你的设备名称" // 设置设备名称文本
    }
}