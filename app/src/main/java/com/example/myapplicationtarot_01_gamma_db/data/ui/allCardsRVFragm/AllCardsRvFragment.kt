package com.example.myapplicationtarot_01_gamma_db.data.ui.allCardsRVFragm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplicationtarot_01_gamma_db.databinding.FragmentAllCardsRvBinding


class AllCardsRvFragment : Fragment() {

    private lateinit var binding: FragmentAllCardsRvBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllCardsRvBinding.inflate(inflater, container, false)
        return binding.root    }

}