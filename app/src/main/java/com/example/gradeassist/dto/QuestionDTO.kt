package com.example.gradeassist.dto

class QuestionDTO(var questionId: Int, var text: String, var answer: String, var percentageCorrect: Double) {

    override fun toString(): String {
        return questionId.toString()
    }

}