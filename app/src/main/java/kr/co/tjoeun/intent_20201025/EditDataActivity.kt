package kr.co.tjoeun.intent_20201025

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_data.*

class EditDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_data)

        okBtn.setOnClickListener {

            val inputData = newDataEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("newData", inputData)

            setResult(Activity.RESULT_OK, resultIntent)

            finish()

        }

    }

}