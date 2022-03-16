package com.epam.training.student_iulia_iasoveeva.collections.main_task;

import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.Salad;
import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.sauce.Caesar;
import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.sauce.GreekYogurt;
import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.vegetable.Cucumber;
import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.vegetable.CucumberVariety;
import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.vegetable.Tomato;
import com.epam.training.student_iulia_iasoveeva.collections.main_task.model.vegetable.TomatoVariety;
import com.epam.training.student_iulia_iasoveeva.collections.main_task.util.SaladUtils;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Tomato tomato1 = new Tomato();
        tomato1.setVariety(TomatoVariety.CHERRY);
        tomato1.setWeightInGrams(90);
        tomato1.setCaloriesPerHundredGrams(45);
        tomato1.setPrice(100);

        Tomato tomato2 = new Tomato();
        tomato2.setVariety(TomatoVariety.ITALIAN);
        tomato2.setWeightInGrams(80);
        tomato2.setCaloriesPerHundredGrams(55);
        tomato2.setPrice(300);

        Cucumber cucumber1 = new Cucumber();
        cucumber1.setVariety(CucumberVariety.LADUSHKA);
        cucumber1.setWeightInGrams(105);
        cucumber1.setCaloriesPerHundredGrams(30);
        cucumber1.setPrice(650);

        Cucumber cucumber2 = new Cucumber();
        cucumber2.setVariety(CucumberVariety.VASILIEK);
        cucumber2.setWeightInGrams(120);
        cucumber2.setCaloriesPerHundredGrams(25);
        cucumber2.setPrice(500);

        Caesar caesar = new Caesar();
        caesar.setCalories(45);
        caesar.setSpicy(true);
        caesar.setPrice(310);

        GreekYogurt greekYogurt = new GreekYogurt();
        greekYogurt.setSpicy(false);
        greekYogurt.setCalories(25);
        greekYogurt.setPrice(240);


        Salad saladHealth = new Salad();
        saladHealth.addSaladComponent(caesar);
        saladHealth.addSaladComponent(cucumber1);
        saladHealth.addSaladComponent(tomato1);

        Salad saladVegetarian = new Salad();
        saladVegetarian.addSaladComponent(greekYogurt);
        saladVegetarian.addSaladComponent(cucumber1);
        saladVegetarian.addSaladComponent(tomato1);


        Salad saladSummer = new Salad();
        saladSummer.addSaladComponent(greekYogurt);
        saladSummer.addSaladComponent(cucumber2);
        saladSummer.addSaladComponent(tomato2);


        Salad saladSunny = new Salad();
        saladSunny.addSaladComponent(caesar);
        saladSunny.addSaladComponent(cucumber2);
        saladSunny.addSaladComponent(tomato2);
        saladSunny.addSaladComponent(cucumber1);


        List<Salad> salads = List.of(saladHealth, saladSunny, saladSummer, saladVegetarian);
        for (Salad s : salads) {
            System.out.println("-------------------------");
            s.getSaladComponents().forEach(System.out::println);
            System.out.println("Calories: " + s.getCalories() + "\n" + "Price: " + s.getPrice() + "\n");
        }
        System.out.println(SaladUtils.getVegetablesSortedByWeight(saladHealth));
        System.out.println(SaladUtils.getComponentsByCalories(saladSunny, 40, 60));
    }
}
