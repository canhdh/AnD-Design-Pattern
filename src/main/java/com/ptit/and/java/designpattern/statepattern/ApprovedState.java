package com.ptit.and.java.designpattern.statepattern;

public class ApprovedState implements State{
    @Override
    public void handleRequest() {
        System.out.println("Rejected");
    }
}
