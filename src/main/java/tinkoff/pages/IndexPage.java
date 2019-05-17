package tinkoff.pages;

import elements.Element;
import elements.Locator;
import org.openqa.selenium.WebElement;

import static tinkoff.Locators.Meta.PAY;

public class IndexPage {

    public static class Pay {

        public static final WebElement pay = new Element().findElement(Locator.XPATH, PAY);
    }
}
