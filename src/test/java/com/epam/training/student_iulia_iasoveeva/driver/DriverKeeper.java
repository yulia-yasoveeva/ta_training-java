package com.epam.training.student_iulia_iasoveeva.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverKeeper {

    private static WebDriver webDriver;

    DriverKeeper() {

    }

    public static WebDriver getInstance() {
        if (webDriver == null) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
        }
        return webDriver;
    }

    public static void killDriver() {
        webDriver.quit();
        webDriver = null;
    }
}
