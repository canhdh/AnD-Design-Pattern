package com.ptit.and.java.designpattern.decoratorpattern;

public class NonVegfood extends FoodDecorator {
    public NonVegfood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " With Roasted Chicken and Chicken Curry";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 150.0;
    }
}
