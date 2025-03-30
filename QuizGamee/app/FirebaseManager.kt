package com.st10371629.quizgame

import com.google.firebase.firestore.FirebaseFirestore

object FirebaseManager {

private lateinit var db: FirebaseFirestore

fun initialize() {
    db = FirebaseFirestore.getInstance()
}

fun saveQuizResult(result: QuizResult, callback: FirebaseCallback) {
    db.collection("quiz_results")
            .add(result)
            .addOnSuccessListener { callback.onSuccess() }
            .addOnFailureListener { callback.onFailure(it) }
}

interface FirebaseCallback {
    fun onSuccess()
    fun onFailure(e: Exception)
}
}