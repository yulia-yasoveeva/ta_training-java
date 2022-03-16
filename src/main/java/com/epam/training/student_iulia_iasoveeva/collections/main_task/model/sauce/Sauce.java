package com.epam.training.student_iulia_iasoveeva.collections.main_task.model.sauce;

import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.SaladComponent;

public abstract class Sauce extends SaladComponent {

    private boolean spicy;

    private double calories;

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

    @Override
    public double getCost() {
        return getPrice();
    }

    @Override
    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "spicy=" + spicy +
                ", calories=" + calories +
                '}' + this.getClass().getSimpleName();
    }
}

