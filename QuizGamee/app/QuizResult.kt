package com.st10371629.quizgame

data class QuizResult(
    val username: String = "",
    val category: String = "",
    val correctAnswers: Int = 0,
    val totalQuestions: Int = 0,
    val timeSpentMillis: Long = 0,
    val timestamp: Long = 0
)