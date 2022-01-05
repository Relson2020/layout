package com.example.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.buttonAdapter.setOnClickListener {
            val intent = Intent(this,ListView::class.java)
            startActivity(intent)
        }

        binding.buttonMotion.setOnClickListener {
            val intent = Intent(this,MotionLayout::class.java)
            startActivity(intent)
        }
    }


}