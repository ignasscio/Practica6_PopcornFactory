package simons.valdez.ignacio.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.*

class SeatSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        /**
        _intent.putExtra("title", title)
        _intent.putExtra("sinopsis", sinopsis)
        _intent.putExtra("header", header)
        _intent.putExtra("seatsNumber", seats)
        _intent.putExtra("seats", arraySeats)
        _intent.putExtra("position", position)
         */

        var textView_titleSeats:TextView = findViewById(R.id.textView_titleSeats) as TextView
        var button_confirm:Button = findViewById(R.id.button_confirm) as Button
        var radioGroup_row1:RadioGroup = findViewById(R.id.radioGroup_row1) as RadioGroup
        var radioGroup_row2:RadioGroup = findViewById(R.id.radioGroup_row2) as RadioGroup
        var radioGroup_row3:RadioGroup = findViewById(R.id.radioGroup_row3) as RadioGroup
        var radioGroup_row4:RadioGroup = findViewById(R.id.radioGroup_row4) as RadioGroup

        var title:String? = intent.getStringExtra("title")
        var position:Int = if(intent.getIntExtra("position", 0) >= 1) intent.getIntExtra("position", 0) else 0
        var seatsNumber:Int = intent.getIntExtra("seatsNumber", 0)
        var seats:ArrayList<Client> = intent.getParcelableArrayListExtra<Parcelable>("seats") as ArrayList<Client>

        textView_titleSeats.setText(title)

        button_confirm.setOnClickListener{

            Toast.makeText(this, "Disfrute su movie", Toast.LENGTH_LONG).show()
        }

        radioGroup_row1.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId > -1){
                radioGroup_row2.clearCheck()
                radioGroup_row3.clearCheck()
                radioGroup_row4.clearCheck()
                radioGroup_row1.check(checkedId)
            }
        }

        radioGroup_row2.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId > -1){
                radioGroup_row1.clearCheck()
                radioGroup_row3.clearCheck()
                radioGroup_row4.clearCheck()
                radioGroup_row2.check(checkedId)
            }
        }

        radioGroup_row3.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId > -1){
                radioGroup_row2.clearCheck()
                radioGroup_row1.clearCheck()
                radioGroup_row4.clearCheck()
                radioGroup_row3.check(checkedId)
            }
        }

        radioGroup_row4.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId > -1){
                radioGroup_row2.clearCheck()
                radioGroup_row3.clearCheck()
                radioGroup_row1.clearCheck()
                radioGroup_row4.check(checkedId)
            }
        }



    }
}