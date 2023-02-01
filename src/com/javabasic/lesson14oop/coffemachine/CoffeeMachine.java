package com.javabasic.lesson14oop.coffemachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

    private final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private final static int COUNT_OF_AVAILABLE_DRINKS = 4;
    private final static int MAX_COUNT_DRINKS_FOR_PURCHASE = 10;
    private static HotDrink americano = new Americano("Americano", 1.19);
    private static HotDrink latte = new Latte("Latte", 1.90);
    private static HotDrink cappuccino = new Cappuccino("Cappuccino", 1.75);
    private static HotDrink tea = new Tea("Tea", 0.85);
    private static List<HotDrink> orderedDrinksArray = new ArrayList<>();
    private static double totalPrice = 0;
    private static int countOfOrderedDrinks = 0;

    public void start() throws InterruptedException, IOException {

        System.out.println("How many drinks do you want?");
        int countOfDrinks = getInt(MAX_COUNT_DRINKS_FOR_PURCHASE);

        System.out.println("Available drinks:");
        System.out.println("Americano  - 1");
        System.out.println("Latte      - 2");
        System.out.println("Cappuccino - 3");
        System.out.println("Tea        - 4");

        purchase(countOfDrinks);
        cookTheDrink();

        System.out.println("Your order is ready. Please enjoy! Thanks :)");
        System.out.printf("Total price is: %s $", getTotalPrice(totalPrice));

    }

    private static int getInt(int maxNumber) throws IOException {

        boolean isPositive = false;
        int intValue = 0;

        while (!isPositive) {

            String getValueFromUser = READER.readLine();

            try {
                intValue = Integer.parseInt(getValueFromUser);
                if (intValue > 0 && intValue <= maxNumber) {
                    isPositive = true;
                } else {
                    System.out.printf("Error. Please input an Integer higher than 0 and less then %s: \n", maxNumber);
                }

            } catch (NumberFormatException e) {
                System.out.print("Incorrect data type. Please input Integer: ");
            }

        }

        return intValue;
    }

    private static void addDrinkToOrderedDrinksArray(int number) {

        switch (number) {
            case 1:
                orderedDrinksArray.add(americano);
                break;
            case 2:
                orderedDrinksArray.add(latte);
                break;
            case 3:
                orderedDrinksArray.add(cappuccino);
                break;
            case 4:
                orderedDrinksArray.add(tea);
                break;
            default:
                break;

        }

    }

    private static String getTotalPrice(double totalPrice) {
        return String.format("%.2f", totalPrice);
    }

    private static void purchase(int countOfDrinks) throws IOException {

        do {
            System.out.println("Please choose the drink (from 1 to 4):");
            int drinkId = getInt(COUNT_OF_AVAILABLE_DRINKS);
            addDrinkToOrderedDrinksArray(drinkId);
            countOfOrderedDrinks++;
            System.out.printf("Count of ordered drinks: %s\n", countOfOrderedDrinks);
        } while (countOfOrderedDrinks != countOfDrinks);

    }

    private static void cookTheDrink() throws InterruptedException {

        for (HotDrink drink : orderedDrinksArray) {
            drink.makeDrink();
            totalPrice += drink.getPrice();
        }

    }

}