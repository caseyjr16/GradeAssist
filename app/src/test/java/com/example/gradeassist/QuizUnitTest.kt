package com.example.gradeassist

import com.example.gradeassist.dao.QuizDAO
import com.example.gradeassist.repository.QuizRepository
import org.junit.Test

class QuizUnitTest {

    @Test
    fun quizzes_isNotNull() {
        var quizzes = QuizRepository.fetchAll()

        println("QUIZ REPOSITORY RETURNS:")
        println(quizzes);

        assert(quizzes !== null);
    }

    @Test
    fun apiCall_isSuccessful() {
        var quizzes = QuizRepository.fetchFromApi()

        println("OPEN TRIVIA DB RETURNS:")
        println(quizzes);

        assert(quizzes !== null);
    }

}