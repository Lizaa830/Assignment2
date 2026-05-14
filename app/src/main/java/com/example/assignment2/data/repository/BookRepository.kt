package com.example.assignment2.data.repository

import com.example.assignment2.data.api.BookApiService
import javax.inject.Inject

class BookRepository @Inject constructor(
    private val apiService: BookApiService
) {

    suspend fun searchBooks(query: String) =
        apiService.searchBooks(query)
}