package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var edx: EditText? =null
    var bun1:Button?=null
    var bun2:Button?=null
    var bun3:Button?=null
    var bun4:Button?=null
    var bun5:Button?=null
    var bun6:Button?=null
    var bun7:Button?=null
    var bun8:Button?=null
    var bun9:Button?=null
    var bun10:Button?=null
    var bun11:Button?=null
    var bun12:Button?=null
    var bun13:Button?=null
    var bun14:Button?=null
    var bun15:Button?=null
    var bun16:Button?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
          edx=findViewById(R.id.ed)
          bun1=findViewById(R.id.bn1)
          bun2=findViewById(R.id.bn2)


        bun1?.setOnClickListener { appendText("1") }
        bun2?.setOnClickListener { appendText("2") }
        

}

    private fun appendText(s: String) {

        edx?.append(s)
        Log.d("CalculatorApp", "Button clicked: $s")
    }

    }
