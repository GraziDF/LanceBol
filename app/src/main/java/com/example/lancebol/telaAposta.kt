package com.example.lancebol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lancebol.databinding.ActivityTelaApostaBinding

class telaAposta : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityTelaApostaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTelaApostaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltar.setOnClickListener(this)
        binding.apostar.setOnClickListener(this)
    }

    override fun onClick(view: View ) {
        if (view.id == R.id.voltar){
            voltar()
        }else if(view.id == R.id.apostar){
            voltar()
        }
    }

    private fun voltar(){
        startActivity(Intent(this, PrincipalActivity::class.java))
        startActivity(Intent(this,telaParticipante5 ::class.java))
    }
}