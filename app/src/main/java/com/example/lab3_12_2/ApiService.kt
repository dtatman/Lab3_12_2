package com.example.lab3_12_2

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}
