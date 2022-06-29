package com.nahuel.quotesapp.data

import com.nahuel.quotesapp.data.database.dao.QuoteDao
import com.nahuel.quotesapp.data.database.entities.QuoteEntity
import com.nahuel.quotesapp.data.model.QuoteModel
import com.nahuel.quotesapp.data.network.QuoteService
import com.nahuel.quotesapp.domain.model.Quote
import com.nahuel.quotesapp.domain.model.toDomain
import javax.inject.Inject

//Gestiona a donde va a buscar la informacion, bdd local, remota
class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteDao: QuoteDao
) {


    suspend fun getAllQuotesFromApi(): List<Quote> {
        val response: List<QuoteModel> = api.getQuotes()

        return response.map {
            it.toDomain()
        }
    }

    suspend fun getAllQuotesFromDatabase(): List<Quote> {
        val response: List<QuoteEntity> = quoteDao.getAllQuotes()
        return response.map { it.toDomain() }
    }


    suspend fun insertQuotes(quotes: List<QuoteEntity>){
        quoteDao.insertAll(quotes)
    }

    suspend fun clearQuotes() {
       quoteDao.deleteAllQuotes()
    }

}