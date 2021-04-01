package com.foxtrot.pages;


import com.codeborne.selenide.SelenideElement;
import com.foxtrot.entities.PhoneEntity;
import org.openqa.selenium.support.FindBy;

public class SmartPhonesPage extends BasePage {

    @FindBy(xpath = ".//div[contains(@class, 'page__title')]/h1")
    private SelenideElement heading;

    @FindBy(xpath = ".//div[@data-product-title='Смартфон Samsung Galaxy A71 6/128GB Dual SIM Black (SM-A715FZKUSEK)']")
    private SelenideElement phone;

    @FindBy(xpath = ".//a[@title='Смартфон Samsung Galaxy A71 6/128GB Dual SIM Black (SM-A715FZKUSEK)']")
    private SelenideElement phoneTitle;

    @FindBy(xpath = ".//i[@class='icon-close']")
    public SelenideElement closeBasketAll;

    public String getHeadingText(){
        return heading.getText();
    }


    public PhoneEntity goToPhoneEntity(){
        phoneTitle.click();
        return new PhoneEntity();
    }

    public void clickBuyPhone() {
        phone.click();
    }

}
