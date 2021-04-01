package FoxtrotTesting;

import com.codeborne.selenide.Selenide;
import com.foxtrot.entities.PhoneEntity;
import com.foxtrot.pages.BasePage;
import com.foxtrot.pages.BasketPage;
import com.foxtrot.pages.FoxtrotMainPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public FoxtrotMainPage foxtrotMainPage;
    public BasketPage basketPage;
    public PhoneEntity phoneEntity;

    @BeforeClass
    public void setUp(){
        open("https://www.foxtrot.com.ua/");
    }

    public void addItemsToChart(){
        open("https://www.foxtrot.com.ua/ru/shop/mobilnye_telefony_smartfon.html");
        BasePage page = Selenide.page(BasePage.class);
      //  page.smartPhonesPage.clickBuyPhone();
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }
}
