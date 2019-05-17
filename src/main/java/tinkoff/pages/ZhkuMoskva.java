package tinkoff.pages;

import elements.Element;
import elements.Locator;
import org.openqa.selenium.WebElement;

import static tinkoff.Locators.Meta.*;

public class ZhkuMoskva {

    public static class PayZhku {

        public static final WebElement payZhku = new Element().findElement(Locator.XPATH, PAY_MOSCOW);
    }

    /*public static class PayField {
        //Оплата
        public static final WebElement payCode = new Element().findElement(Locator.XPATH, PAYER_CODE);

        public static final WebElement period = new Element().findElement(Locator.XPATH, PERIOD);

        public static final WebElement cost = new Element().findElement(Locator.XPATH, COST);

    }*/

    public static class PayCodeError {
        public static final WebElement payCodeError = new Element().findElement(Locator.XPATH, PAYER_CODE_ERROR);
    }

    public static class PeriodError {
        public static final WebElement periodError = new Element().findElement(Locator.XPATH, PERIOD_ERROR);
    }

    public static class CostError {
        public static final WebElement costError = new Element().findElement(Locator.XPATH, COST_ERROR);
    }

    public static class Button {
        //LAbel pay
        public static final WebElement button = new Element().findElement(Locator.XPATH, BUTTON);
    }

}
