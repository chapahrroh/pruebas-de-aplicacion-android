package com.chapahrroh.almamaintenencetimetraker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // leccion 8
        nullSafety()

    }
    fun nullSafety()
    {
        var myString = "Chapa"
        println(myString)
    }
}