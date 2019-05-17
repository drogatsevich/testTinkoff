package browser;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class InitDriverChrome {

    private static InitDriverChrome instance;
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public static synchronized InitDriverChrome getInstance() {
        if (instance == null) {
            instance = new InitDriverChrome();
        }
        return instance;
    }

    public InitDriverChrome(){
        Browsers browsers = new Browsers(BrowserType.CHROME);
        //url
        browsers.openURL("https://www.tinkoff.ru");
        driver = browsers.getDriver();
        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    /*public static WebDriver testInit(){
        Browsers browsers = new Browsers(BrowserType.CHROME);
        //url
        browsers.openURL("https://www.tinkoff.ru");
        return browsers.getDriver();
    }*/
}
