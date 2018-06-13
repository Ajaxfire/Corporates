package ajaxfire.corporates


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //New Game Screen
        // get reference to button
        // set on-click listener
        btnNewGame.setOnClickListener {
            // your code to perform when the user clicks on the button
            //Toast.makeText(this@MainActivity, "You want to play the game.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, SetupPlayers::class.java)
            startActivity(intent)
        }

        //Rules Button
        btnRules.setOnClickListener {
                // Handler code here.
                val intent = Intent(this@MainActivity, Rules::class.java)
                startActivity(intent)
        }
    }
}
