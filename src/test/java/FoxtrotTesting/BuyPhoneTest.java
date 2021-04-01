package FoxtrotTesting;

import com.codeborne.selenide.Selenide;
import com.foxtrot.entities.PhoneEntity;
import com.foxtrot.pages.BasePage;
import com.foxtrot.pages.SmartPhonesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyPhoneTest extends BaseTest{

    @Test
    public void buyPhoneUsingSearch(){
       String phoneName = "Смартфон Samsung Galaxy A71 6/128GB Dual SIM Black (SM-A715FZKUSEK)";
        BasePage page = Selenide.page(BasePage.class);
        page.headerSearch.fillInSearchValue(phoneName);
        SmartPhonesPage page1 = Selenide.page(SmartPhonesPage.class);
        page1.goToPhoneEntity(); //така ж сама проблема з xpath
        phoneEntity = new PhoneEntity();
        phoneEntity.buyPhone(phoneName);
        page.headerBasket.clickCheckOutButton();
        Assert.assertEquals(phoneName, basketPage.getTitleOfItem());
    }
}
