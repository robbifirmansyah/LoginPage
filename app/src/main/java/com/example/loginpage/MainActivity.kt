package com.example.loginpage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.R
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menghubungkan view dengan ID yang ada di activity_main.xml
        val inputUsername = findViewById<EditText>(R.id.inputUsername)
        val inputPassword = findViewById<EditText>(R.id.inputPassword)
        val submitButton = findViewById<Button>(R.id.buttonLogin)
        val registerText = findViewById<TextView>(R.id.register)

        // Logika untuk tombol Submit
        submitButton.setOnClickListener {
            val username = inputUsername.text.toString()
            val password = inputPassword.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Tampilkan data menggunakan Toast
                Toast.makeText(this, "Username: $username\nPassword: $password", Toast.LENGTH_LONG).show()
            } else {
                // Tampilkan pesan kesalahan jika input kosong
                Toast.makeText(this, "Silakan isi semua kolom!", Toast.LENGTH_LONG).show()
            }
        }

        // Logika jika teks "Register" diklik
        registerText.setOnClickListener {
            // Aksi ketika teks Register diklik (misalnya pindah ke halaman registrasi)
            Toast.makeText(this, "Menuju halaman registrasi...", Toast.LENGTH_SHORT).show()
        }
    }
}
