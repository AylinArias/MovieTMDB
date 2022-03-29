package com.example.demomovietmdb.api

import com.example.demomovietmdb.data.model.Movie


data class MovieResponse(
    val results: List<Movie>
)