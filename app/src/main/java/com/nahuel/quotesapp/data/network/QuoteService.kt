package com.nahuel.quotesapp.data.network

import com.nahuel.quotesapp.core.RetrofitHelper
import com.nahuel.quotesapp.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.create
import javax.inject.Inject


class QuoteService @Inject constructor(private val api: QuoteApiClient) {



    suspend fun getQuotes(): List<QuoteModel>{
        return withContext(Dispatchers.IO){
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }
    }


}