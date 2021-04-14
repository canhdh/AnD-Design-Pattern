package com.ptit.and.java.designpattern.observepattern;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler2 implements Observer {
    private String response;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            response = (String) arg;
            System.out.println("\nReceived Response: " + response);
        }
    }
}
