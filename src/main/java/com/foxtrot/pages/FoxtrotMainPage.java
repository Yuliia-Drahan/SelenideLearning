package com.foxtrot.pages;

import com.codeborne.selenide.SelenideElement;
import com.foxtrot.headerItems.HeaderMenu;
import org.openqa.selenium.support.FindBy;


public class FoxtrotMainPage extends BasePage {
    HeaderMenu headerMenu = new HeaderMenu();

    @FindBy(xpath = ".//li[@data-category='32014']/span[@class='icon dropdown-arrow']")
    private SelenideElement phoneMenu;

    @FindBy(xpath = ".//a[@href='/ru/shop/mobilnye_telefony_smartfon.html']")
    private SelenideElement phoneList;

    @FindBy(xpath = ".//li[@class='catalog__category-item jslink']")
    private SelenideElement phoneListMenu;

    public Boolean checkPhoneMenuDisplayed(){
        headerMenu.expandMenu(phoneMenu);
        Boolean displayed = phoneListMenu.isDisplayed();
        return displayed;
    }

    public SmartPhonesPage clickSmartPhones(){
        headerMenu.expandMenu(phoneMenu);
        phoneList.click();
        return new SmartPhonesPage();

    }
}
