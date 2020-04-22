package com.example.gradeassist.ui.quiz_results;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gradeassist.R;
import com.example.gradeassist.ui.quiz.NewQuizApi;
import com.example.gradeassist.ui.quiz.Question;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShowQuizActivity extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_quiz_acitivity);

        textViewResult = findViewById(R.id.quiz_results);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NewQuizApi newQuizApi = retrofit.create(NewQuizApi.class);

        Call<List<Question>> call = newQuizApi.getQuestions();

        call.enqueue(new Callback<List<Question>>() {
            @Override
            public void onResponse(Call<List<Question>> call, Response<List<Question>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<Question> questions = response.body();
                int i = 1;

                for  (Question question : questions) {

                    String questionString = "";
                    String answerString = "";
                    String percentCorrectString = "";

                    questionString += "Question #" + i + ": \n" + question.getQuestion() + "\n";

                    answerString += "Answer: " + question.getCorrect_answer() + "\n";

                    percentCorrectString += "Answered Correctly: " + question.getPercent_correct() + "%\n\n";

                    textViewResult.append(questionString);
                    textViewResult.append(answerString);
                    textViewResult.append(percentCorrectString);
                    i++;
                }

            }

            @Override
            public void onFailure(Call<List<Question>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }

        });




    }
}