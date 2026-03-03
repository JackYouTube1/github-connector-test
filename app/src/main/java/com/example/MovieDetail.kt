package com.example

// MovieDetail.kt — Displays detailed info for a selected movie
data class Movie(val id: Int, val title: String, val genre: String, val rating: Float)

class MovieDetailScreen {
    fun display(movie: Movie) {
        println("Title: ${movie.title} | Genre: ${movie.genre} | Rating: ${movie.rating}")
    }
}
