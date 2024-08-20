package com.example.quizapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {

    @GetMapping("allQuestions") // with allquestion does not work
    public String getAllQuestion(){
        return "Hi, there are your questions";
    }
}
