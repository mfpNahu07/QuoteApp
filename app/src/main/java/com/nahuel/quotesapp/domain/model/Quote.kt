package com.nahuel.quotesapp.domain.model

import com.nahuel.quotesapp.data.database.entities.QuoteEntity
import com.nahuel.quotesapp.data.model.QuoteModel


data class Quote(val quote:String, val author:String)

fun QuoteModel.toDomain() = Quote(quote,author)
fun QuoteEntity.toDomain() = Quote(quote,author)








/**
 Modelo de datos final, con el que el dominio y la ui van a trabajar. Asi que si hay que cambiar
 la base de datos o retrofit da igual, porque la informacion que llegue al dominio va a ser
 siempre este modelo de datos
 */