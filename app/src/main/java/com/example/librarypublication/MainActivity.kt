package com.example.librarypublication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytoolbox.tbx_toOneDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        45.0555.tbx_toOneDecimal()
    }
}