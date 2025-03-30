package com.st10371629.quizgame

data class Question(
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)