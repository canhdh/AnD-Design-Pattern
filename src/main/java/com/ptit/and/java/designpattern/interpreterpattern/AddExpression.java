package com.ptit.and.java.designpattern.interpreterpattern;

public class AddExpression implements Expression{
    private String expression;

    public AddExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.add(expression);
    }
}
