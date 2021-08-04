package org.organization.akhdanpangestuaji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import org.organization.akhdanpangestuaji.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener { calculateVolume() }
    }

    private fun calculateVolume() {

        val length = binding.edtLength.text.toString().toFloat()
        val height = binding.edtHeight.text.toString().toFloat()
        val width = binding.edtWidth.text.toString().toFloat()

        val volume = length * height * width
        binding.tvResult.text = volume.toString()

    }
}

