package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createBirthdayCard(view: View) {

        val nameInput: EditText = findViewById(R.id.nameInput)
        val name = nameInput.text.toString()

        val intent = Intent(this, BirthdayGreetingActivity::class.java)

        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)

        startActivity(intent)

    }




}