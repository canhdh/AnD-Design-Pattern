package com.ptit.and.designpattern.bridgepattern;

public interface Question {
    public void nextQuestion();
    public void previousQuestion();
    public void newQuestion(String q);
    public void deleteQuestion(String q);
    public void displayQuestion();
    public void displayAllQuestion();
}
