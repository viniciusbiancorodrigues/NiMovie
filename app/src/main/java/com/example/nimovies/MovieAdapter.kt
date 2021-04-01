package com.example.nimovies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nimovies.models.Movie
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter (
    private val movies : List<Movie>
): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    class MovieViewHolder(view : View) : RecyclerView.ViewHolder(view){

        fun bindMovie(movie : Movie){
            itemView.movie_title.text = movie.tittle
            itemView.movie_release_date.text = movie.release

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
       return MovieViewHolder(
           LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
       )
    }
         override fun getItemCount(): Int = movies.size


        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            holder.bindMovie(movies.get(position))
        }

    }
}