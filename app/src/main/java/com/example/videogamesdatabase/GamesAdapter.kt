package com.example.videogamesdatabase

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.videogamesdatabase.modele.Game
import kotlinx.android.synthetic.main.fragment_games.view.*

class GamesAdapter (private val games : ArrayList<Game>) : RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): GamesAdapter.ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.fragment_games,p0,false)
        return ViewHolder(v)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(Game : Game) {
            itemView.textNom.text = Game.nom
            itemView.textGenre.text = Game.genre
            itemView.textConsole.text = Game.console
        }
    }

    override fun getItemCount(): Int {
        return games.size
    }

    override fun onBindViewHolder(p0: GamesAdapter.ViewHolder, p1: Int)
    {
        p0.bindItems(games[p1])
    }

}