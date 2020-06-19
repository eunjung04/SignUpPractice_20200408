package com.example.signuppractice_20200408

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_my_page.*

class MyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val name=intent.getStringExtra("userName")
        val age=intent.getIntExtra("userAge",-1)

        userNameTxt.text="${name}:${age}세"
    }

}