package com.example.gradeassist.dao

import com.example.gradeassist.dto.Score
//import retrofit2.http.GET


interface IScoreDAO {

    // Get JSON Data to display on UI...Not ready yet

//    @GET("https://drive.google.com/file/d/1EtNU3cXWl9e5_si-aoiZm_qXvHVN6OFw/view?usp=sharing")
//    fun getAllQuestions(): retrofit2.Call<ArrayList<Question>>


    fun getAllScores(): Array<Score>

    fun getScoreById(): Score

}