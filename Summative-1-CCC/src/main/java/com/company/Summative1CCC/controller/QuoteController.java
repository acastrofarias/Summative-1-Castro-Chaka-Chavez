package com.company.Summative1CCC.controller;

import com.company.Summative1CCC.models.Quote;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController
{
    private List<Quote> quoteList;

    private static int idCounter = 1;
    public QuoteController(){
        quoteList = new ArrayList<>();

        quoteList.add(new Quote(idCounter++, "Madeleine L'Engle","You have to write the book that wants to be written. And if the book will be too difficult for grown-ups, " +
                                                                          "then you write it for children." ));
        quoteList.add(new Quote(idCounter++, " Stephen King","If you don't have time to read, " + "you don't have the time (or the tools) to write." +
                                                                        " Simple as that." ));
        quoteList.add(new Quote(idCounter++, "Anaïs Nin","We write to taste life twice, in the moment and in retrospect" ));
        quoteList.add(new Quote(idCounter++, "Jack Kerouac","One day I will find the right words, and they will be simple." ));
        quoteList.add(new Quote(idCounter++, "Benjamin Franklin","Either write something worth reading or do something worth writing." ));
        quoteList.add(new Quote(idCounter++, "Saul Bellow","You never have to change anything you got up in the middle of the night to write" ));
        quoteList.add(new Quote(idCounter++, "Ray Bradbury","You must stay drunk on writing so reality cannot destroy you" ));
        quoteList.add(new Quote(idCounter++, "Henry David Thoreau","How vain it is to sit down to write when you have not stood up to live." ));
        quoteList.add(new Quote(idCounter++, " Anne Frank","I can shake off everything as I write; my sorrows disappear, my courage is reborn." ));
        quoteList.add(new Quote(idCounter++, "Sylvia Plath","Let me live, love, and say it well in good sentences." ));


    }
    // route to get random quote
    // http method: GET
    // uri: /quote
    @RequestMapping(value= "/quote" ,method = RequestMethod.GET)
    @ResponseStatus(value=HttpStatus.OK)
    public Quote getRandomQuote(){
        Random random = new Random();

        int index = random.nextInt(quoteList.size()) + 1;

        return quoteList.get(index);
    }
}
