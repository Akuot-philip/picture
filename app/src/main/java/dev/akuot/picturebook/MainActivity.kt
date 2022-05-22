package dev.akuot.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPrevious:Button
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPrevious =findViewById(R.id.btnPrevious)
        btnNext=findViewById(R.id.btnNext)

        btnPrevious.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, Sittingroom::class.java)
            startActivity(intent)

        }
    }
}