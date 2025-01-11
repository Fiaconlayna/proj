package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Food> foodList = new ArrayList<>();

        //создаем фрукты
        foodList.add(new Fruit("Apple", true, 0.3, 0.2, 14));
        foodList.add(new Fruit("Banana", true, 1.3, 0.3, 27));
        foodList.add(new Fruit("Orange", true, 0.9, 0.1, 12));
        foodList.add(new Fruit("Strawberry", true, 0.8, 0.3, 8));
        foodList.add(new Fruit("Pineapple", true, 0.5, 0.2, 13));
        foodList.add(new Fruit("Mango", true, 0.8, 0.6, 15));
        foodList.add(new Fruit("Grapes", true, 0.5, 0.1, 16));
        foodList.add(new Fruit("Peach", true, 0.9, 0.1, 10));
        foodList.add(new Fruit("Watermelon", true, 0.6, 0.2, 8));
        foodList.add(new Fruit("Kiwi", true, 1.1, 0.5, 14));
        foodList.add(new Vegetable("Carrot", true, 0.9, 0.2, 10));
        foodList.add(new Meat("Chicken", true, 27, 3.6, 0));
        foodList.add(new Fruit("Poisonous Berry", false, 0.1, 0.1, 5));

        //фильтруем съедобные фрукты с эн ценностью меньше заданного числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное количество калорий: ");
        double maxCalories = scanner.nextDouble();

        System.out.println("Съедобные фрукты с калорийностью меньше " + maxCalories + ":");
        for (Food food : foodList) {
            if (food instanceof Fruit && food.isEdible() && food.getCalories() < maxCalories) {
                System.out.println(food.getName() + ": " + food.getCalories() + " ккал");
            }
        }

        //фильтруем еду по последней букве названия
        System.out.println("Введите последнюю букву названия: ");
        char lastChar = scanner.next().charAt(0);

        System.out.println("Еда, названия которой заканчиваются на " + lastChar + ":");
        for (Food food : foodList) {
            if (food.getName().endsWith(String.valueOf(lastChar))) {
                System.out.println(food.getName());
            }
        }

        scanner.close();
    }
}
//java -jar target/food-hierarchy-1.0-SNAPSHOT.jar
//cd C:\lw2c\ВВРПО\lab3\food-hierarchy
//mvn exec:java -Dexec.mainClass="com.example.Main"