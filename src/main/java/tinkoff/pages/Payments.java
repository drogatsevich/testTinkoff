package tinkoff.pages;

import elements.Element;
import elements.Locator;
import org.openqa.selenium.WebElement;

import static tinkoff.Locators.Meta.COMMUNAL;
import static tinkoff.Locators.Meta.RESULT;
import static tinkoff.Locators.Meta.SEARCH;

public class Payments {

    public static class Communal {

        public static final WebElement communal = new Element().findElement(Locator.XPATH, COMMUNAL);
    }

    public static class Search {

        public static final WebElement search = new Element().findElement(Locator.XPATH, SEARCH);
    }

    public static class Result {

        public static final WebElement result = new Element().findElement(Locator.XPATH, RESULT);
    }

}
