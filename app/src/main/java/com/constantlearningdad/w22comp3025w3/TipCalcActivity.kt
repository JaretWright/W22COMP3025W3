package com.constantlearningdad.w22comp3025w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TipCalcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_calc)
        Log.i("Lifecycle","TipCalcActivity.onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle","TipCalcActivity.onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle","TipCalcActivity.onResume() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle","TipCalcActivity.onStop() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle","TipCalcActivity.onPause() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle","TipCalcActivity.onDest() called")
    }
}