package com.epam.training.student_iulia_iasoveeva.collections.main_task.util;

import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.Salad;
import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.SaladComponent;
import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.vegetable.Vegetable;

import java.util.Comparator;
import java.util.List;

public class SaladUtils {

    private SaladUtils() {

    }

    public static List<SaladComponent> getComponentsByCalories(Salad salad, double from, double to) {
        return salad.getSaladComponents().stream()
                .filter(s -> s.getCalories() > from && s.getCalories() < to).toList();
    }

    public static List<Vegetable> getVegetablesSortedByWeight(Salad salad) {
        return salad.getSaladComponents().stream()
                .filter(Vegetable.class::isInstance)
                .map(Vegetable.class::cast)
                .sorted(Comparator.comparingInt(Vegetable::getWeightInGrams))
                .toList();
    }
}
