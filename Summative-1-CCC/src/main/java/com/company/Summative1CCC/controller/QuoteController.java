package com.company.Summative1CCC.controller;

import com.company.Summative1CCC.models.Quote;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteController
{
    private List<Quote> quotes;

    private static int idCounter = 1;
    public QuoteController(){
        quotes = new ArrayList<>();

        quotes.add(new Quote(idCounter++, "Madeleine L'Engle","You have to write the book that wants to be written. And if the book will be too difficult for grown-ups, " +
                                                                          "then you write it for children." ));
        quotes.add(new Quote(idCounter++, " Stephen King","If you don't have time to read, " + "you don't have the time (or the tools) to write." +
                                                                        " Simple as that." ));
        quotes.add(new Quote(idCounter++, "Anaïs Nin","We write to taste life twice, in the moment and in retrospect" ));
        quotes.add(new Quote(idCounter++, "Jack Kerouac","One day I will find the right words, and they will be simple." ));
        quotes.add(new Quote(idCounter++, "Benjamin Franklin","Either write something worth reading or do something worth writing." ));
        quotes.add(new Quote(idCounter++, "Saul Bellow","You never have to change anything you got up in the middle of the night to write" ));
        quotes.add(new Quote(idCounter++, "Ray Bradbury","You must stay drunk on writing so reality cannot destroy you" ));
        quotes.add(new Quote(idCounter++, "Henry David Thoreau","How vain it is to sit down to write when you have not stood up to live." ));
        quotes.add(new Quote(idCounter++, " Anne Frank","I can shake off everything as I write; my sorrows disappear, my courage is reborn." ));
        quotes.add(new Quote(idCounter++, "Sylvia Plath","Let me live, love, and say it well in good sentences." ));


    }
//route to get random quote
    @RequestMapping(value= "/quote" ,method = RequestMethod.GET)
    public Quote getRandomQuote(){
        Random random = new Random();

        int index = random.nextInt(10);

        return quotes.get(index);
    }
}
