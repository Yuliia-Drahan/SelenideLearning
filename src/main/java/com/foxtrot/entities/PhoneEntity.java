package com.foxtrot.entities;

import com.codeborne.selenide.SelenideElement;
import com.foxtrot.pages.BasePage;
import org.openqa.selenium.support.FindBy;

public class PhoneEntity extends BasePage {

    @FindBy(xpath = "//div[@class='product-box__main-buy ']")
    private SelenideElement mainBuyPhoneButton;

    @FindBy(xpath = "//div[@class='product-box__main-buyloans_wrapper']")
    private SelenideElement mainBuyPhoneByLoans;

    @FindBy(xpath = "//div[@class='button buy-button  product-buy-button']")
    private SelenideElement headerBuyPhoneButton;

    public void buyPhoneMain () {
        mainBuyPhoneButton.click();
    }

    public void buyPhoneByLoans (){
        mainBuyPhoneByLoans.click();
    }

    public void buyPhoneHeader (){
        headerBuyPhoneButton.click();
    }
}

