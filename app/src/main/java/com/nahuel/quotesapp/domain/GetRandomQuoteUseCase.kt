package com.nahuel.quotesapp.domain


import com.nahuel.quotesapp.data.model.QuoteModel
import com.nahuel.quotesapp.data.model.QuoteProvider

class GetRandomQuoteUseCase {


    //Ahora no es funcion suspend porque lo tenemos almacenado en memoria, en base de datos sí.
    operator fun invoke(): QuoteModel?{

       val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()  //(0..quotes.size -1).random()
            return quotes[randomNumber]
        }
        return null
    }


}