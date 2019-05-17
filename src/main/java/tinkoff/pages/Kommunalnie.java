package tinkoff.pages;

import elements.Element;
import elements.Locator;
import org.openqa.selenium.WebElement;

import static tinkoff.Locators.Meta.GKU_MOSCOW;
import static tinkoff.Locators.Meta.MOSCOW;

public class Kommunalnie {

    public static class Moscow  {
        public static final WebElement moscow = new Element().findElement(Locator.XPATH, MOSCOW);
    }

    public static class GkuMoscow {
        public static final WebElement gkuMoscow = new Element().findElement(Locator.XPATH, GKU_MOSCOW);
    }
}
