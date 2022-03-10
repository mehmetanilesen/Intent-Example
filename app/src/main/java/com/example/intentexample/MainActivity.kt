package com.example.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val str : String? = intent.getStringExtra("TXT")
        binding.textView.text = str

        binding.button.setOnClickListener {
            val xintent = Intent(this,MainActivity2::class.java)
            xintent.putExtra("TXT",binding.editTextTextPersonName.text?.toString())
            startActivity(xintent)
            finish()
        }
    }
}