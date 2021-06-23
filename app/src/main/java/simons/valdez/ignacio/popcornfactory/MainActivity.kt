package simons.valdez.ignacio.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_getmein:Button = findViewById(R.id.button_getmein) as Button

        button_getmein.setOnClickListener {
            var intent: Intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }



    }
}