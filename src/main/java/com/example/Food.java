package com.example;

public abstract class Food {
    private String name;
    private boolean isEdible;
    private final double protein;
    private double fat;
    private double carbohydrates;
    private double calories;

    public Food(String name, boolean isEdible, double protein, double fat, double carbohydrates) {
        this.name = name;
        this.isEdible = isEdible;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.calories = calculateCalories();
    }

    protected double calculateCalories() {
        return (protein * 4) + (fat * 9) + (carbohydrates * 4);  // Формула расчета калорий
    }

    public String getName() {
        return name;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public double getCalories() {
        return calories;
    }
}