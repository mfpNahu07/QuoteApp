package com.nahuel.quotesapp.model

class QuoteProvider {


    companion object {

        fun random(): QuoteModel {
            val position = (0..9).random()

            return quote[position]
        }
        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "At its best, life is completely unpredictable.",
                author = "Christopher Walken"
            ),
            QuoteModel(
                quote = "Nobody who ever gave his best regretted it.",
                author = "George Halas"
            ),
            QuoteModel(
                quote = "He who knows best knows how little he knows.",
                author = "Thomas Jefferson"
            ),
            QuoteModel(
                quote = "The best preparation for tomorrow is doing your best today.",
                author = "H.Jackson Brown,Jr"
            ),
            QuoteModel(
                quote = "Faith in oneself is the best and safest course.",
                author = "Michelangelo"
            ),
            QuoteModel(
                quote = "Knowledge will give you power, but character respect.",
                author = "Bruce Lee"
            ),
            QuoteModel(
                quote = "A person who never made a mistake never tried anything new.",
                author = "Albert Einstein"
            ),
            QuoteModel(quote = "The secret of getting ahead is getting started.", author = "Mark Twain"),
            QuoteModel(quote = "Great things are done by a series of small things brought together.", author = "Vincent Van Gogh"),
            QuoteModel(
                quote = "Arriving at one goal is the starting point to another.",
                author = "John Dewey"
            )
        )
    }
}