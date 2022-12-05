package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener { calculate() }

    }

    private fun calculate() {

        val string1Text = binding.tf1First.text.toString()
        val string2Text = binding.tf2Second.text.toString()

        val firstNum = string1Text.toDouble()
        val secondNum = string2Text.toDouble()

        val add = firstNum + secondNum
        binding.tvAdd.text = add.toString()

        val sub = firstNum - secondNum
        binding.tvSub.text = sub.toString()

        val div = firstNum / secondNum
        binding.tvDiv.text = div.toString()

    }



}