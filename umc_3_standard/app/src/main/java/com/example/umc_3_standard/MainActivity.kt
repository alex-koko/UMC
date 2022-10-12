package com.example.umc_3_standard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.umc_3_standard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.btnAct1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text", viewBinding.etUser.text.toString())
            startActivity(intent)
        }
    }
}