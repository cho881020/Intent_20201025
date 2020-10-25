package kr.co.tjoeun.intent_20201025

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_first.*

class MyFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_first)

        returnToMainBtn.setOnClickListener {

//            현재 화면을 종료하고 이전으로 돌아가자.
//            Intent 쓰는것 대신 => finish() 처리

//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

            finish()

        }

    }
}