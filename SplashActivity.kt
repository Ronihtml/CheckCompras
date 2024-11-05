
package com.example.checkcompras

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash) // Verifique se este layout existe

        // Atraso de 7 segundos antes de iniciar a MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            // Inicia a MainActivity
            startActivity(Intent(this, MainActivity::class.java))
            finish() // Finaliza a SplashActivity
        }, 7000) // 7000 milissegundos = 7 segundos
    }
}
