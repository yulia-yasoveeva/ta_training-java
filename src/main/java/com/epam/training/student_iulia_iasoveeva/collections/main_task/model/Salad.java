package com.epam.training.student_iulia_iasoveeva.collections.main_task.model;

import java.util.ArrayList;
import java.util.List;

public class Salad {

    private final List<SaladComponent> saladComponents = new ArrayList<>();

    public void addSaladComponent(SaladComponent component) {
        saladComponents.add(component);
    }


    public int getCalories() {
        return (int) saladComponents.stream().mapToDouble(SaladComponent::getCalories).sum();
    }

    public int getPrice() {
        return (int) saladComponents.stream().mapToDouble(SaladComponent::getPrice).sum();
    }

    public int getCost() {
        return (int) saladComponents.stream().mapToDouble(SaladComponent::getCost).sum();
    }

    public List<SaladComponent> getSaladComponents() {
        return new ArrayList<>(saladComponents);
    }
}

