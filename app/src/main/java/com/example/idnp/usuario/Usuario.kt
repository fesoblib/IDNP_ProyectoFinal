package com.example.idnp.usuario

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.idnp.R
import com.example.idnp.databinding.UsuarioBinding

class Usuario: AppCompatActivity() {

    private lateinit var binding: UsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = UsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        reemplazarFragment(UsuarioInicioFragment())

        binding.bottomNavUsuario.setOnItemSelectedListener {
            when(it.itemId){
                R.id.Inicio -> reemplazarFragment(UsuarioInicioFragment())
                R.id.LugaresCanje -> reemplazarFragment(UsuarioLugaresCanjeFragment())
                R.id.Perfil -> reemplazarFragment(UsuarioPerfilFragment())
                else ->{}
            }
            true
        }

        val bundle = intent.extras
        val dato = bundle?.getString("dirección")

        val mytext = findViewById<TextView>(R.id.textView)
        mytext.text=dato
    }

    private fun reemplazarFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_fragment_usuario, fragment)
        fragmentTransaction.commit()
    }

}