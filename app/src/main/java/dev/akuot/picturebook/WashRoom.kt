package dev.akuot.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WashRoom : AppCompatActivity() {
    lateinit var btnPrevious5:Button
    lateinit var btnNext5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wash_room)
        btnPrevious5=findViewById(R.id.btnPrevious5)
        btnNext5=findViewById(R.id.btnNext5)


        btnPrevious5.setOnClickListener{
            val intent= Intent(this,KitchenActivity::class.java)
            startActivity(intent)
        }
        btnNext5.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    }
