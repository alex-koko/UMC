package com.example.umc_3_standard

import android.view.LayoutInflater
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc_3_standard.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var viewBinding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        viewBinding = FragmentFirstBinding.inflate(layoutInflater)
        return viewBinding.root //setcontentview 대신 return
    }
}