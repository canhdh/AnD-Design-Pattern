package com.ptit.and.java.designpattern.decoratorpattern;

public class ChineseFood extends FoodDecorator {
    public ChineseFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " With Fried Rice and Manchurian";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 65.0;
    }
}
