package com.nahuel.quotesapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nahuel.quotesapp.data.database.dao.QuoteDao
import com.nahuel.quotesapp.data.database.entities.QuoteEntity

@Database(entities = [QuoteEntity::class], version = 1)
abstract class QuoteDataBase: RoomDatabase() {

    //Para cada clase DAO que se asoció con la base de datos,definir un método abstracto que tenga cero argumentos y muestre una instancia de la clase DAO.
    abstract fun getQuoteDao(): QuoteDao

}