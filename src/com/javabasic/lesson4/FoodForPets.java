package com.javabasic.lesson4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FoodForPets {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );

        Scanner scanner = new Scanner(System.in);

        float oneFoodPortionWeight = 0.05F;
        int oneFoodPortionCoast = 2;
        int thirtyDaysMonth = 30;
        int numberOfMeals = 3;

        System.out.println("Please input numbers of Dogs and Cats:");
        int countOfDogs = scanner.nextInt();
        int countOfCats = scanner.nextInt();

        float monthlyFoodWeightForCats = monthFoodWeightForPets(
                countOfCats, thirtyDaysMonth, numberOfMeals, oneFoodPortionWeight
        );

        float monthlyFoodWeightForDogs = monthFoodWeightForPets(
                countOfDogs, thirtyDaysMonth, numberOfMeals, oneFoodPortionWeight
        );

        System.out.printf(
                "For %s days: %s Cats need = %s kilo, %s Dogs need = %s kilo of food.%n",
                thirtyDaysMonth,
                countOfCats,
                decimalFormat.format(monthlyFoodWeightForCats),
                countOfDogs,
                decimalFormat.format(monthlyFoodWeightForDogs)
        );

        System.out.printf(
                "For %s days, for all your pets, you need = %.2f dollars",
                thirtyDaysMonth,
                monthlyCoastForPetFood(oneFoodPortionCoast, monthlyFoodWeightForDogs,monthlyFoodWeightForCats)
        );

    }

    public static float monthFoodWeightForPets(int count, int days, int numberOfMeals, float weight){
       return weight * count * numberOfMeals * days;
    }

    public static float monthlyCoastForPetFood(
            float coast,
            float monthlyFoodWeightForDogs,
            float monthlyFoodWeightForCats
    ){

        float monthlyCoastForDogs =  coast / monthlyFoodWeightForDogs * 1000;
        float monthlyCoastForCats =  coast / monthlyFoodWeightForCats * 1000;

        return monthlyCoastForDogs + monthlyCoastForCats;
    }

}
