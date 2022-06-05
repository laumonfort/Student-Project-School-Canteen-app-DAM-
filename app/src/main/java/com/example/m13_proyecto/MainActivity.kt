package com.example.m13_proyecto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.m13_proyecto.adapter.MensajeAdapter
import com.example.m13_proyecto.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
        initRecycleviewMensajes()
        //finish()

    }

    private fun initRecycleviewMensajes() {
        binding.rvMsg.layoutManager= LinearLayoutManager(this)
        binding.rvMsg.adapter= MensajeAdapter(MensajesProvider.mensajeList)
    }

    private fun setup() {
        binding.button.setOnClickListener{
            showClasslist()
        }
      }

    private fun showClasslist() {
        val classIntent= Intent(this,ElegirClases::class.java).apply{
            //putExtra("email",email)
            //putExtra("password", password.name)
        }
        startActivity(classIntent)
    }
}