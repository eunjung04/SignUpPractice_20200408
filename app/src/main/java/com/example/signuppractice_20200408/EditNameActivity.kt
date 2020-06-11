package com.example.signuppractice_20200408

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_name)

        okBtn.setOnClickListener {
            val myIntent= Intent(this, MyPageActivity::class.java)
            startActivity(myIntent)
        }
    }
}