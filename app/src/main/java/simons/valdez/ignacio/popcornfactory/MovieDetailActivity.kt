package simons.valdez.ignacio.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.sign

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)


        var header:Int = intent.getIntExtra("header", 0)
        var seats:Int = intent.getIntExtra("numberSeats", 0)
        var title:String? = intent.getStringExtra("title")
        var sinopsis:String? = intent.getStringExtra("sinopsis")
        var arraySeats:ArrayList<Client> = intent.getParcelableArrayListExtra<Parcelable>("seats") as ArrayList<Client>
        var position:Int = intent.getIntExtra("position", 0)


        var imageView_header:ImageView = findViewById(R.id.imageView_header) as ImageView
        var textView_title:TextView = findViewById(R.id.textView_title) as TextView
        var textView_sinopsis:TextView = findViewById(R.id.textView_sinopsis) as TextView
        var textView_seatsLeft:TextView = findViewById(R.id.textView_seatsLeft) as TextView
        var button_buyTickets:Button = findViewById(R.id.button_buyTickets)

        imageView_header.setImageResource(header)
        textView_title.setText(title)
        textView_sinopsis.setText(sinopsis)
        textView_seatsLeft.setText("$seats.toString() seats left")

        if(seats <= 0){
            button_buyTickets.isEnabled = false
            button_buyTickets.isClickable = false
        }else{
            button_buyTickets.setOnClickListener{
                var _intent:Intent = Intent(this, SeatSelectionActivity::class.java)
                _intent.putExtra("title", title)
                _intent.putExtra("sinopsis", sinopsis)
                _intent.putExtra("header", header)
                _intent.putExtra("seatsNumber", seats)
                _intent.putExtra("seats", arraySeats)
                _intent.putExtra("position", position)
                startActivity(_intent)
            }
        }

    }
}