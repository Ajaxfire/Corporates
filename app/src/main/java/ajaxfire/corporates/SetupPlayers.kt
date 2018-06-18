package ajaxfire.corporates

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout


class SetupPlayers : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup_players)

        val recyclerView= findViewById(R.id.rvSetupPlayers) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val players = ArrayList<Player>()

        //testing
        players.add(Player(R.string.player1.toString()))
        players.add(Player(R.string.player2.toString()))

        //end testing
        val adapter = PlayerAdapter(players)
        recyclerView.adapter=adapter
    }
}
