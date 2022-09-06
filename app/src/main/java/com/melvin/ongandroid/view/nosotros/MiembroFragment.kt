package com.melvin.ongandroid.view.nosotros

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.melvin.ongandroid.databinding.MiembroFragmentBinding
import com.melvin.ongandroid.model.Miembros

class MiembroFragment : Fragment() {

    lateinit var binding: MiembroFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = MiembroFragmentBinding.inflate(inflater, container, false)



        return binding.root
    }

    private fun onItemSelected(miembros: Miembros) {
        val bundle = Bundle()
        bundle.putString("name", miembros.name)
        bundle.putString("roll", miembros.description)
        bundle.putString("facebookLink", miembros.facebookUrl)
        bundle.putString("linkedinLink", miembros.linkedinUrl)
        bundle.putString("picture", miembros.image)

    }
     fun facebookLink(url: String) {
        val browsableIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        ContextCompat.startActivity(requireContext(),browsableIntent,null)
    }

    fun linkedinLink(url: String) {
        val browsableIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        ContextCompat.startActivity(requireContext(),browsableIntent,null)
    }

}