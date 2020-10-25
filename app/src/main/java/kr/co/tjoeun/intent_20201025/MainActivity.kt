package kr.co.tjoeun.intent_20201025

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherActivityBtn.setOnClickListener {

//            다른 화면 (MyFirstActivity) 으로 이동

            val myIntent = Intent(this, MyFirstActivity::class.java)
            startActivity(myIntent)

        }

        sendDataBtn.setOnClickListener {

//            다른 화면 (MySecondActivity) 으로 이동
//            가는길에 데이터 (입력한 내용)를 들고 이동.

            val inputContent = contentEdt.text.toString()

            val myIntent = Intent(this, MySecondActivity::class.java) // 비행기 티켓
            myIntent.putExtra("content", inputContent)
            startActivity(myIntent) // 실제 탑승 행위

        }

        changeTextBtn.setOnClickListener {
            val myIntent = Intent(this, EditDataActivity::class.java)
            startActivityForResult(myIntent, 1000)
        }

    }
}