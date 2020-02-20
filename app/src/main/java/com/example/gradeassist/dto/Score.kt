package com.example.gradeassist.dto

data class Score(var scoreId: Int) {

    override fun toString(): String {
        return scoreId.toString();
    }

}