package com.example.gradeassist.dao

import com.example.gradeassist.dto.QuizDTO
import com.example.gradeassist.repository.QuizRepository

class QuizDAO: IQuizDAO {

    override fun fetchAll (): ArrayList<QuizDTO> {
        return QuizRepository.fetchAll()
    }

    override fun fetchById(quizId: Int): QuizDTO {
        return QuizRepository.fetchById(quizId)
    }

}