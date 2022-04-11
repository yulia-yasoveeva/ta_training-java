package com.epam.training.student_iulia_iasoveeva.pageobject_model.test;

import com.epam.training.student_iulia_iasoveeva.pageobject_model.page.SeleniumDemoBasicCheckbox;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverSeleniumBasicCheckboxTest extends TestSetUp {
    private static final String CHECK_AREA_VALUE_Uncheck = "Uncheck All";
    private static final String CHECK_AREA_VALUE_CHECK = "Check All";

    @Test(description = "All 4 checkboxes are checked ")
    public void checkAreaAllCheckboxesAreChecked() {
      SeleniumDemoBasicCheckbox page =  new SeleniumDemoBasicCheckbox(driver)
                .openPage()
                .clickRadioButtonOption1()
                .clickRadioButtonOption2()
                .clickRadioButtonOption3()
                .clickRadioButtonOption4();
        Assert.assertEquals(page.getValueCheckArea(),CHECK_AREA_VALUE_Uncheck);
    }
    @Test
    public void checkAreaSomeCheckboxesAreChecked() {
        SeleniumDemoBasicCheckbox page = new SeleniumDemoBasicCheckbox(driver)
                .openPage()
                .clickRadioButtonOption1()
                .clickRadioButtonOption2()
                .clickRadioButtonOption3()
                .clickRadioButtonOption4()
                .clickRadioButtonOption1();
        Assert.assertEquals(page.getValueCheckArea(), CHECK_AREA_VALUE_CHECK);

    }
}
