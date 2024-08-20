package com.example.quizapp.controller;

import com.example.quizapp.Question;
import com.example.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired // We got an object with this annotation
    QuestionService questionService;
    @GetMapping("allQuestions") // with allquestion does not work
    public List<Question> getAllQuestion(){ // most of the time you will have the same method names
        return questionService.getAllQuestions();
    }
}
