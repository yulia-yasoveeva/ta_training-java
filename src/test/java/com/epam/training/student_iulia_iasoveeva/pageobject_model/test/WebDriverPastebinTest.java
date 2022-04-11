package com.epam.training.student_iulia_iasoveeva.pageobject_model.test;

import com.epam.training.student_iulia_iasoveeva.pageobject_model.page.PastebinCreatePasteResultPage;
import com.epam.training.student_iulia_iasoveeva.pageobject_model.page.PastebinHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverPastebinTest extends TestSetUp {
    private static final String EXPIRATION_TIME = "10 Minutes";
    public static final String SYNTAX_HIGHLIGHTING = "Bash";
    public static final String PASTE_TITLE = "how to gain dominance among developers";
    public static final String PASTE_CODE = """
            git config --global user.name  "New Sheriff in Town"
            git reset $(git commit-tree HEAD^{tree} -m "Legacy code")
            git push origin master --force""";


    @Test(description = "Create new paster")
    public void createNewPaste() {
        new PastebinHomePage(driver).openPage()
                .writePaste("Hello from WebDriver")
                .chooseExpiration(EXPIRATION_TIME)
                .writeTitle("helloweb")
                .createNewPaste();
    }

    @Test(description = "Create paster with syntax highlighting")
    private void createPasteWithHighlighting() {
        new PastebinHomePage(driver)
                .openPage()
                .writePaste(PASTE_CODE)
                .chooseHighlighting(SYNTAX_HIGHLIGHTING)
                .chooseExpiration(EXPIRATION_TIME)
                .writeTitle(PASTE_TITLE)
                .createNewPaste();
    }

    @Test(description = "Check title, syntax value, text in created paste")
    private void checkPasteTitleSyntaxText() throws InterruptedException {
        PastebinCreatePasteResultPage page = new PastebinHomePage(driver)
                .openPage()
                .writePaste(PASTE_CODE)
                .chooseHighlighting(SYNTAX_HIGHLIGHTING)
                .chooseExpiration(EXPIRATION_TIME)
                .writeTitle(PASTE_TITLE)
                .createNewPaste();
        page.agreeCookies();
        Assert.assertEquals(page.getPageTitle(), PASTE_TITLE + " - Pastebin.com");
        Assert.assertEquals(page.getTextArea(), PASTE_CODE);
        Assert.assertEquals(page.getSyntaxHighlighting(), SYNTAX_HIGHLIGHTING);
    }

}
