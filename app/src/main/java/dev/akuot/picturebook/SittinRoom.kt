package dev.akuot.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sittingroom : AppCompatActivity() {
    lateinit var btnPrevious2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sittingroom)
        btnPrevious2=findViewById(R.id.btnPrevious2)
        btnNext2=findViewById(R.id.btnNext2)

        btnPrevious2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnNext2.setOnClickListener {
            val intent = Intent(this, BedRoom::class.java)
            startActivity(intent)
        }
    }
}