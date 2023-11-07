package com.example.ismailov_argen_8_3


import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ismailov_argen_8_3.databinding.FragmentMainBinding
import java.text.FieldPosition


class MainFragment : androidx.fragment.app.Fragment() {
private lateinit var binding:FragmentMainBinding

    private val characterList = arrayListOf(
        Characters("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRjJ4OFwM6CDr5ztLzld2EgvynPYCQSvMmjA&usqp=CAU","Itachi","Death"),
        Characters("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRf-k0sWAtm4B_T2C1JBA9zGaG2DHGUIuS9Ig&usqp=CAU","Naruto","Alive"),
        Characters("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPkAGFPOWSb1BuzUnLt57I3pCeTGYwxjh818GY0loNXIyK5iDXwYUDi0XfY6ArAnDWMds&usqp=CAU","Sasuke","Alive"),

    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = CharacterAdapter(characterList,this:: OnClick)
        binding.rvCharacters.adapter = adapter
    }
    private fun OnClick(position: Int) {
        findNavController().navigate(R.id.nextFragment2, bundleOf("key" to characterList[position]))
    }


}