package com.example.nimovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nimovies.models.Movie
import com.example.nimovies.models.MovieResponse
import com.example.nimovies.services.MovieApiInterface
import com.example.nimovies.services.MovieApiService
import com.google.gson.annotations.Until
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getMovieData(callback: (List<Movie>) -> Until){
        val apiService = MovieApiService.getInstance().create(MovieApiInterface::class.java)
        apiService.getMovieList().enqueue(object : Callback<MovieResponse> {
             override fun onFailure(call: Call<MovieResponse>, t: Throwable) {

             }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {


            }

        })

    }
}
