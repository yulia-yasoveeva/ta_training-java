package com.epam.training.student_iulia_iasoveeva.pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDemoBasicCheckbox {
    private static final String URL = "https://demo.seleniumeasy.com/basic-checkbox-demo.html";
    private final WebDriver driver;
    private static final By RADIOBUTTON_OPTION_1 = By.xpath("//label[text()='Option 1']/input");
    private static final By RADIOBUTTON_OPTION_2 = By.xpath("//label[text()='Option 2']/input");
    private static final By RADIOBUTTON_OPTION_3 = By.xpath("//label[text()='Option 3']/input");
    private static final By RADIOBUTTON_OPTION_4 = By.xpath("//label[text()='Option 4']/input");
    private static final By LABEL_CHECK = By.xpath("//*[@id='check1']");

    public SeleniumDemoBasicCheckbox(WebDriver driver) {
        this.driver = driver;
    }

    public SeleniumDemoBasicCheckbox openPage() {
        driver.get(URL);
        return this;
    }

    public SeleniumDemoBasicCheckbox clickRadioButtonOption1() {
        driver.findElement(RADIOBUTTON_OPTION_1).click();
        return this;
    }
    public SeleniumDemoBasicCheckbox clickRadioButtonOption2() {
        driver.findElement(RADIOBUTTON_OPTION_2).click();
        return this;
    }
    public SeleniumDemoBasicCheckbox clickRadioButtonOption3() {
        driver.findElement(RADIOBUTTON_OPTION_3).click();
        return this;
    }
    public SeleniumDemoBasicCheckbox clickRadioButtonOption4() {
        driver.findElement(RADIOBUTTON_OPTION_4).click();
        return this;
    }
    public String getValueCheckArea(){
        return driver.findElement(LABEL_CHECK).getAttribute("value");
    }
}
