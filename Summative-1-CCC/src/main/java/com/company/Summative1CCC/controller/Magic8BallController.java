package com.company.Summative1CCC.controller;

import org.springframework.web.bind.annotation.RestController;
import com.company.Summative1CCC.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Magic8BallController {

    private List<Answer> answerList;
    private static int idCounter = 1;

    public Magic8BallController(){
        answerList = new ArrayList<>();

        answerList.add(new Answer("Without a doubt", idCounter++));
        answerList.add(new Answer("You may rely on it", idCounter++));
        answerList.add(new Answer("Reply hazy, try again", idCounter++));
        answerList.add(new Answer("Better not tell you now", idCounter++));
        answerList.add(new Answer("Don't count on it", idCounter++));
        answerList.add(new Answer("My sources say no", idCounter++));
    }

    // route to return Magic8Ball Answer
    // http method: POST
    // uri: /magic
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer magic8BallService(@RequestBody String question){
        Random random = new Random();
        int index = random.nextInt(5);
        answerList.get(index).setQuestion(question);
        return answerList.get(index);
    }
}
