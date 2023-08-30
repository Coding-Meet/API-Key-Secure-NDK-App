package com.coding.meet.apikeysecurendk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    object Keys {

        init {
            System.loadLibrary("native-lib")
        }
        external fun APIKey() :String
        external fun APIKey1() :String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiKeyTxt = findViewById<TextView>(R.id.apiKeyTxt)
        Log.d("Api key",Keys.APIKey())
        Log.d("Api Key 1",Keys.APIKey1())
        apiKeyTxt.text = Keys.APIKey() + "\n" + Keys.APIKey1()
    }
}