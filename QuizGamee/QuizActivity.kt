package com.st10371629.quizgame

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    private lateinit var questionText: TextView
    private lateinit var timerText: TextView
    private lateinit var categoryText: TextView
    private lateinit var optionA: Button
    private lateinit var optionB: Button
    private lateinit var optionC: Button
    private lateinit var optionD: Button
    private lateinit var progressBar: SeekBar

    private lateinit var category: String
    private lateinit var username: String
    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var correctAnswers = 0
    private var timeSpentMillis: Long = 0
    private lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        // Initialize views
        questionText = findViewById(R.id.question_text)
        timerText = findViewById(R.id.timer_text)
        categoryText = findViewById(R.id.category_text)
        optionA = findViewById(R.id.option_a)
        optionB = findViewById(R.id.option_b)
        optionC = findViewById(R.id.option_c)
        optionD = findViewById(R.id.option_d)
        progressBar = findViewById(R.id.progress_seekbar)

        // Get category and username from intent
        category = intent.getStringExtra("CATEGORY") ?: "Science"
        username = intent.getStringExtra("USERNAME") ?: "User"

        // Set up category name
        categoryText.text = category

        // Load questions for the selected category
        loadQuestions()

        // Set up progress bar
        progressBar.max = questions.size
        progressBar.progress = 0

        // Set up answer buttons listeners
        setupButtonListeners()

        // Start the quiz
        displayQuestion()
        startTimer()
    }

    private fun loadQuestions() {
        questions = when (category) {
            "Science" -> QuestionBank.getScienceQuestions()
            "History" -> QuestionBank.getHistoryQuestions()
            "Geography" -> QuestionBank.getGeographyQuestions()
            "Entertainment" -> QuestionBank.getEntertainmentQuestions()
            else -> QuestionBank.getScienceQuestions() // Default
        }
    }

    private fun setupButtonListeners() {
        optionA.setOnClickListener { checkAnswer(0) }
        optionB.setOnClickListener { checkAnswer(1) }
        optionC.setOnClickListener { checkAnswer(2) }
        optionD.setOnClickListener { checkAnswer(3) }
    }

    private fun displayQuestion() {
        val currentQuestion = questions[currentQuestionIndex]

        questionText.text = currentQuestion.questionText
        optionA.text = currentQuestion.options[0]
        optionB.text = currentQuestion.options[1]
        optionC.text = currentQuestion.options[2]
        optionD.text = currentQuestion.options[3]

        // Update progress
        progressBar.progress = currentQuestionIndex + 1
    }

    private fun checkAnswer(selectedOption: Int) {
        val currentQuestion = questions[currentQuestionIndex]

        if (selectedOption == currentQuestion.correctAnswerIndex) {
            correctAnswers++
        }

        // Move to next question / finish quiz
        currentQuestionIndex++
        if (currentQuestionIndex < questions.size) {
            displayQuestion()
        } else {
            finishQuiz()
        }
    }

    private fun startTimer() {
        timer = object : CountDownTimer(300000, 1000) { // 5 mins
            override fun onTick(millisUntilFinished: Long) {
                timeSpentMillis = 300000 - millisUntilFinished
                updateTimerDisplay()
            }

            override fun onFinish() {
                finishQuiz()
            }
        }.start()
    }

    private fun updateTimerDisplay() {
        val seconds = (timeSpentMillis / 1000 % 60).toInt()
        val minutes = (timeSpentMillis / 1000 / 60).toInt()
        timerText.text = String.format("%02d:%02d", minutes, seconds)
    }

    private fun finishQuiz() {
        timer.cancel()

        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra("CATEGORY", category)
            putExtra("USERNAME", username)
            putExtra("CORRECT_ANSWERS", correctAnswers)
            putExtra("TOTAL_QUESTIONS", questions.size)
            putExtra("TIME_SPENT", timeSpentMillis)
        }
        startActivity(intent)
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (::timer.isInitialized) {
            timer.cancel()
        }
    }
}