package com.example.gradeassist.service

import com.example.gradeassist.dto.Score

public interface IScoreService {

    fun fetchById(scoreId: Int) : Score
}