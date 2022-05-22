package dev.akuot.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KitchenActivity : AppCompatActivity() {
    lateinit var btnPrevious4:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kitchen)
        btnPrevious4=findViewById(R.id.btnPrevious4)
        btnNext4=findViewById(R.id.btnNext4)



        btnPrevious4.setOnClickListener{
            val intent=Intent(this,BedRoom::class.java)
            startActivity(intent)
        }
        btnNext4.setOnClickListener{
            val intent=Intent(this,WashRoom::class.java)
            startActivity(intent)
        }


    }
}