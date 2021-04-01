package com.foxtrot.headerItems;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends ElementsContainer {

    @FindBy(xpath = ".//a[@class='js-hover-catalog']")
    private SelenideElement mainCatalog;

    @FindBy(xpath =".//li[@data-category='32014']/span[@class='icon dropdown-arrow']" )
    private SelenideElement phoneMenu;

    @FindBy(xpath =".//li[@class='js-hover-catalog-category' and @data-category='32022']" )
    private SelenideElement tV;

    @FindBy(xpath = ".//li[@class='js-hover-catalog-category' and @data-category='32019']")
    private SelenideElement kitchen;

    @FindBy(xpath = ".//li[@class='js-hover-catalog-category' and @data-category='32020']" )
    private SelenideElement home;

    @FindBy(xpath = "//li[@class='js-hover-catalog-category' and @data-category='32021']")
    private SelenideElement computers;

    @FindBy(xpath = ".//li[@class='js-hover-catalog-category' and @data-category='32111']")
    private SelenideElement games;

    public void expandMenu(SelenideElement menu){
        menu.click();
        menu.waitUntil(Condition.visible, 2000);
    }
}
