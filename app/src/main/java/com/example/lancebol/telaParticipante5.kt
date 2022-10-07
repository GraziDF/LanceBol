package com.example.lancebol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lancebol.databinding.ActivityTelaParticipante5Binding

class telaParticipante5 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityTelaParticipante5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaParticipante5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltar.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.voltar){
            voltar()
        }
    }

    private fun voltar(){
        startActivity(Intent(this, PrincipalActivity::class.java))
    }
}