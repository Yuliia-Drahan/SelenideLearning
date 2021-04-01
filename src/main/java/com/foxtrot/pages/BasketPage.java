package com.foxtrot.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasketPage extends BasePage{

    private String heading = "//div[@class='checkout__title-main']/span[text()='Оформление заказа']";
    private String priceOfItem = "//div[@data-name='%s']//div[@data-price]";
    private String  finalPrice = "//li[@data-final-price]";
    private SelenideElement finalCheckout = $x("//div[@class='checkout__sidebar-scroll']");
    private SelenideElement titleOfItem = $x("//div[@class='checkout-tovar__title ']");
    public String getHeadingText(){
        return $x(heading).getText();
    }

    public String getTitleOfItem(){
        String title = titleOfItem.getText();
        return title;
    }

 //   public Integer getIntegerPriceOfPhone(String phoneName){
 //       String price = $x(String.format(priceOfItem,phoneName)).innerText();
 //     return intPrice;
  //  }

//    public Integer getFinalPrice(){
 //       String finalNumber = $x(finalPrice).innerText();
   //     int price = formatPrice(finalNumber);
   //     return price;
  //  }

}
