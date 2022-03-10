package com.example.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample.databinding.ActivityMain2Binding
import com.example.intentexample.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val str : String? = intent.getStringExtra("TXT")
        binding.textView.text = str

        binding.button.setOnClickListener {
            val xintent = Intent(this,MainActivity::class.java)
            xintent.putExtra("TXT",binding.editTextTextPersonName.text?.toString())
            startActivity(xintent)
            finish()
        }

    }
}
