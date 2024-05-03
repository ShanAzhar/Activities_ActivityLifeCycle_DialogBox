package com.example.activityactivitylifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activityactivitylifecycle.databinding.ActivityFourthBinding
import com.example.activityactivitylifecycle.databinding.ActivityThirdBinding

class FourthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Toast.makeText(this, "Activity created", Toast.LENGTH_SHORT).show()

    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Activity started", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Activity resumed", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Activity paused", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Activity stopped", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Activity destroyed", Toast.LENGTH_SHORT).show()
    }

    fun btnFourthClick(view: View) {
        startActivity(Intent(this, FifthActivity::class.java))
    }
}