package com.example.umc_3_standard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umc_3_standard.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        supportFragmentManager//시작할 때
            .beginTransaction()
            .replace(viewBinding.frameLayout.id, FirstFragment())
            .commitAllowingStateLoss()

        viewBinding.btnFragment1.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.frameLayout.id, FirstFragment())
                .commitAllowingStateLoss()
        }

        viewBinding.btnFragment2.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.frameLayout.id, SecondFragment())
                .commitAllowingStateLoss()
        }

    }
}