package com.example.quizapp.dao;

import com.example.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> { // here is a magic and with this extends can we get more features
}
