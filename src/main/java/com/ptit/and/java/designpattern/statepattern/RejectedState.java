package com.ptit.and.java.designpattern.statepattern;

public class RejectedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Rejected");
    }
}
