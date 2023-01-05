package com.online.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.model.exam.Question;

public interface QuestionRepository extends JpaRepository<Question,Integer>{
    
}
