package com.epam.training.student_iulia_iasoveeva.pageobject_model.test;

import com.epam.training.student_iulia_iasoveeva.pageobject_model.page.SeleniumDemoInputField;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverSeleniumEasyDemoTest extends TestSetUp {
    private static final String MESSAGE = "Task 1";
    private static final String NON_NUMERIC_STRING_A = "fgTh";
    private static final String NON_NUMERIC_STRING_B = "gawpT";
    private static final String NOT_A_NUMBER = "NaN";
    private static final String NUMERIC_STRING_A = "333";
    private static final String NUMERIC_STRING_B = "555";
    private static final String TOTAL_SUM = "888";


    @Test(description = "Task 1: single input key ")
    public void CreateNewMessage() {
        SeleniumDemoInputField page = new SeleniumDemoInputField(driver)
                .openPage()
                .writeMessage(MESSAGE)
                .showMessage();
        page.getMessageText();
        Assert.assertEquals(page.getMessageText(), MESSAGE);
    }

    @Test(description = "Task 2: Two Input Fields - Nan Error Check")
    public void twoInputFieldsNaN() {
        SeleniumDemoInputField page = new SeleniumDemoInputField(driver)
                .openPage()
                .enterStringA(NON_NUMERIC_STRING_A)
                .enterStringB(NON_NUMERIC_STRING_B)
                .getTotalButton();
        Assert.assertEquals(page.getTextValue(), NOT_A_NUMBER);
    }

    @Test(description = "Task 2: Two Input Fields - Total Sum Check")
    public void twoInputFieldsNumbers() {
        SeleniumDemoInputField page = new SeleniumDemoInputField(driver)
                .openPage()
                .enterStringA(NUMERIC_STRING_A)
                .enterStringB(NUMERIC_STRING_B)
                .getTotalButton();
        Assert.assertEquals(page.getTextValue(), TOTAL_SUM);
    }
}


