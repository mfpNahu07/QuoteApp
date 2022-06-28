package com.nahuel.quotesapp.data

import com.nahuel.quotesapp.data.model.QuoteModel
import com.nahuel.quotesapp.data.model.QuoteProvider
import com.nahuel.quotesapp.data.network.QuoteService
import javax.inject.Inject

//Gestiona a donde va a buscar la informacion, bdd local, remota
class QuoteRepository @Inject constructor(private val api : QuoteService, private val quoteProvider: QuoteProvider) {


    suspend fun getAllQuotes() : List <QuoteModel>{
        val response = api.getQuotes()
       quoteProvider.quotes = response
        return response
    }

}