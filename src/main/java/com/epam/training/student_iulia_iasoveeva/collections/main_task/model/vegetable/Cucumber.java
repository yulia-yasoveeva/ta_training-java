package com.epam.training.student_iulia_iasoveeva.collections.main_task.model.vegetable;

public class Cucumber extends Vegetable {

    private int caloriesPerHundredGrams;
    private CucumberVariety variety;

    @Override
    public int getCaloriesPerHundredGrams() {
        return caloriesPerHundredGrams;
    }

    public void setCaloriesPerHundredGrams(int caloriesPerHundredGrams) {
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }

    public CucumberVariety getVariety() {
        return variety;
    }

    public void setVariety(CucumberVariety variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Cucumber{" +
                "caloriesPerHundredGrams=" + caloriesPerHundredGrams +
                ", variety=" + variety +
                '}' + getWeightInGrams() + "grams";
    }
}
