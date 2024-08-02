package curo.yaguno.pennywiseplaner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {

    private lateinit var dbHelper:DataBaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        dbHelper = DataBaseHelper(this)
        val Usuario = intent.getIntExtra("Usuario", -1)

        findViewById<ImageView>(R.id.iv_gastos).setOnClickListener {
            val intent = Intent(this, GastosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.iv_ingresos).setOnClickListener {
            val intent = Intent(this, IngresosActivity::class.java)
            intent.putExtra("Usuario",Usuario)
            startActivity(intent)
        }
    }
}