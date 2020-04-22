package com.example.gradeassist.ui.quiz;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewQuizApi {

    @GET("greeleywebdev/quiz_json/master/db.json")
    Call<List<Question>> getQuestions();

}
