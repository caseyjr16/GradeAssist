package com.example.gradeassist.dao

import com.example.gradeassist.dto.QuestionDTO
import com.example.gradeassist.dto.QuizDTO

class QuizDAO: IQuizDAO {

    override fun fetchAll (): ArrayList<QuizDTO> {
        return ArrayList<QuizDTO>()
    }

    override fun fetchById(quizId: Int): QuizDTO {
        return QuizDTO(
            quizId = quizId,
            name = "Quiz 0",
            questions = ArrayList<QuestionDTO>()
        )
    }
}