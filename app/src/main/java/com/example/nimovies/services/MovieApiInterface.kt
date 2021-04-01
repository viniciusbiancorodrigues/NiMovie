package com.example.nimovies.services

import com.example.nimovies.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/movie/popular?api_key=5123cc11b6f669bb2807cd416d4e4aee")
    fun getMovieList(): Call<MovieResponse>
}