package com.example.gradeassist.ui.quiz_results;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gradeassist.R;
import com.example.gradeassist.ui.quiz.history.HistoryQuestion;
import com.example.gradeassist.ui.quiz.history.HistoryQuizApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShowHistoryQuiz extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_history_quiz);

        textViewResult = findViewById(R.id.quiz_results);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        HistoryQuizApi historyQuizApi = retrofit.create(HistoryQuizApi.class);

        Call<List<HistoryQuestion>> call = historyQuizApi.getQuestions();

        call.enqueue(new Callback<List<HistoryQuestion>>() {
            @Override
            public void onResponse(Call<List<HistoryQuestion>> call, Response<List<HistoryQuestion>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<HistoryQuestion> questions = response.body();
                int i = 1;

                for  (HistoryQuestion historyQuestion : questions) {

                    String questionString = "";
                    String answerString = "";
                    String percentCorrectString = "";

                    questionString += "Question #" + i + ": \n" + historyQuestion.getQuestion() + "\n";

                    answerString += "Answer: " + historyQuestion.getCorrect_answer() + "\n";

                    percentCorrectString += "Answered Correctly: " + historyQuestion.getPercent_correct() + "%\n\n";

                    textViewResult.append(questionString);
                    textViewResult.append(answerString);
                    textViewResult.append(percentCorrectString);
                    i++;
                }

            }

            @Override
            public void onFailure(Call<List<HistoryQuestion>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }

        });




    }
}
