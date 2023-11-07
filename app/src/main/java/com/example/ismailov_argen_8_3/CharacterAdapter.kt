package com.example.ismailov_argen_8_3
import com.bumptech.glide.Glide
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ismailov_argen_8_3.databinding.ItemCharactersBinding

class CharacterAdapter(private val charaxterList: List<Characters>,val onItemclick:(position:Int)->Unit): RecyclerView.Adapter<CharacterAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(ItemCharactersBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder:viewHolder, position: Int) {
       holder.bind(charaxterList[position])
    }

    override fun getItemCount() = charaxterList.size
    inner class viewHolder(private val binding: ItemCharactersBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(characters: Characters){
            binding.apply {
                characters.apply {
                    tvIsTheyAlive.text =isHeAlive
                    tvCharacterName.text = Name
                    Glide.with(ivCharacterPicture).load(characters.picture).into(ivCharacterPicture)
                }
            }
            itemView.setOnClickListener{
                onItemclick(adapterPosition)
            }
        }
    }
}