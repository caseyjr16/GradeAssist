package com.example.gradeassist.service

import androidx.lifecycle.MutableLiveData
import com.example.gradeassist.dto.Question

class QuestionServiceStub : IQuestionService {
    override fun fetchQuestionById(questionId: Int): MutableLiveData<Question> {
        return MutableLiveData<Question>()
    }
}