package com.ptit.and.designpattern.decoratorpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPattern {
    private static int choice;

    public static void main(String[] args) throws IOException {
        do {
            System.out.println("============Food Menu===========\n");
            System.out.println("    1. Vegetarian Food.         \n");
            System.out.println("    2. Non-Vegetarian Food.     \n");
            System.out.println("    3. Chinese Food.            \n");
            System.out.println("    4. Exit                     \n");
            System.out.println("Enter your choice:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice) {
                case 1: {
                    VegFood vegFood = new VegFood();
                    System.out.println(vegFood.prepareFood());
                    System.out.println(vegFood.foodPrice());
                }
                break;
                case 2: {
                    Food food = new NonVegfood((Food) new VegFood());
                    System.out.println(food.prepareFood());
                    System.out.println(food.foodPrice());
                }
                break;
                case 3: {
                    Food food = new ChineseFood((Food) new VegFood());
                    System.out.println(food.prepareFood());
                    System.out.println(food.foodPrice());
                }
                break;
                default: {
                    System.out.println("Other than these no food available");
                }
                return;
            }
        } while (choice != 4);
    }
}
