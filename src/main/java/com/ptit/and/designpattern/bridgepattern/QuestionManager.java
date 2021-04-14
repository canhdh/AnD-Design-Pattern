package com.ptit.and.designpattern.bridgepattern;

public class QuestionManager {
    protected Question question;
    public String catalog;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }

    public void next() {
        question.nextQuestion();
    }

    public void previous() {
        question.previousQuestion();
    }

    public void newOne(String q) {
        question.newQuestion(q);
    }

    public void delete(String q) {
        question.deleteQuestion(q);
    }

    public void display() {
        question.displayQuestion();
    }

    public void displayAll() {
        System.out.println("Question Paper: " + catalog);
        question.displayAllQuestion();
    }
}
