package com.foxtrot.pages;

import com.foxtrot.headerItems.HeaderBasket;
import com.foxtrot.headerItems.HeaderMenu;
import com.foxtrot.headerItems.HeaderSearch;
import org.openqa.selenium.support.FindBy;

public class BasePage {
    public BasePage() {
    }

    @FindBy(xpath = ".//div[@class='header-search evinent-search-container']")
    public HeaderSearch headerSearch;

    @FindBy(xpath = ".//div[@class='header-tooltip__cards smooth-scroll']")
    public HeaderBasket headerBasket;

    @FindBy(xpath = ".//ul[@class='header__categories-items smooth-scroll']")
    public HeaderMenu headerMenu;

}
