package com.example.githubapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View
import android.widget.EditText

class LogInActivity : AppCompatActivity() {

    private val logIn:Button by lazy{
        findViewById<Button>(R.id.btn_login)
    }

    private val inputUserName:EditText by lazy{
        findViewById<EditText>(R.id.input_username)
    }

    //val i = Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        logIn.setOnClickListener() {}
    }

    /*
    fun getUser(view: View) : Unit {
        i = Intent(LogInActivity.this, UserActivity.class)
    }
    */
}
