package com.example.gradeassist.ui.quiz.geography;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GeographyQuizApi {

    @GET("greeleywebdev/quiz_json/master/geography.json")
    Call<List<GeographyQuestion>> getQuestions();

}
