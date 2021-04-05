package FoxtrotTesting;

import com.foxtrot.entities.PhoneEntity;
import com.foxtrot.pages.BasketPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public BasketPage basketPage;
    public PhoneEntity phoneEntity;

    @BeforeClass
    public void setUp(){
        open("https://www.foxtrot.com.ua/");
    }

    public void addItemsToChart(){
        open("https://www.foxtrot.com.ua/ru/shop/mobilnye_telefony_smartfon.html");
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }
}
