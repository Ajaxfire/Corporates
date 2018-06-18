package ajaxfire.corporates

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class PlayerAdapter (private val playerList: ArrayList<Player>): RecyclerView.Adapter<PlayerAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int): PlayerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.player_list, parent, false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder:PlayerAdapter.ViewHolder, position:Int){
        holder.bindItems(playerList[position])
    }

    override fun getItemCount():Int{
        return playerList.size
    }

    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        fun bindItems(player: Player){
            val textViewName=itemView.findViewById(R.id.txtPlayerName) as TextView
            textViewName.text = player.name
        }
    }
}