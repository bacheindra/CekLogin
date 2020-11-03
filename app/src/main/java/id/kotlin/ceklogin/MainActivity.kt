package id.kotlin.mentoringkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.kotlin.ceklogin.ImplicitIntent
import id.kotlin.ceklogin.ModelLogin
import id.kotlin.ceklogin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener{

            val email = textUsername.text.toString()
            val password = textPassword.text.toString()

            if(email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Masukkan test@123.com dan 123", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(email == "test@123.com" || password == "123"){
                val intent = Intent (this, ImplicitIntent::class.java)
                val dataLogin = ModelLogin(textUsername.text.toString(), textPassword.text.toString())

                intent.putExtra("data", dataLogin)
                startActivity(intent)
                finish()
            }

            else {
                Toast.makeText(this, "Username tidak ditemukan silahkan Masukkan test@123.com dan 123", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

//            val dataLogin = ModelLogin(textUsername.text.toString(), textPassword.text.toString())
//
//            val intent = Intent(this, ImplicitIntent::class.java)
//
//            intent.putExtra("data", dataLogin)
//            startActivity(intent)
//            finish()
        }

    }
}