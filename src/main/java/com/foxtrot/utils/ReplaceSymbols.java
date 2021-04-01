package com.foxtrot.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ReplaceSymbols {

    public String formatPriceSpace(String price) {
        price = price.replace(" ", "");
        return price;
    }

    public String formatPriceSymbols(String price) {
        price = price.replace("₴", "");
        return price;
    }

    public Integer formatPriceToInt(String price){
        int intPrice = Integer.parseInt(price);
        return intPrice;
    }
}
