package com.example.signuppractice_20200408

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_address.*
import kotlinx.android.synthetic.main.activity_edit_name.*
import kotlinx.android.synthetic.main.activity_edit_name.okBtn

class EditAddressActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_address)

        okBtn.setOnClickListener {
            //입력을 제대로 완료하겠다.=>돌아가는길에 데이터 첨부.
            //데이터 첨부 전용 Intent 생성=>출발지/목적지 적지 않는다.

            val resultIntent= Intent()
            resultIntent.putExtra("mainAddress",mainAddressEdt.text.toString())
            resultIntent.putExtra("detailAddress", detailAddressEdt.text.toString())

            //입력 완료를 눌렀다 명시+들고갈 데이터 : resultIntent에 있다.
            setResult(Activity.RESULT_OK,resultIntent)

            //결과 세팅이 끝났으니 호면 종료.
            finish()
        }
    }
}