package com.example.activityactivitylifecycle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.activityactivitylifecycle.databinding.ActivitySecBinding

class SecActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecBinding.inflate(layoutInflater)
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

    fun btnTwoClick(view: View) {
        startActivity(Intent(this, ThirdActivity::class.java))
    }


}

