package com.nahuel.quotesapp.domain

import com.nahuel.quotesapp.data.QuoteRepository
import com.nahuel.quotesapp.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor( private val repository : QuoteRepository){


    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}