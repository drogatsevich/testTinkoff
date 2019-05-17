package elements;

import browser.InitDriverChrome;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterMethod;

public class Base {
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        try {
            //Close webDriver
            InitDriverChrome.getInstance().getDriver().quit();
        } catch (WebDriverException e) {

        }
    }
}
