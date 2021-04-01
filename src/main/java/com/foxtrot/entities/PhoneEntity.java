package com.foxtrot.entities;

import com.foxtrot.pages.BasketPage;

import static com.codeborne.selenide.Selenide.$x;

public class PhoneEntity {


    private String buyPhone = "//div[@class='button buy-button product-box__main-buy__button product-buy-button' and @data-product-title='%s']";

    public BasketPage buyPhone(String buyPhoneTitle){
        $x(String.format(buyPhone,buyPhoneTitle)).click();
        return new BasketPage();
    }
}

