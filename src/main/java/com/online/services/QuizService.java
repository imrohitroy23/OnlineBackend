package com.online.services;

import java.util.Set;

import com.online.model.exam.Quiz;

public interface QuizService {
    public Quiz addQuiz(Quiz quiz);
    
    public Quiz updateQuiz(Quiz quiz);

    public Set<Quiz> getQuizzes();

    public Quiz getQuiz(int quizId);

    public void deleteQuiz(int quizId);

}
