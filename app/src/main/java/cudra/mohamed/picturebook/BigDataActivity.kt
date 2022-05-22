package cudra.mohamed.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BigDataActivity : AppCompatActivity() {
    lateinit var btnBack2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_big_data)
        btnBack2=findViewById(R.id.btnBack2)
        btnNext2=findViewById(R.id.btnNext2)

        btnBack2.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNext2.setOnClickListener {
            val intent=Intent(this,UiUxActivity::class.java)
            startActivity(intent)
        }
    }
}