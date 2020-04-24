package com.example.gradeassist.dao

import com.example.gradeassist.dto.QuestionDTO

class QuestionDAO: IQuestionDAO {

    override fun fetchAll (): ArrayList<QuestionDTO> {
        return ArrayList<QuestionDTO>()
    }

    override fun fetchAllByQuiz (quizId: Int): ArrayList<QuestionDTO> {
        return ArrayList<QuestionDTO>()
    }

    override fun fetchById(questionId: Int): QuestionDTO {
        return QuestionDTO(
            questionId = questionId,
            text = "HistoryQuestion Text",
            answer = "HistoryQuestion Answer",
            percentageCorrect = 85.5
        )
    }
}