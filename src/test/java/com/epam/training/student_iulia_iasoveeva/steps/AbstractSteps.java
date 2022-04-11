package com.epam.training.student_iulia_iasoveeva.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractSteps {

    public static final Logger log = LoggerFactory.getLogger(AbstractSteps.class);

    @Given("Nothing happened")
    public void nothingHappened() {
        log.info("Nothing happened indeed");
    }

    @When("I do nothing")
    public void doNothing() {
        log.info("Did nothing");
    }

    @Then("Something happens")
    public void somethingHappens() {
        log.info("Something happened");
//        fail("Fail this step");
    }

}
