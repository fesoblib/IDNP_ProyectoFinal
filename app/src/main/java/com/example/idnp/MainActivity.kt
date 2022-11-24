package com.example.idnp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.idnp.usuario.Usuario

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn: Button = findViewById(R.id.button)
        btn.setOnClickListener{
            val intent = Intent(this,Usuario::class.java)
            intent.putExtra("dirección","villahermosa")
            startActivity(intent)
        }
    }
}