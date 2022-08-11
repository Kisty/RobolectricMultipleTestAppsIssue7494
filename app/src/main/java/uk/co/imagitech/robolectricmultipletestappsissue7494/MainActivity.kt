package uk.co.imagitech.robolectricmultipletestappsissue7494

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import uk.co.imagitech.citb.robolectricmultipletestappsissue7494.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textView).text = (application as App).mainValue.toString()
    }
}