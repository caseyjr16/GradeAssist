package com.example.gradeassist.dto

data class QuestionDTO(var questionId: Int, var text: String, var answer: String, var percentageCorrect: Double) {

    override fun toString(): String {
        return "\n    (questionId=$questionId) (text=$text) (answer=$answer) (percentageCorrect=$percentageCorrect)"
    }

}