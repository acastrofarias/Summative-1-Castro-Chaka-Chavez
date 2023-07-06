package com.company.Summative1CCC.controller;

import com.company.Summative1CCC.models.Definition;

import org.springframework.web.bind.annotation.RestController;
import com.company.Summative1CCC.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class WordController {
    private List<Definition> wordList;

    private static int idCounter = 1;

    public WordController(){
        wordList.add(new Definition("Cosher", "To treat with special kindess", idCounter++));
        wordList.add(new Definition(("Logophile", "A lover of words", idCounter++)));
        wordList.add(new Definition("Ferhoodle", "To confuse or mix up", idCounter++));
        wordList.add(new Definition("Proceleusmatic", "Inciting or inspiring", idCounter++));
        wordList.add(new Definition("Skrik", "A sudden fright", idCounter++));
        wordList.add(new Definition("Anamnesis", "Remembrance of the past", idCounter++));
        wordList.add(new Definition("Gazetteer", "Geographical dictionary", idCounter++));
        wordList.add(new Definition("Mauka", "Towards the mountains", idCounter++));
        wordList.add(new Definition("Pervicacious", "Extremely willful", idCounter++));
        wordList.add(new Definition("Artiodactly", "Even number of toes on each foot", idCounter++));
        
    }


}
