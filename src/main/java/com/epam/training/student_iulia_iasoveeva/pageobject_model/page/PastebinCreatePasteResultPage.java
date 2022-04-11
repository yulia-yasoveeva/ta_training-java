package com.epam.training.student_iulia_iasoveeva.pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.epam.training.student_iulia_iasoveeva.pageobject_model.page.PastebinHomePage.AGREE_BUTTON;

public class PastebinCreatePasteResultPage {

    private static final By SYNTAX_HIGHLIGHTING_BUTTON = By.xpath("//div[@class='top-buttons']/div[@class='left']/a");
    private static final By TEXTAREA = By.xpath("//textarea");
    public final WebDriver driver;

    public PastebinCreatePasteResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public void agreeCookies() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10))
               .until(ExpectedConditions.elementToBeClickable(AGREE_BUTTON));
        driver.findElement(AGREE_BUTTON).click();

    }


    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getSyntaxHighlighting() {
        return driver.findElement(SYNTAX_HIGHLIGHTING_BUTTON).getText();
    }

    public String getTextArea(){
        return driver.findElement(TEXTAREA).getText();
    }
}
