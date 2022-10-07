package com.example.lancebol

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lancebol.databinding.PrincipalBinding


class PrincipalActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: PrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bola.setOnClickListener(this)
        binding.Participante.setOnClickListener(this)
        binding.pagamento.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        if (view.id == R.id.bola) {
            novatela(2)
        }else if(view.id == R.id.Participante){
            novatela(3)
        }else if(view.id == R.id.pagamento){
            novatela(4)
        }
    }
    private fun novatela(tela: Int){
        if (tela == 2) {
            startActivity(Intent(this,telaAposta::class.java))
        }else if (tela == 3){
            startActivity(Intent(this,telalogin2::class.java))
        }else if(tela == 4){
            startActivity(Intent(this,telaParticipante5::class.java))
        }
    }
}