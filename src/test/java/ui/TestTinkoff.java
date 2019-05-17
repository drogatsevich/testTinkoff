package ui;

import browser.InitDriverChrome;
import elements.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import tinkoff.pages.*;

public class TestTinkoff extends Base {

    private String ish;

    @Test
    public void test(){
        //на пункт меню “Платежи“.
        IndexPage.Pay.pay.click();

        //нажатием на пункт “Коммунальные платеж
        Payments.Communal.communal.click();

        //Убедиться, что текущий регион – “г. Москва”
        Assert.assertTrue(Kommunalnie.Moscow.moscow.isDisplayed(),"Не найден элемент");

        //ЖКУ-Москва
        ish = Kommunalnie.GkuMoscow.gkuMoscow.getText();
        Kommunalnie.GkuMoscow.gkuMoscow.click();
        //System.out.println(ish);

        //перейти на вкладку “Оплатить ЖКУ в Москве“
        ZhkuMoskva.PayZhku.payZhku.click();

        //Выполнить проверки на невалидные значения
        ZhkuMoskva.Button.button.click();
        //errors
        Assert.assertTrue(ZhkuMoskva.PayCodeError.payCodeError.isDisplayed(),"payCodeError not visible");
        Assert.assertTrue(ZhkuMoskva.PeriodError.periodError.isDisplayed(),"payCodeError not visible");
        Assert.assertTrue(ZhkuMoskva.CostError.costError.isDisplayed(),"payCodeError not visible");

        //переход на 2 шага назад
        InitDriverChrome.getInstance().getDriver().navigate().back();
        InitDriverChrome.getInstance().getDriver().navigate().back();

        //input
        Payments.Search.search.sendKeys(ish);

        //search
        Assert.assertEquals(Payments.Result.result.getText(),ish,"Не равно");

        //go to pay
        Payments.Result.result.click();
    }
}
