package com.epam.training.student_iulia_iasoveeva.collections.main_task.model.vegetable;

public class Tomato extends Vegetable {

    private TomatoVariety variety;
    private int caloriesPerHundredGrams;

    @Override
    public int getCaloriesPerHundredGrams() {
        return caloriesPerHundredGrams;
    }

    public void setCaloriesPerHundredGrams(int caloriesPerHundredGrams) {
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }

    public TomatoVariety getVariety() {
        return variety;
    }

    public void setVariety(TomatoVariety variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "variety=" + variety.name() +
                ", caloriesPerHundredGrams=" + caloriesPerHundredGrams +
                "} " + getWeightInGrams() + " grams";
    }
}
