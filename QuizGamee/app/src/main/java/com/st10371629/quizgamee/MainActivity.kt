package com.st10371629.quizgame

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var categoryOneBtn: Button
    private lateinit var categoryTwoBtn: Button
    private lateinit var categoryThreeBtn: Button
    private lateinit var categoryFourBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Firebase
        FirebaseManager.initialize()

        // Initialize views
        usernameInput = findViewById(R.id.username_input)
        categoryOneBtn = findViewById(R.id.category_one_btn)
        categoryTwoBtn = findViewById(R.id.category_two_btn)
        categoryThreeBtn = findViewById(R.id.category_three_btn)
        categoryFourBtn = findViewById(R.id.category_four_btn)

        // Set up category buttons
        categoryOneBtn.setOnClickListener { startQuiz("Science") }
        categoryTwoBtn.setOnClickListener { startQuiz("History") }
        categoryThreeBtn.setOnClickListener { startQuiz("Geography") }
        categoryFourBtn.setOnClickListener { startQuiz("Entertainment") }
    }

    private fun startQuiz(category: String) {
        val username = usernameInput.text.toString().trim()

        if (username.isEmpty()) {
            Toast.makeText(this, "Please enter your username", Toast.LENGTH_SHORT).show()
            return
        }

        val intent = Intent(this, QuizActivity::class.java).apply {
            putExtra("CATEGORY", category)
            putExtra("USERNAME", username)
        }
        startActivity(intent)
    }
}
