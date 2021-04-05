package FoxtrotTesting;

import com.codeborne.selenide.Selenide;
import com.foxtrot.entities.PhoneEntity;
import com.foxtrot.pages.BasePage;
import com.foxtrot.pages.BasketPage;
import com.foxtrot.pages.SmartPhonesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyPhoneTest extends BaseTest{

    @Test
    public void buyPhoneUsingSearch(){
       String phoneName = "Смартфон Samsung Galaxy A71 6/128GB Dual SIM Black (SM-A715FZKUSEK)";
        BasePage basePage = Selenide.page(BasePage.class);
        SmartPhonesPage smartPhonesPage = Selenide.page(SmartPhonesPage.class);
        PhoneEntity phoneEntity = Selenide.page(PhoneEntity.class);

        basePage.headerSearch.fillInSearchValue(phoneName);
        smartPhonesPage.goToPhoneEntity();
        phoneEntity.buyPhoneMain();
        smartPhonesPage.headerBasket.clickCheckOutButton(); //problem with xpath!!!
        basketPage = new BasketPage();

        Assert.assertEquals(phoneName, basketPage.getTitleOfItem());
    }
}
