package com.example.WishBirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.gms.ads.AdRequest.Builder as ComGoogleAndroidGmsAdsAdRequestBuilder


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createbirthdaycard(view: View) {
        val name = nameInput.editableText.toString()
        Toast.makeText(this, "Happy Birthday", Toast.LENGTH_LONG).show()
        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra("name_extra",name)
        startActivity(intent)
    }

    fun Createnewyearcard(view:View){
        val name = nameInput.editableText.toString()
        Toast.makeText(this, "Happy New Year", Toast.LENGTH_LONG).show()
        val intent = Intent(this,NewYearGreeting::class.java)
        intent.putExtra("name_extra1",name)
        startActivity(intent)
    }

}