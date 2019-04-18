package edu.uw.ischool.elisat15.activityspy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG = "MyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate event fired")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause event fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "We're going down, Captain!")
    }
}
