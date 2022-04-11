package com.epam.training.student_iulia_iasoveeva.pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PastebinHomePage extends AbstractPage {
    private static final String URL = "https://pastebin.com";
    private static final By NEW_PASTE_INPUT = By.xpath("//textarea[@id=\"postform-text\"]");
    private static final By PASTE_NAME_TITLE_INPUT = By.xpath("//input[@id='postform-name']");
    private static final By CREATE_NEW_PASTE_BUTTON = By.xpath("//form[@id='w0']//button");
    public static final By PASTE_HIGHLIGHTING_DROPDOWN = By.xpath("//label[text()='Syntax Highlighting:']/..//span[@class='select2-selection__arrow']");
    public static final String PASTE_HIGHLIGHTING_VALUE_LOCATOR = "//li[contains(@id, 'select2-postform-format-result')][text()='%s']";
    private static final By PASTE_EXPIRATION_DROPDOWN = By.xpath("//label[text()='Paste Expiration:']/..//span[@class='select2-selection__arrow']");
    private static final String PASTE_EXPIRATION_VALUE_LOCATOR = "//li[contains(@id, 'select2-postform-expiration-result')][text()='%s']";

    public static final By AGREE_BUTTON = By.xpath("//*[@id='qc-cmp2-ui']/div[2]/div/button[2]");
//li[contains(@id, 'select2-postform-format-result')][text()='Bash']

        public PastebinHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Override
    public PastebinHomePage openPage() {
        driver.get(URL);
        agreeCookies();
        return this;
    }

    public PastebinHomePage agreeCookies() {
        driver.findElement(AGREE_BUTTON).click();
        return this;
    }

    public PastebinHomePage writePaste(String paste) {
        WebElement newPaste = driver.findElement(NEW_PASTE_INPUT);
        newPaste.sendKeys(paste);
        return this;
    }

    public PastebinHomePage chooseHighlighting(String valueHighlighting) {
        scrollPageUp(250);
        driver.findElement(PASTE_HIGHLIGHTING_DROPDOWN).click();
        driver.findElement(By.xpath(String.format(PASTE_HIGHLIGHTING_VALUE_LOCATOR, valueHighlighting))).click();
        return this;
    }

    public PastebinHomePage chooseExpiration(String value) {
        scrollPageUp(350);
        WebElement expiration = driver.findElement(PASTE_EXPIRATION_DROPDOWN);
        expiration.click();
        WebElement expirationOption = driver.findElement(By.xpath(String.format(PASTE_EXPIRATION_VALUE_LOCATOR, value)));
        expirationOption.click();
        return this;
    }

    public PastebinHomePage writeTitle(String phrase) {
        WebElement pasteTitle = driver.findElement(PASTE_NAME_TITLE_INPUT);
        pasteTitle.sendKeys(phrase);
        return this;
    }

    public PastebinCreatePasteResultPage createNewPaste() {
        WebElement createNewPasteBtn = driver.findElement(CREATE_NEW_PASTE_BUTTON);
        createNewPasteBtn.click();
        return  new PastebinCreatePasteResultPage(driver);
    }

    private void scrollPageUp(Integer pixel) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(String.format("window.scrollBy(0,%d)", pixel), "");
    }
}

