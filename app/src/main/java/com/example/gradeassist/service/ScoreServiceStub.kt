package com.example.gradeassist.service

import com.example.gradeassist.dto.Score

public class ScoreServiceStub : IScoreService {

    override fun fetchById(scoreId: Int): Score {
        return Score(52)
    }

}