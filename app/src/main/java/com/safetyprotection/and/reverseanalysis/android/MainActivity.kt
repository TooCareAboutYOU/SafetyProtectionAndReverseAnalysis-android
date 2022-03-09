package com.safetyprotection.and.reverseanalysis.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.safetyprotection.and.reverseanalysis.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = stringFromJNI()
        val data=TestBean("1")
        Log.i("print_logs", "打印: $data")
    }

    /**
     * A native method that is implemented by the 'android' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'android' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}