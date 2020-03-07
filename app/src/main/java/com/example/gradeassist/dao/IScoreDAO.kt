package com.example.gradeassist.dao

import com.example.gradeassist.dto.Score
import retrofit2.Call
import retrofit2.http.GET


interface IScoreDAO {

    // Get JSON Data to display on UI...Not ready yet

    //  @GET("https://drive.google.com/file/d/1EtNU3cXWl9e5_si-aoiZm_qXvHVN6OFw/view?usp=sharing")
    fun getAllScores(): Call<ArrayList<Score>>

    //  @GET("https://drive.google.com/file/d/1EtNU3cXWl9e5_si-aoiZm_qXvHVN6OFw/view?usp=sharing")
    fun getScoreById(ScoreId : Int): Call<Score>

}