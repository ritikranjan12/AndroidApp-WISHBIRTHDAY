package com.example.WishBirthday

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import java.util.*


class BirthdayGreetingActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)



        val name = intent.getStringExtra("name_extra")
        BirthdayGreeting.text = "Happy Birthday\n $name!"


    }
    
}