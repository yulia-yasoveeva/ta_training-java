package com.epam.training.student_iulia_iasoveeva.collections.main_task.model;

public abstract class SaladComponent {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getCost();

    public abstract double getCalories();


}
