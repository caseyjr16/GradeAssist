package com.example.gradeassist.dto

data class QuizDTO(var quizId: Int, var name: String, var questions: ArrayList<QuestionDTO>) {

    override fun toString(): String {
        return quizId.toString();
    }

}