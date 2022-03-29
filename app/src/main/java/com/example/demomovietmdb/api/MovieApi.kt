package com.example.demomovietmdb.api


import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    companion object{
        const val BASE_URL = "https://api.themoviedb.org/3/"
    }

    @GET("movie/now_playing?api_key=8e7c63f8132a379eeed49f3f7ac21e08")
    suspend fun getNowPlayingMovies(
        @Query("page") position: Int
    ): MovieResponse

    @GET("search/movie?api_key=8e7c63f8132a379eeed49f3f7ac21e08")
    suspend fun searchMovies(
        @Query("query") query: String,
        @Query("page") page: Int
    ): MovieResponse
}