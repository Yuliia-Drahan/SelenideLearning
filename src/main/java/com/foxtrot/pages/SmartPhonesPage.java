package com.foxtrot.pages;


import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import com.foxtrot.entities.PhoneEntity;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SmartPhonesPage extends BasePage {

    @FindBy(xpath = ".//div[contains(@class, 'page__title')]/h1")
    private SelenideElement heading;

    @FindBy(xpath = ".//a[@class='card__title']")
    private SelenideElement phone;

    @FindBy(xpath = ".//i[@class='icon-close']")
    public SelenideElement closeBasketAll;


    public String getHeadingText(){
        return heading.getText();
    }


    public PhoneEntity goToPhoneEntity(){
        phone.click();
        return new PhoneEntity();
    }

    public void clickBuyPhone() {
        phone.click();
    }

    List<ElementsContainer> containers = new ArrayList<ElementsContainer>(); // ????????

}
