package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.login.databinding.ActivityMasukBinding

class MasukActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMasukBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasukBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setTitle("ke 2")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}