package com.epam.training.student_iulia_iasoveeva.collections.main_task.model.vegetable;

import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.SaladComponent;

public abstract class Vegetable extends SaladComponent {

    private int weightInGrams;

    @Override
    public double getCost() {
        return getPrice() / 1000 * weightInGrams;
    }

    public abstract int getCaloriesPerHundredGrams();

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    @Override
    public double getCalories() {
        return weightInGrams * getCaloriesPerHundredGrams() / 100d;
    }
}
