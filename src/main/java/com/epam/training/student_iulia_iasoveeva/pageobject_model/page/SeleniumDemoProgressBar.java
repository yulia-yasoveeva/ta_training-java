package com.epam.training.student_iulia_iasoveeva.pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDemoProgressBar {
    private static final String URL = "https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html";
    private final WebDriver driver;
    private static final By START_DOWNLOAD_BUTTON = By.xpath("//button[@id='downloadButton']");

    public SeleniumDemoProgressBar(WebDriver driver) {
        this.driver = driver;
    }

    public SeleniumDemoProgressBar openPage() {
        driver.get(URL);
        return this;
    }

    public SeleniumDemoProgressBar startDownload() {
        driver.findElement(START_DOWNLOAD_BUTTON).click();
        return this;
    }
}
