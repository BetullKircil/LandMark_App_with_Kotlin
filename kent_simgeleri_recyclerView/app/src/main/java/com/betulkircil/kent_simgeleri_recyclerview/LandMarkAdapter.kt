package com.betulkircil.kent_simgeleri_recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.betulkircil.kent_simgeleri_recyclerview.databinding.RecyclerRowBinding

class LandMarkAdapter(val landMark: ArrayList<LandMark>): RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>() {
    class LandMarkHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandMarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landMark.get(position).name
        holder.itemView.setOnClickListener(){
            val intent = Intent(holder.itemView.context, Details_Activity::class.java)
            intent.putExtra("landMark", landMark.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return landMark.size
    }
}