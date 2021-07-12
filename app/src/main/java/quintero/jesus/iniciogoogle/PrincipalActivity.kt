package quintero.jesus.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import quintero.jesus.iniciogoogle.databinding.ActivityPrincipalBinding

class PrincipalActivity : AppCompatActivity() {
    lateinit var binding: ActivityPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        if(bundle != null){
            val nombre = bundle.getString("name")
            val correo = bundle.getString("email")

            binding.tvNombre.setText(nombre)
            binding.tvEmail.setText(correo)
        }

        binding.btnCerrar.setOnClickListener{

        }
    }
}