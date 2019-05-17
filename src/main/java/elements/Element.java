package elements;

import browser.InitDriverChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Element implements IElement {
    private WebDriver driver = InitDriverChrome.getInstance().getDriver();
    private WebElement element;


    public WebElement getElement() {
        return element;
    }

    public void setElement(WebElement element) {
        this.element = element;
    }

    @Override
    public WebElement findElement(Locator locator, String value) {
        ElementWait.waitXPATH(value);
        switch (locator) {
            case CLASSNAME:
                element = driver.findElement(By.className(value));
                break;
            case CSS:
                element = driver.findElement(By.cssSelector(value));
                break;
            case ID:
                element = driver.findElement(By.id(value));
                break;
            case LINKTEXT:
                element = driver.findElement(By.linkText(value));
                break;
            case NAME:
                element = driver.findElement(By.name(value));
                break;
            case PARTIALLINKTEXT:
                element = driver.findElement(By.partialLinkText(value));
                break;
            case TAGNAME:
                element = driver.findElement(By.tagName(value));
                break;
            case XPATH:
                element = driver.findElement(By.xpath(value));
                break;
            default:
                break;
        }
        return element;
    }

    @Override
    public void type(String value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void click() {
        // TODO Auto-generated method stub

    }
}
