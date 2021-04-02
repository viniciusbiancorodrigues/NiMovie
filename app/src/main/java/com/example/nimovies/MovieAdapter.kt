package com.example.nimovies

import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.with
import com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions.with
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.with
import com.example.nimovies.models.Movie
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter (
    private val movies : List<Movie>
): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

        class MovieViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val  IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
        fun bindMovie(movie : Movie){
            itemView.movie_title.text = movie.tittle
            itemView.movie_release_date.text = movie.release
            Picasso.get().load(IMAGE_BASE + movie.poster).into(itemView.movie_poster)

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