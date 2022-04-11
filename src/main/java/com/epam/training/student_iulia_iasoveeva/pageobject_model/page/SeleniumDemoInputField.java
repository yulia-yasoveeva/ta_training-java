package com.epam.training.student_iulia_iasoveeva.pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumDemoInputField {
    private static final String URL = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final WebDriver driver;
    private static final By ENTER_MESSAGE_INPUT = By.xpath("//input[@id='user-message']");
    private static final By SHOW_MESSAGE_BUTTON = By.xpath("//form[@id='get-input']/button");
    private static final By NO_THANKS_BUTTON = By.xpath("//*[@id='at-cv-lightbox-button-holder']/a[2]");
    private static final By SHOW_MESSAGE_AREA = By.xpath("//span[@id='display']");
    private static final By ENTER_A_AREA = By.xpath("//input[@id='sum1']");
    private static final By ENTER_B_AREA = By.xpath("//input[@id='sum2']");
    private static final By GET_TOTAL_BUTTON = By.xpath("//form[@id='gettotal']/button");
    private static final By DISPLAY_VALUE_AREA = By.xpath("//span[@id='displayvalue']");


    public SeleniumDemoInputField(WebDriver driver) {
        this.driver = driver;
    }

    public SeleniumDemoInputField openPage() {
        driver.get(URL);
        driver.findElement(NO_THANKS_BUTTON).click();
        return this;
    }

    public SeleniumDemoInputField writeMessage(String message) {
        WebElement newMessage = driver.findElement(ENTER_MESSAGE_INPUT);
        newMessage.sendKeys(message);
        return this;
    }

    public SeleniumDemoInputField showMessage() {
        WebElement showMessageBtn = driver.findElement(SHOW_MESSAGE_BUTTON);
        showMessageBtn.click();
        return this;
    }

    public String getMessageText() {
        return driver.findElement(SHOW_MESSAGE_AREA).getText();
    }

    public SeleniumDemoInputField enterStringA(String stringA) {
        driver.findElement(ENTER_A_AREA).sendKeys(stringA);
        return this;
    }

    public SeleniumDemoInputField enterStringB(String stringB) {
        driver.findElement(ENTER_B_AREA).sendKeys(stringB);
        return this;
    }

    public SeleniumDemoInputField getTotalButton() {
        driver.findElement(GET_TOTAL_BUTTON).click();
        return this;
    }

    public String getTextValue() {
        return driver.findElement(DISPLAY_VALUE_AREA).getText();

    }

}
