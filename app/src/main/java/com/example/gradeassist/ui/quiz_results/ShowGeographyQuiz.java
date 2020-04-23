package com.example.gradeassist.ui.quiz_results;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gradeassist.R;
import com.example.gradeassist.ui.quiz.geography.GeographyQuestion;
import com.example.gradeassist.ui.quiz.geography.GeographyQuizApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShowGeographyQuiz extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_geography_quiz);

        textViewResult = findViewById(R.id.quiz_results);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GeographyQuizApi newQuizApi = retrofit.create(GeographyQuizApi.class);

        Call<List<GeographyQuestion>> call = newQuizApi.getQuestions();

        call.enqueue(new Callback<List<GeographyQuestion>>() {
            @Override
            public void onResponse(Call<List<GeographyQuestion>> call, Response<List<GeographyQuestion>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<GeographyQuestion> questions = response.body();
                int i = 1;

                for  (GeographyQuestion geographyQuestion : questions) {

                    String questionString = "";
                    String answerString = "";
                    String percentCorrectString = "";

                    questionString += "Question #" + i + ": \n" + geographyQuestion.getQuestion() + "\n";

                    answerString += "Answer: " + geographyQuestion.getCorrect_answer() + "\n";

                    percentCorrectString += "Answered Correctly: " + geographyQuestion.getPercent_correct() + "%\n\n";

                    textViewResult.append(questionString);
                    textViewResult.append(answerString);
                    textViewResult.append(percentCorrectString);
                    i++;
                }

            }

            @Override
            public void onFailure(Call<List<GeographyQuestion>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }

        });




    }
}