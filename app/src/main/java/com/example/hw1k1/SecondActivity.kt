package com.example.hw1k1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hw1k1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buffer: String? = intent.getStringExtra("sendData")
        Log.d("f_global", "onCreate: $buffer")

        binding.editText.setText(buffer)

        binding.btnChange.setOnClickListener {
            setResult(RESULT_OK, intent.putExtra("changeData", binding.editText.text.toString()))
            finish()
        }
    }
}