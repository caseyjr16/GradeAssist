package com.example.gradeassist.repository
import com.example.gradeassist.dto.QuestionDTO
import com.example.gradeassist.dto.QuizDTO
import com.google.gson.Gson
import java.io.File

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

    }
}