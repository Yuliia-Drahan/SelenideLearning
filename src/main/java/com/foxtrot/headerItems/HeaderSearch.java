package com.foxtrot.headerItems;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public  class HeaderSearch extends ElementsContainer {

    @FindBy(xpath = ".//input[@value='НАЙТИ']")
    public SelenideElement searchButton;

    @FindBy(xpath = ".//i[@id='searchClear']" )
    public SelenideElement clearSearch;

    @FindBy(xpath = ".//i[@id='evinentSearchVoice']")
    public SelenideElement voiceSearch;

    @FindBy(xpath = ".//input[@type='search']")
    public SelenideElement searchInput;

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clearSearchField(){
        clearSearch.click();
    }

    public void clickVoiceSearchButton(){
        voiceSearch.click();
    }

    public void fillInSearchValue(String itemName){
        searchInput.click();
        searchInput.sendKeys(itemName);
        clickSearchButton();
    }


}
