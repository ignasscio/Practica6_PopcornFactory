package simons.valdez.ignacio.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)


        var header:Int = intent.getIntExtra("header", 0)
        var title:String? = intent.getStringExtra("title")
        var sinopsis:String? = intent.getStringExtra("sinopsis")

        var imageView_header:ImageView = findViewById(R.id.imageView_header) as ImageView
        var textView_title:TextView = findViewById(R.id.textView_title) as TextView
        var textView_sinopsis:TextView = findViewById(R.id.textView_sinopsis) as TextView

        imageView_header.setImageResource(header)
        textView_title.setText(title)
        textView_sinopsis.setText(sinopsis)

    }
}