package cudra.mohamed.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BackendDevActivity : AppCompatActivity() {
    lateinit var btnBack5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backend_dev)
        btnBack5 = findViewById(R.id.btnBack5)
        btnBack5.setOnClickListener {
            val intent = Intent(this,AndroidDevActivity::class.java)
            startActivity(intent)
        }
    }
}