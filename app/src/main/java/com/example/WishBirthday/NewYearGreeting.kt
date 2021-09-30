package com.example.WishBirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_year_greeting.*

class NewYearGreeting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_year_greeting)

        val name = intent.getStringExtra("name_extra1")
        greet1.text="Happy New Year\n $name!"
    }
}