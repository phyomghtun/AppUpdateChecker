package com.appupdater.maunghtun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appupdater.mghtun.UpdateChecker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UpdateChecker.checkForUpdate(this,"https://raw.githubusercontent.com/mtapplication/temp_data/main/update.json",applicationContext.packageName)
    }
}