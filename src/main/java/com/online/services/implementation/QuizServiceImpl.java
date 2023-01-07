package com.online.services.implementation;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.Repository.QuizRepository;
import com.online.model.exam.Quiz;
import com.online.services.QuizService;



@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz addQuiz(Quiz quiz) {
       
        return this.quizRepository.save(quiz);
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
       
        return this.quizRepository.save(quiz);
    }

    @Override
    public Set<Quiz> getQuizzes() {
      
        return new HashSet<>(this.quizRepository.findAll());
    }

    @Override
    public Quiz getQuiz(int quizId) {
      
        return this.quizRepository.findById(quizId).get();
    }

    @Override
    public void deleteQuiz(int quizId) {
     
        this.quizRepository.deleteById(quizId);
    }
    
}
