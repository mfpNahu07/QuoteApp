package com.nahuel.quotesapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nahuel.quotesapp.model.QuoteModel
import com.nahuel.quotesapp.model.QuoteProvider

class QuoteViewModel: ViewModel() {


    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}