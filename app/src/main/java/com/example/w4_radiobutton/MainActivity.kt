package com.example.w4_radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text=findViewById<EditText>(R.id.editText)
        val radio=findViewById<RadioGroup>(R.id.radio)
        val java=findViewById<RadioButton>(R.id.buttonJava)
        val js=findViewById<RadioButton>(R.id.buttonJS)
        val csharp=findViewById<RadioButton>(R.id.buttonCSharp)
        val kotlin=findViewById<RadioButton>(R.id.buttonKotlin)
        java.setOnClickListener{text.setText("Выбрана Java")}
        js.setOnClickListener{text.setText("Выбрана JavaScript")}
        csharp.setOnClickListener{text.setText("Выбран C#")}


        kotlin.setOnClickListener{text.setText("Ого, выбран Kotlin")}


    }
}