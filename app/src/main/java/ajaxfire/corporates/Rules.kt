package ajaxfire.corporates

import ajaxfire.corporates.R.string.ruleDetails
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Html
import kotlinx.android.synthetic.main.activity_rules.*

class Rules : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            textView2.text = (Html.fromHtml(ruleDetails.toString(), Html.FROM_HTML_MODE_COMPACT))
        } else {
            @Suppress("DEPRECATION")
            textView2.text = (Html.fromHtml(ruleDetails.toString()))
        }
    }
}
