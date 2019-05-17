package elements;

import browser.InitDriverChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ElementWait {

    public static void waitXPATH(String locator){
        new WebDriverWait(InitDriverChrome.getInstance().getDriver(), 60)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        //System.out.println("отработало"+locator);
    }


    public void waitXpath(String locator){
        try {
            WebDriverWait wait = new WebDriverWait(InitDriverChrome.getInstance().getDriver(), 10);
            /*WebElement button = */wait.until(visibilityOfElementLocated(By.xpath(locator)));
        }catch(TimeoutException e){
            e.printStackTrace();
        }
    }
}
