package com.example.gradeassist.dto

data class Question(var questionId: Int) {

    override fun toString(): String {
        return questionId.toString()
    }

}