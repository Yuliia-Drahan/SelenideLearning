package FoxtrotTesting;

import com.codeborne.selenide.Selenide;
import com.foxtrot.pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SmartPhonesTest extends BaseTest {

    @BeforeClass
    public void beforeGroup(){
        addItemsToChart();
    }

    @Test (groups = "phones")
    public void addItemsToBasket() {
        BasePage page = Selenide.page(BasePage.class);
        page.headerBasket.itemsInBasket();
        int result = page.headerBasket.checkItemsInBasket();
        Assert.assertEquals(result, 1);
    }

    @Test(groups = "phones") //?????????????????????????????????? xpath для пейджі
    public void goToCheckOut() {
        BasePage page = Selenide.page(BasePage.class);
        page.headerBasket.clickCheckOutButton();
        Assert.assertEquals("Оформление заказа", basketPage.getHeadingText());
    }

}
