package com.example.gradeassist.service

import androidx.lifecycle.MutableLiveData
import com.example.gradeassist.dto.Score

public class ScoreServiceStub : IScoreService {

    override fun fetchScoreById(scoreId: Int): MutableLiveData<Score> {
        return MutableLiveData<Score>()   }

}