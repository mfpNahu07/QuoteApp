package com.nahuel.quotesapp.data

import com.nahuel.quotesapp.data.model.QuoteModel
import com.nahuel.quotesapp.data.model.QuoteProvider
import com.nahuel.quotesapp.data.network.QuoteService

//Gestiona a donde va a buscar la informacion, bdd local, remota
class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes() : List <QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }

}