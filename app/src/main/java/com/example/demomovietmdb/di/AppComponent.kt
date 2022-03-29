package com.example.demomovietmdb.di

import com.example.demomovietmdb.data.MovieRepository
import com.example.demomovietmdb.data.local.FavoriteMovieRepository
import com.example.demomovietmdb.ui.favorite.FavoriteFragment
import com.example.demomovietmdb.ui.favorite.FavoriteViewModel
import com.example.demomovietmdb.ui.movie.MovieViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,AppModule::class])
interface AppComponent {
    fun inject(movieRepository: FavoriteMovieRepository)
    fun inject(favoriteFragment: FavoriteFragment)
    fun inject(movieViewModel: MovieViewModel)
    fun inject(favoriteViewModel: FavoriteViewModel)
    fun inject(movieRepository: MovieRepository)

}