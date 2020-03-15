package com.example.logicappquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCheck.setOnClickListener{ checkAns() }
    }

    private fun checkAns() {
        var rslt = 0

        if (answerRowOne.text.toString() == getText(R.string.t)) {rslt+=1}
        if (answerRowTwo.text.toString() == getText(R.string.f)) {rslt+=1}
        if (answerRowThree.text.toString() == getText(R.string.f)) {rslt+=1}
        if (answerRowFour.text.toString() == getText(R.string.f)) {rslt+=1}

        toast(rslt)
    }

    private fun toast(rslt:Int) {
        Toast.makeText(this, getString(R.string.resultText, rslt), Toast.LENGTH_SHORT).show()
    }
}
