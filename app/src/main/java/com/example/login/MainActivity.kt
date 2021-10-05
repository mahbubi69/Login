package com.example.login

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {
            val username = binding.edUsername1.toString()
            val pasword = binding.edPasword1.toString()

            if (username == "mahbubi" && pasword == "123") {
                val progressdialog = ProgressDialog(
                    this, R.style.Theme_MaterialComponents_Light_Dialog
                )
                progressdialog.isIndeterminate = true
                progressdialog.setMessage("tunggu sebentar")
                progressdialog.show()
                val inten = Intent(this, MasukActivity::class.java)
                startActivity(inten)
                finish()

            } else if (username == "") {
                Toast.makeText(this, "usernamse anda saLah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            } else if (pasword == "") {
                Toast.makeText(this, "pasword anda saLah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                Toast.makeText(
                    this,
                    "tolong periksa kembali password dan email anda",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
        }
    }
}