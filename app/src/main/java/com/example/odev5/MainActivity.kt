package com.example.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button0.setOnClickListener {
            binding.textViewSonuc
        }
        binding.button1.setOnClickListener {

        }
        binding.button2.setOnClickListener {

        }
        binding.button3.setOnClickListener {

        }
        binding.button4.setOnClickListener {

        }
        binding.button5.setOnClickListener {

        }
        binding.button6.setOnClickListener {

        }
        binding.button7.setOnClickListener {

        }
        binding.button8.setOnClickListener {

        }
        binding.button9.setOnClickListener {

        }
        binding.buttonTemizle.setOnClickListener {

        }
        binding.buttonTopla.setOnClickListener {

        }
        binding.buttonEsit.setOnClickListener {









        }

    }

}