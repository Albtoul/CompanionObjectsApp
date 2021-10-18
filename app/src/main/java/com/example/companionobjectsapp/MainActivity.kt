package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var  layout:ConstraintLayout
    lateinit var ed:EditText
    lateinit var tv:TextView
    lateinit var bt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout=findViewById(R.id.layout)
        ed=findViewById(R.id.morningOrNight)
        tv=findViewById(R.id.textview)
        bt=findViewById(R.id.change)

        bt.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var str =ed.text?.toString()
                when(str?.toLowerCase()){
                    "morning"->{
                        val X=ImageClass()
                      X.selectBackground(layout ,ImageClass.morning)
                        ed.setTextColor(Color.BLACK)
                        tv.setTextColor(Color.BLACK)

                    }
                    "night"->{val X=ImageClass()
                        X.selectBackground(layout ,ImageClass.night)
                        ed.setTextColor(Color.WHITE)
                        tv.setTextColor(Color.WHITE) }
                }


            }


        })
    }
}