package com.epam.training.student_iulia_iasoveeva.pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDemoBasicDropdown {
    private static final String URL = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
    private final WebDriver driver;
    private static final By DROPDOWN_SELECT_DAY = By.xpath("//*[@id='select-demo']");
    private static final By DROPDOWN_SELECT_DAY_FRIDAY = By.xpath("//*[@id='select-demo']/option[7]");
    private static final By CHECK_SELECTED_DAY = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]");

    public SeleniumDemoBasicDropdown(WebDriver driver) {
        this.driver = driver;
    }

    public SeleniumDemoBasicDropdown openPage() {
        driver.get(URL);
        return this;
    }

    public SeleniumDemoBasicDropdown openDropdownDay() {
        driver.findElement(DROPDOWN_SELECT_DAY).click();
        return this;
    }

    public SeleniumDemoBasicDropdown chooseFriday() {
        driver.findElement(DROPDOWN_SELECT_DAY_FRIDAY).click();
        return this;
    }

    public String verifySelectedDay() {
        return driver.findElement(DROPDOWN_SELECT_DAY_FRIDAY).getAttribute("value");
    }

       public String getValueSelectedDay() {
        return driver.findElement(CHECK_SELECTED_DAY).getText();
    }
}
