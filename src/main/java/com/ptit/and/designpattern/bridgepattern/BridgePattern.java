package com.ptit.and.designpattern.bridgepattern;

public class BridgePattern {
    public static void main(String[] args) {
        QuestionFormat questionFormat = new QuestionFormat("Java Programming Language");
        questionFormat.question = new JavaQuestion();
        questionFormat.delete("What is class?");
        questionFormat.display();
        questionFormat.newOne("What is inheritance?");
        questionFormat.newOne("How many type of inheritance in java?");
        questionFormat.displayAll();
    }
}
