package com.epam.training.student_iulia_iasoveeva.pageobject_model.test;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class TestSetUp {
    protected WebDriver driver;

    @BeforeMethod
    public void browserSetUp() throws MalformedURLException {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("appium:deviceName", "Google Pixel 4a (5G) GoogleAPI Emulator");
        caps.setCapability("appium:platformVersion", "12.0");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("appiumVersion", "1.22.1");
        caps.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-yulia.yasoveeva-75126:99619ae6-97a7-46e2-95ed-7147a5f7cd2f@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        driver = new RemoteWebDriver(url, caps);
    }

    @AfterMethod
    public void browserTearDown() {
        driver.quit();
        driver = null;

    }
}
