package com.nahuel.quotesapp.data.network

import com.nahuel.quotesapp.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET("/.json")
    suspend fun getAllQuotes() : Response<List<QuoteModel>>
}