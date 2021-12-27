package com.example.intadder

import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  //  var btnadd: Button? = null
    val TAG = "MyApp"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: ")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1 = 0;
        var num2 = 0;
        var result = 0;
        var c = ' ';

        btnPlus.setOnClickListener(
            View.OnClickListener {
                num1 = etpanel.text.toString().toInt()
                etpanel.getText().clear()
                c = '+'
            }
        )

        btnC.setOnClickListener(
            View.OnClickListener {
                etpanel.getText().clear()
            }
        )

        btnSub.setOnClickListener(
            View.OnClickListener {
                num1 = etpanel.text.toString().toInt()
                etpanel.getText().clear()
                c = '-'

            }
        )
        btnMult.setOnClickListener(
            View.OnClickListener {
                num1 = etpanel.text.toString().toInt()
                etpanel.getText().clear()
                c = '*'

            }
        )
        btnDiv.setOnClickListener(
            View.OnClickListener {
                num1 = etpanel.text.toString().toInt()
                etpanel.getText().clear()
                c = '/'

            }
        )

        btnEq.setOnClickListener(View.OnClickListener {
            num2 = etpanel.text.toString().toInt()
            etpanel.getText().clear()

            when(c){
                '+' ->{
                  result = num1+num2
                }
                '-'->{
                    result = num1-num2
                }
                '*'->{
                    result = num1*num2
                }
                '/'->{
                    result = num1/num2
                }
                else ->{
                    result = 0
                }
            }

            etpanel.setText(result.toString())

        })

        btn0.setOnClickListener(
            View.OnClickListener {
                etpanel.text = etpanel.text.append("0");
            }
        )

        btn1.setOnClickListener(
            View.OnClickListener {
              etpanel.text = etpanel.text.append("1");
            }
        )

        btn2.setOnClickListener(
            View.OnClickListener {
                etpanel.text = etpanel.text.append("2");
            }
        )

        btn3.setOnClickListener(
            View.OnClickListener {
                etpanel.text = etpanel.text.append("3");
            }
        )

        btn4.setOnClickListener(
            View.OnClickListener {
                etpanel.text = etpanel.text.append("4");
            }
        )

        btn5.setOnClickListener(
            View.OnClickListener {
                etpanel.text = etpanel.text.append("5");
            }
        )

        btn6.setOnClickListener(
            View.OnClickListener {
                etpanel.text = etpanel.text.append("6");
            }
        )


        btn7.setOnClickListener(
            View.OnClickListener {
                etpanel.text = etpanel.text.append("7");
            }
        )

        btn8.setOnClickListener(
            View.OnClickListener {
                etpanel.text = etpanel.text.append("8");
            }
        )

        btn9.setOnClickListener(
            View.OnClickListener {
                etpanel.text = etpanel.text.append("9");
            }
        )



        // val btnadd = findViewById<Button>(R.id.add)

//        add.setOnClickListener(View.OnClickListener{
//
//            Log.d(TAG, "button pressed")
//            Toast.makeText(this@MainActivity,"Hello !!!",Toast.LENGTH_SHORT).show()
//            val result = num1.text.toString().toInt() + num2.text.toString().toInt()
//
//            textView.text = result.toString()
//        })

    }
}