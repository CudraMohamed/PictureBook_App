package cudra.mohamed.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UiUxActivity : AppCompatActivity() {
    lateinit var btnBack3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_ux)
        btnBack3=findViewById(R.id.btnBack3)
        btnNext3=findViewById(R.id.btnNext3)

        btnBack3.setOnClickListener {
            val intent= Intent(this,BigDataActivity::class.java)
            startActivity(intent)
        }
        btnNext3.setOnClickListener {
            val intent= Intent(this,AndroidDevActivity::class.java)
            startActivity(intent)
        }
    }
}