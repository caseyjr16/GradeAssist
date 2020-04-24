package com.example.gradeassist.repository
import com.example.gradeassist.dto.QuestionDTO
import com.example.gradeassist.dto.QuizDTO
import com.google.gson.Gson
import java.io.File
import java.net.URL

// class only used for parsing JSON for right now
// we could move this into a proper DTO if we need to
class QuizListDTO(var quizzes: ArrayList<QuizDTO>) {}

open class QuizRepository {

    // https://stackoverflow.com/questions/40352684/what-is-the-equivalent-of-java-static-methods-in-kotlin
    companion object {

        fun fetchAll (): ArrayList<QuizDTO> {

            val gson = Gson()
            var returnQuizzes = ArrayList<QuizDTO>()

            // read sampleData.json
            val quizzesString = File("src/main/assets/sampleData.json").readText(Charsets.UTF_8)

            // JSON string to QuizListDTO
            val quizList: QuizListDTO = gson.fromJson(quizzesString, QuizListDTO::class.java)

            // transform QuizListDTO to ArrayList<QuizDTO>
            quizList.quizzes.forEach {
                returnQuizzes.add(it)
            }

            return returnQuizzes
        }

        fun fetchById(quizId: Int): QuizDTO {
            // read JSON here
            return QuizDTO(
                quizId = quizId,
                name = "Quiz 0",
                questions = ArrayList<QuestionDTO>()
            )
        }

        data class APIQuestionDTO(
            var category: String,
            var type: String,
            var difficulty: String,
            var question: String,
            var correct_answer: String,
            var incorrect_answers: ArrayList<String>
        ) {
            override fun toString(): String { return "\n(category=${category}) (type=${type}) (difficulty=${difficulty}) (question=${question}) (correct_answer=${correct_answer}) (incorrect_answers=${incorrect_answers})\n" }
        }

        data class APIResponseDTO(var response_code: Int, var results: ArrayList<APIQuestionDTO>) {
            override fun toString(): String { return "\n(response_code=${response_code}) (results=$results)\n" }
        }


        fun fetchFromApi(): QuizDTO {

            // API call to https://opentdb.com/
            val result = URL("https://opentdb.com/api.php?amount=10&category=22&difficulty=medium").readText()

            val gson = Gson()

            // JSON string to QuizListDTO
            val quizList: APIResponseDTO = gson.fromJson(result, APIResponseDTO::class.java)

            print(quizList)

            // this is blank
            return QuizDTO(
                quizId = 0,
                name = "None",
                questions = ArrayList<QuestionDTO>()
            )

        }

    }
}