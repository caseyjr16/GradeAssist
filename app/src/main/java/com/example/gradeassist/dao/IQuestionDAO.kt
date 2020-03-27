package com.example.gradeassist.dao

import com.example.gradeassist.dto.QuestionDTO

interface IQuestionDAO {
    fun fetchAll(): ArrayList<QuestionDTO>
    fun fetchAllByQuiz(quizId: Int): ArrayList<QuestionDTO>
    fun fetchById(questionId: Int): QuestionDTO
}