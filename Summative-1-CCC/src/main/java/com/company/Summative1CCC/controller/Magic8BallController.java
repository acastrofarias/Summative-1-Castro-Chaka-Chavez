package com.company.Summative1CCC.controller;

import org.springframework.web.bind.annotation.RestController;
import com.company.Summative1CCC.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Magic8BallController {

    private List<Answer> answerList;

    public Magic8BallController(){
        
    }
}
