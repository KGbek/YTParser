package com.example.ytparser.ui.fragments.playlists

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.example.ytparser.R

class PlaylistAdapter: RecyclerView.Adapter<PlaylistAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_placeholder, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        var videoView = view.findViewById<VideoView>(R.id.video)
        var playlistText = view.findViewById<TextView>(R.id.playlistText)
        var textDescription = view.findViewById<TextView>(R.id.text_description)
        var textVideoSeries = view.findViewById<TextView>(R.id.text_video_series)
    }
}