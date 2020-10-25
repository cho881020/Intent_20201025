package kr.co.tjoeun.intent_20201025

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    클래스 정의부분 바로 밑에 적는 (만드는) 변수 : 멤버변수
//    fun 안에서 적는 (만드는) 변수 : 지역변수 - Local변수

//    1000이라는 숫자만 보고서는 의미파악 불가. => 1000을 변수에 담아서, 의미를 이해할 수 있게 도와주자.
    val REQ_FOR_DATA = 1000

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
            startActivityForResult(myIntent, REQ_FOR_DATA)
        }

    }
}