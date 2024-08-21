package com.example.quizapp.dao;

import com.example.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> { // here is a magic and with this extends can we get more features. here it should given class or table name and primary key type
    List<Question> findByCategory(String category);
}
