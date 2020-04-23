package com.example.gradeassist.ui.quiz.history;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HistoryQuizApi {

    @GET("greeleywebdev/quiz_json/master/history.json")
    Call<List<HistoryQuestion>> getQuestions();

}
