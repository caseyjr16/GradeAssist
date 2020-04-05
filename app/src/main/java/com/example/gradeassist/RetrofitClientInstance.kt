package com.example.gradeassist

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {

    // RetorofitClientInstance

    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://pkgstore.datahub.io"

    val retrofitInstance: Retrofit?
        get() {

            //if retro is not created
            if (retrofit == null) {

                // create it
                retrofit = retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }

            return retrofit
        }
}