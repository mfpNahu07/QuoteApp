package com.nahuel.quotesapp.domain

import com.nahuel.quotesapp.data.QuoteRepository
import com.nahuel.quotesapp.data.database.entities.toDatabase
import com.nahuel.quotesapp.data.model.QuoteModel
import com.nahuel.quotesapp.domain.model.Quote
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor( private val repository : QuoteRepository){


    suspend operator fun invoke(): List<Quote>{
        val quotes = repository.getAllQuotesFromApi()

        return if(quotes.isNotEmpty()){
            repository.clearQuotes() //sin esta linea la bdd se poblaria una y otra vez cada vez que abro la app
            repository.insertQuotes(quotes.map { it.toDatabase() })
            quotes
        }else{
            repository.getAllQuotesFromDatabase()
        }
    }

}