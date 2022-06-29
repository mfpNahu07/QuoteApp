package com.nahuel.quotesapp.domain


import com.nahuel.quotesapp.data.QuoteRepository
import com.nahuel.quotesapp.data.model.QuoteModel
import com.nahuel.quotesapp.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val repository: QuoteRepository){



    suspend operator fun invoke(): Quote?{

       val quotes =repository.getAllQuotesFromDatabase()
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()  //(0..quotes.size -1).random()
            return quotes[randomNumber]
        }
        return null
    }


}