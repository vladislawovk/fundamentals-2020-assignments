package com.android.academy.fundamentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализация переменной кнопки перехода
        val textView: TextView = findViewById(R.id.first_activity_text_view)
        // Добавиление обработчика нажатия кнопки
        textView.setOnClickListener { moveToNextScreen() }
    }

    // Переход на следующий экран
    private fun moveToNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }
}
