package com.foxtrot.headerItems;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class HeaderBasket extends ElementsContainer {


    @FindBy(xpath = ".//div[@class='header-basket']")
    public SelenideElement basketIcon;

    @FindBy(xpath = ".//div[@id='cartTooltip']")
    public SelenideElement basketTooltip;

    @FindBy(xpath = ".//a[text()='Оформить заказ']")
    public SelenideElement checkOutButton;

    @FindBy(xpath = ".//div[@class='header-tooltip__cards-item__body']")
    public ElementsCollection basketItems;

    @FindBy(xpath = ".//div[@class ='header-tooltip__cards-item analytics-data main-product ' and @data-title='Смартфон Samsung Galaxy A71 6/128GB Dual SIM Black (SM-A715FZKUSEK)']")
    private SelenideElement itemInBasket;


    public void clickBasketIcon(){
        basketIcon.click();
    }

    public Boolean checkBTooltipIsHere() {
        Boolean displayed = basketTooltip.isDisplayed();
        return displayed;
    }

    public void clickCheckOutButton(){
        checkOutButton.click();
    }

    public void itemsInBasket(){
        itemInBasket.waitUntil(Condition.visible, 3000);
    }

    public Integer checkItemsInBasket(){
        ElementsCollection elements = basketItems;
        int numberOfItems = elements.size();
        return numberOfItems;
    }
}
