package com.example.gradeassist.dao

import com.example.gradeassist.dto.Score


interface IScoreDOA {

    fun getAllScores() : Array<Score>

    fun getScoreById(): Score

}