package com.ptit.and.java.designpattern.statepattern;

public class DocumentContext {
    private State state;

    public DocumentContext() {
    }

    public void setState(State state) {
        this.state = state;
    }

    public void applyState() {
        this.state.handleRequest();
    }
}
