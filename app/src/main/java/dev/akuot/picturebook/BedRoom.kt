package dev.akuot.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BedRoom : AppCompatActivity() {
    lateinit var btnPrevious3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_bed_room)
        btnPrevious3 =findViewById(R.id.btnPrevious3)
        btnNext3=findViewById(R.id.btnNext3)

        btnPrevious3.setOnClickListener{
            val intent=Intent(this,Sittingroom::class.java)
            startActivity(intent)
        }
        btnNext3.setOnClickListener{
            val intent=Intent(this,KitchenActivity::class.java)
            startActivity(intent)
        }
    }
}