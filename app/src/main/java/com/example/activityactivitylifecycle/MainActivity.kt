package com.example.activityactivitylifecycle
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.activityactivitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
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

    fun btnOneClick(view: View) {
        startActivity(Intent(this, SecActivity::class.java))
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Dafa Hona Hai Apny ?")
            .setCancelable(false)
            .setPositiveButton("G Haan") { dialog, id ->
                super.onBackPressed()
                finishAffinity()
            }
            .setNegativeButton("Nahi") { dialog, id ->
                dialog.dismiss()
            }

        builder.setTitle("Emergency")

        builder.setCancelable(true)

        val dialog = builder.create()
        dialog.show()
    }
}
