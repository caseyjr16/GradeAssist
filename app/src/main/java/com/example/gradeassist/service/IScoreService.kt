package com.example.gradeassist.service

import androidx.lifecycle.MutableLiveData
import com.example.gradeassist.RetrofitClientInstance
import com.example.gradeassist.dao.IScoreDAO
import com.example.gradeassist.dto.Score
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

public interface IScoreService {

    fun fetchScoreById(scoreId: Int) : MutableLiveData<Score>{
        var _score = MutableLiveData<Score> ()
        val service = RetrofitClientInstance.retrofitInstance?.create(IScoreDAO::class.java)
        service?.getScoreById(scoreId)
        val call = service?.getScoreById(scoreId)
        call?.enqueue(object: Callback<Score> {
            override fun onResponse(
                call: Call<Score>,
                response: Response<Score>
            ) {
                _score.value = response.body()
            }

            override fun onFailure(call: Call<Score>, t: Throwable) {
               // TODO finish onFailure function
            }

        })

        return _score


    }
}