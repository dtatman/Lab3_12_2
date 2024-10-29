package com.example.lab3_12_2

object ApiClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://mockapi.example.com/") // URL giả lập
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService: ApiService = retrofit.create(ApiService::class.java)
}
