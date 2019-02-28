package com.example.aluno.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btLogin : Button = findViewById<Button>(R.id.btLogin)

        btLogin.setOnClickListener(View.OnClickListener {
            val textViewLogin: TextView = findViewById<TextView>(R.id.etUserName) as TextView
            val textViewSenha: TextView = findViewById<TextView>(R.id.etUserName) as TextView
            toast(textViewLogin.text) })

            val loginResult: Boolean = AppStaticServices.login(
                    textViewLogin.text.toString(),
                    textViewSenha.text.ToString())

            if (loginResult == true) {
                toast("Login realizado com sucesso")
            } else {
                toast("Usuario ou Senha incorretos")
            }
        }
    }

