package com.constantlearningdad.w22comp3025w3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.constantlearningdad.w22comp3025w3.databinding.ActivityMainBinding

//public class MainActivity extends AppCompatActivity
class MainActivity : AppCompatActivity() {
    //in Java this would look like -> private ActivityMainBinding binding
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //in Java -> binding = ActivityMainBinding.inflate(layoutInflater)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //connects the button being pushed to this method beind called
        //this will load the TipCalcActivity
        binding.button.setOnClickListener {
            startActivity(Intent(this,TipCalcActivity::class.java))
        }

        Log.i("Lifecycle","MainActivity.onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle","MainActivity.onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle","MainActivity.onResume() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle","MainActivity.onStop() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle","MainActivity.onPause() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle","MainActivity.onDest() called")
    }
}