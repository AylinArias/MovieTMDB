package com.example.demomovietmdb.ui.favorite

import androidx.lifecycle.ViewModel
import com.example.demomovietmdb.data.local.FavoriteMovieRepository
import javax.inject.Inject

class FavoriteViewModel @Inject constructor(
    private val repository: FavoriteMovieRepository
) : ViewModel(){
    val movies = repository.getFavoriteMovies()
}