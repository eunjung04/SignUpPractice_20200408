package com.example.signuppractice_20200408

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_name.*

class EditNameActivity : AppCompatActivity() {

    //1000이라는 숫자가, 주소를 얻기위한 요청이라고 메모
    val REQ_FOR_ADDRESS=1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_name)

        inputAddressBtn.setOnClickListener {
            val myIntent=Intent(this,EditAddressActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_ADDRESS)
        }

        okBtn.setOnClickListener {

            val inputName=nameEdt.text.toString()
            //String -> Int?
            val inputBirthYear=birthYearEdt.text.toString().toInt()

            val myIntent= Intent(this, MyPageActivity::class.java)
            myIntent.putExtra("userName",inputName)
            myIntent.putExtra("UserAge",2020-inputBirthYear+1)
            startActivity(myIntent)
        }
    }
}