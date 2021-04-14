package com.ptit.and.java.designpattern.bridgepattern;

public class QuestionFormat extends QuestionManager {
    public QuestionFormat(String catalog) {
        super(catalog);
    }

    public void displayAll() {
        System.out.println("\n-------------------------------------------------");
        super.displayAll();
        System.out.println("--------------------------------------------------");
    }
}
