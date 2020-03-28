package com.example.gradeassist.dao

import com.example.gradeassist.dto.QuizDTO

interface IQuizDAO {
    fun fetchAll(): ArrayList<QuizDTO>
    fun fetchById(quizId: Int): QuizDTO
}