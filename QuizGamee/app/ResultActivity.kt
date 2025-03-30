package com.st10371629.quizgame

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    private lateinit var scoreText: TextView
    private lateinit var timeText: TextView
    private lateinit var accuracyText: TextView
    private lateinit var homeButton: Button
    private lateinit var retryButton: Button

    private lateinit var category: String
    private lateinit var username: String
    private var correctAnswers: Int = 0
    private var totalQuestions: Int = 0
    private var timeSpentMillis: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Initialize views
        scoreText = findViewById(R.id.score_text)
        timeText = findViewById(R.id.time_text)
        accuracyText = findViewById(R.id.accuracy_text)
        homeButton = findViewById(R.id.home_button)
        retryButton = findViewById(R.id.retry_button)

        // Get data from intent
        category = intent.getStringExtra("CATEGORY") ?: "Science"
        username = intent.getStringExtra("USERNAME") ?: "User"
        correctAnswers = intent.getIntExtra("CORRECT_ANSWERS", 0)
        totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS", 10)
        timeSpentMillis = intent.getLongExtra("TIME_SPENT", 0)

        // Display results
        displayResults()

        // Save result to Firebase
        saveResultToFirebase()

        // Set up buttons
        homeButton.setOnClickListener { goToHome() }
        retryButton.setOnClickListener { retryQuiz() }
    }

    private fun displayResults() {
        scoreText.text = "$correctAnswers/$totalQuestions"

        // Format time
        val seconds = (timeSpentMillis / 1000 % 60).toInt()
        val minutes = (timeSpentMillis / 1000 / 60).toInt()
        timeText.text = String.format("%02d:%02d", minutes, seconds)

        // Calculate accuracy
        val accuracy = (correctAnswers.toFloat() / totalQuestions) * 100
        accuracyText.text = String.format("%.1f%%", accuracy)
    }

    private fun saveResultToFirebase() {
        val result = QuizResult(
            username = username,
            category = category,
            correctAnswers = correctAnswers,
            totalQuestions = totalQuestions,
            timeSpentMillis = timeSpentMillis,
            timestamp = System.currentTimeMillis()
        )

        FirebaseManager.saveQuizResult(result, object : FirebaseManager.FirebaseCallback {
            override fun onSuccess() {
                Toast.makeText(this@ResultActivity, "Result saved successfully", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(e: Exception) {
                Toast.makeText(this@ResultActivity, "Failed to save result: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun goToHome() {
        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        startActivity(intent)
        finish()
    }

    private fun retryQuiz() {
        val intent = Intent(this, QuizActivity::class.java).apply {
            putExtra("CATEGORY", category)
            putExtra("USERNAME", username)
        }
        startActivity(intent)
        finish()
    }
}
