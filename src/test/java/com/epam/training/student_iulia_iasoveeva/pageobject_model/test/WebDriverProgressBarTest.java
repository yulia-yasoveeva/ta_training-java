package com.epam.training.student_iulia_iasoveeva.pageobject_model.test;

import com.epam.training.student_iulia_iasoveeva.pageobject_model.page.SeleniumDemoProgressBar;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverProgressBarTest extends TestSetUp {
    public static final By DOWNLOAD_COMPLETED_LABEL = By.xpath("//*[@id='dialog']/div[1][text()='Complete!']");

    @Test(description = "Check download result")
    public void checkDownloadResult() {
        SeleniumDemoProgressBar page = new SeleniumDemoProgressBar(driver)
                .openPage()
                .startDownload();
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOfElementLocated(DOWNLOAD_COMPLETED_LABEL));
    }
}
