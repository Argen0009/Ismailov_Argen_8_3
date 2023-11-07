package com.example.ismailov_argen_8_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.ismailov_argen_8_3.databinding.FragmentNextBinding
import com.example.ismailov_argen_8_3.databinding.ItemCharactersBinding


class NextFragment : Fragment() {
    private lateinit var binding: FragmentNextBinding
    private lateinit var data:Characters



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentNextBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    data = arguments?.getSerializable("key")as Characters
        binding.apply {
            tvCharacterName.text = data.Name
            tvIsHeAlive.text =data.isHeAlive
            Glide.with(ivCharacterPicture).load(data.picture).into(ivCharacterPicture)
        }
    }

}