package com.epam.training.student_iulia_iasoveeva.steps;

import com.epam.training.student_iulia_iasoveeva.driver.DriverKeeper;
import com.epam.training.student_iulia_iasoveeva.pageobject_model.page.SeleniumDemoBasicCheckbox;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WDSeleniumBasicSteps {
    @Given("I am on main page")
    public void openPage() {
        WebDriver driver = DriverKeeper.getInstance();
        SeleniumDemoBasicCheckbox page = new SeleniumDemoBasicCheckbox(driver).openPage();
    }

    @When("I check all 4 checkboxes")
    public void doNothing() {
        new SeleniumDemoBasicCheckbox(DriverKeeper.getInstance())
                .clickRadioButtonOption1()
                .clickRadioButtonOption2()
                .clickRadioButtonOption3()
                .clickRadioButtonOption4();
    }

    @Then("label changes to {string}")
    public void somethingHappens(String label) {
        WebDriver driver = DriverKeeper.getInstance();
        SeleniumDemoBasicCheckbox page = new SeleniumDemoBasicCheckbox(driver);
        Assert.assertEquals(page.getValueCheckArea(), label);
    }

}
