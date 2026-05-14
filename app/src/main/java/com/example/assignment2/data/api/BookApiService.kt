package com.example.assignment2.data.api

import com.example.assignment2.data.model.BookResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BookApiService {

    @GET("search.json")
    suspend fun searchBooks(
        @Query("q") query: String
    ): BookResponse
}
