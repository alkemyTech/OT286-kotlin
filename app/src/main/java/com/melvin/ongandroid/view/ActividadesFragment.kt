package com.melvin.ongandroid.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.melvin.ongandroid.R

class ActividadesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_main, container, false)
        val button = view.findViewById<Button>(R.id.bottom_navigation)
        button.setOnClickListener{
            findNavController().navigate(R.id.firstFragment2)

        }
        return view
    }


}