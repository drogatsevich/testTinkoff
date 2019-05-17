package elements;

import org.openqa.selenium.WebElement;

public interface IElement {

    public WebElement findElement(Locator locator, String locatorValue);
    public void type(String value);
    public void click();
}
