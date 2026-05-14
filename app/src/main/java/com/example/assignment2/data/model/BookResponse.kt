package com.example.assignment2.data.model

data class BookResponse(
    val docs: List<Book>
)

data class Book(
    val title: String,
    val author_name: List<String>?
)