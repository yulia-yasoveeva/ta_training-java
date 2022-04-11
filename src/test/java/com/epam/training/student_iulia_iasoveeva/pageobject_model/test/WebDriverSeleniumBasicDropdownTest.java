package com.epam.training.student_iulia_iasoveeva.pageobject_model.test;

import com.epam.training.student_iulia_iasoveeva.pageobject_model.page.SeleniumDemoBasicDropdown;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverSeleniumBasicDropdownTest extends TestSetUp {

    @Test(description = "Select day in dropdown")
    public void seleniumDropdownTest() {
        SeleniumDemoBasicDropdown page = new SeleniumDemoBasicDropdown(driver)
                .openPage()
                .openDropdownDay()
                .chooseFriday();
        Assert.assertEquals(page.verifySelectedDay(), "Friday");
        Assert.assertEquals(page.getValueSelectedDay(), "Day selected :- Friday");
    }
}
