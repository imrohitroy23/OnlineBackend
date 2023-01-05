package com.online.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.model.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
    
}
