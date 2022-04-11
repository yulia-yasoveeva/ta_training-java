package com.epam.training.student_iulia_iasoveeva.pageobject_model.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestSetUp {
    protected WebDriver driver;

    @BeforeClass
    public void driverSetUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void browserSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void browserTearDown() {
        driver.quit();
        driver = null;

    }
}
