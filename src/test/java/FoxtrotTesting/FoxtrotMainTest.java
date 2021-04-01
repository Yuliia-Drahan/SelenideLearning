package FoxtrotTesting;

import com.codeborne.selenide.Selenide;
import com.foxtrot.pages.FoxtrotMainPage;
import com.foxtrot.pages.SmartPhonesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FoxtrotMainTest extends BaseTest {

    @Test(priority = 0)
    public void openMenuBarTest(){
        FoxtrotMainPage page1 = Selenide.page(FoxtrotMainPage.class);
        Assert.assertTrue(page1.checkPhoneMenuDisplayed());
    }

    @Test(priority = 1)
    public void openListOfSmartPhones() {
        FoxtrotMainPage page1 = Selenide.page(FoxtrotMainPage.class);
        SmartPhonesPage page2 = Selenide.page(SmartPhonesPage.class);
        page1.clickSmartPhones();
        Assert.assertEquals("Смартфоны", page2.getHeadingText());
    }

}

