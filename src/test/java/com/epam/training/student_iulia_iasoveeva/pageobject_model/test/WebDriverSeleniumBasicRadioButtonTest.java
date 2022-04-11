package com.epam.training.student_iulia_iasoveeva.pageobject_model.test;

import com.epam.training.student_iulia_iasoveeva.pageobject_model.page.SeleniumDemoBasicRadioButton;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverSeleniumBasicRadioButtonTest extends TestSetUp {
    @Test(description = "Select Age group and Sex ")
    private void createValues() {
        SeleniumDemoBasicRadioButton page = new SeleniumDemoBasicRadioButton(driver)
                .pageOpen()
                .chooseSex()
                .chooseAgeGroup()
                .getValues();
        Assert.assertEquals(page.getValueSelectedSex(), "Female");
        Assert.assertEquals(page.getValueSelectedAgeGroup(), "15 - 50");
        Assert.assertEquals(page.getValuesCheckArea(), "Sex : Female\n" +
                "Age group: 15 - 50");

    }
}
