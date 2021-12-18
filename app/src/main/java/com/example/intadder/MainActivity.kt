package com.example.intadder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  //  var btnadd: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     // val btnadd = findViewById<Button>(R.id.add)

        add.setOnClickListener(View.OnClickListener{
            Toast.makeText(this@MainActivity,"Hello !!!",Toast.LENGTH_SHORT).show()
            val result = num1.text.toString().toInt() + num2.text.toString().toInt()

            textView.text = result.toString()
        })

    }
}