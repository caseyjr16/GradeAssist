package com.example.gradeassist.dao

import com.example.gradeassist.dto.Question
import retrofit2.Call
import retrofit2.http.GET

interface IQuestionDAO {

    // Get JSON Data to display on UI...Not ready yet

    //    @GET("https://drive.google.com/file/d/1EtNU3cXWl9e5_si-aoiZm_qXvHVN6OFw/view?usp=sharing")
    fun getAllQuestions(): Call<ArrayList<Question>>

    //    @GET("https://drive.google.com/file/d/1EtNU3cXWl9e5_si-aoiZm_qXvHVN6OFw/view?usp=sharing")
    fun getQuestionById(questionId: Int): Call<Question>
}