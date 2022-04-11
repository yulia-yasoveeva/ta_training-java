package com.epam.training.student_iulia_iasoveeva.utilities;

import com.epam.training.student_iulia_iasoveeva.driver.DriverKeeper;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void afterScenario() {
        DriverKeeper.killDriver();
    }
}