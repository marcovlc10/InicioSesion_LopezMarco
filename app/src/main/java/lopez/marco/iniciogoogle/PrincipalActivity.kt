package lopez.marco.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.common.SignInButton

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle=intent.extras
        if(bundle!=null){
            val nombre=bundle.getString("name")
            val correo=bundle.getString("email")

            findViewById<TextView>(R.id.tv_nombre).setText(nombre)
            findViewById<TextView>(R.id.tv_email).setText(correo)
        }

        findViewById<Button>(R.id.btn_cerrar).setOnClickListener{
            finish()
        }

    }
}