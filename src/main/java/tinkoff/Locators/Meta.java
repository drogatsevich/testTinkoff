package tinkoff.Locators;

public class Meta {

    public static final String PAY = "//a[contains(.,'Платежи')]";

    public static final String COMMUNAL = "//div[@data-qa-file = 'IconWithText' and contains(.,'ЖКХ')]";

    public static final String MOSCOW = "//span[contains(.,'Москве')]";

    public static final String GKU_MOSCOW = "//span[contains(.,'ЖКУ-Москва')]";

    public static final String PAY_MOSCOW = "//span[contains(.,'Оплатить ЖКУ в Москве')]";

    //
    //public static final String PAYER_CODE = "//label[@for = 'payerCode']//input";

    public static final String PAYER_CODE_ERROR = "(//div[@data-qa-file = 'UIFormRowError' and contains(.,'Поле обязательное')])[1]";

    //
    //public static final String PERIOD= "//label[@for = 'period']//input";

    public static final String PERIOD_ERROR = "(//div[@data-qa-file = 'UIFormRowError' and contains(.,'Поле обязательное')])[2]";

    //
    //public static final String COST= "//label[@class = 'Input__wrapper_S4UHZ']//input";

    public static final String COST_ERROR = "(//div[@data-qa-file = 'UIFormRowError' and contains(.,'Поле обязательное')])[3]";

    //
    public static final String BUTTON = "//h2[contains(.,'Оплатить ЖКУ в Москве')]/ancestor::button";

    //input
    public static final String SEARCH = "//input[@placeholder = 'Название или ИНН получателя платежа']";

    //result
    public static final String RESULT = "(//div[@class = 'Text__text_2Vhh9 Text__text_size_17_28jfD Text__text_sizeDesktop_17_3xMoD Text__text_overflowEllipsis_2aq0W'])[1]";


}
