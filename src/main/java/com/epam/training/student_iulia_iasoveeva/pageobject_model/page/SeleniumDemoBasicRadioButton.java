package com.epam.training.student_iulia_iasoveeva.pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDemoBasicRadioButton {
    private static final String URL = "https://demo.seleniumeasy.com/basic-radiobutton-demo.html";
    private WebDriver driver;
    private static final By RADIO_BUTTON_FEMALE = By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label[2]/input");
    private static final By RADIO_BUTTON_AGE_15TO50 = By.xpath("//*[@id='easycont']//label[3]/input");
    private static final By GET_VALUES_BUTTON = By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/button");
    private static final By GET_VALUES_CHECK_AREA = By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/p[2]");

    public SeleniumDemoBasicRadioButton(WebDriver driver) {
        this.driver = driver;
    }

    public SeleniumDemoBasicRadioButton pageOpen() {
        driver.get(URL);
        return this;
    }

    public SeleniumDemoBasicRadioButton chooseSex() {
        driver.findElement(RADIO_BUTTON_FEMALE).click();
        return this;
    }

    public SeleniumDemoBasicRadioButton chooseAgeGroup() {
        driver.findElement(RADIO_BUTTON_AGE_15TO50).click();
        return this;
    }

    public SeleniumDemoBasicRadioButton getValues() {
        driver.findElement(GET_VALUES_BUTTON).click();
        return this;
    }

    public String getValueSelectedSex() {
        return driver.findElement(RADIO_BUTTON_FEMALE).getAttribute("value");
    }

    public String getValueSelectedAgeGroup() {
        return driver.findElement(RADIO_BUTTON_AGE_15TO50).getAttribute("value");
    }

    public String getValuesCheckArea() {
        return driver.findElement(GET_VALUES_CHECK_AREA).getText();
    }
}


