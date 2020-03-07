package com.example.gradeassist.service

import androidx.lifecycle.MutableLiveData
import com.example.gradeassist.RetrofitClientInstance
import com.example.gradeassist.dao.IQuestionDAO
import com.example.gradeassist.dto.Question
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

interface IQuestionService {

    fun fetchQuestionById(questionId: Int) : MutableLiveData<Question> {
        var _question = MutableLiveData<Question> ()
        val service = RetrofitClientInstance.retrofitInstance?.create(IQuestionDAO::class.java)
        service?.getQuestionById(questionId)
        val call = service?.getQuestionById(questionId)
        call?.enqueue(object: Callback<Question> {
            override fun onResponse(
                call: Call<Question>,
                response: Response<Question>
            ) {
                _question.value = response.body()
            }

            override fun onFailure(call: Call<Question>, t: Throwable) {
                //TODO finish onFailure Function
            }

        })

        return _question


    }
}