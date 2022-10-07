package com.example.lancebol

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lancebol.databinding.ActivityTelalogin2Binding

class telalogin2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityTelalogin2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelalogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.entrar1.setOnClickListener(this)


    }


override fun onClick(view: View) {
    if (view.id == R.id.entrar1) {
        login()

    }
}
private fun login(){

    startActivity(Intent(this, telaAposta::class.java))
}
}