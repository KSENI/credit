package pages.createApplication;

import org.openqa.selenium.By;

class CreateApplicationLocators {
    static final By createApplicationBy = By.cssSelector(".Button-module_box__a0BM0");
    static final By nameAndSurnameBy = By.cssSelector("input[placeholder='Иванов Иван Иванович']");
    static final By nameAndSurnameInDropDownBy = By.cssSelector(".Autocomplete-module_option__2ZVpV");
    static final By telBy = By.cssSelector("input[placeholder='+7 921 123-45-67']");
    static final By emailBy = By.cssSelector("input[placeholder='mail@mail.ru']");
    static final By sumBy = By.cssSelector("input[placeholder='Минимум 200 000 р.']");
    static final By durationBy = By.cssSelector("input[placeholder='Минимум 6 мес.']");
    static final By targetDropDownBy = By.cssSelector(".cc-select.default");
    static final By targetBuyPropertyBy = By.xpath("//*[text()[contains(.,'Покупка недвижимости')]]");
    static final By commentBy = By.cssSelector("textarea[placeholder='Укажите дополнительную инфомацию'");
    static final By photoBy = By.cssSelector(".Form_dropzone__2jBT4 input");
    static final By saveApplicationBy = By.cssSelector(".Button-module_box__a0BM0");
    static final By informationTextBy = By.cssSelector(".Message_head__2A8ZT + div");
    static final By informationCloseBy = By.cssSelector(".Message_wrapper__11ske i");
}
