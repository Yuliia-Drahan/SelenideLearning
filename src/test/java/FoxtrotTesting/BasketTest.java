package FoxtrotTesting;

import com.foxtrot.pages.BasketPage;
import com.foxtrot.pages.SmartPhonesPage;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BasketTest extends BaseTest {
    private SmartPhonesPage smartPhonesPage;
    private BasketPage basketPage;

    @BeforeMethod
    public void setUp() {
        open("https://www.foxtrot.com.ua/ru/shop/mobilnye_telefony_smartfon.html");
        smartPhonesPage = new SmartPhonesPage();
   //     smartPhonesPage.clickBasketIcon();
  //      smartPhonesPage.clickCheckOutButton();
  //      $x("//div[@class='smooth-scroll checkoutlist']").waitUntil(Condition.visible,2000);
    }

  //  @Test
    //public void comparePrices() {
   //     $x("//div[@class='smooth-scroll checkoutlist']").waitUntil(Condition.visible,2000);
    //    int priceSamsung = basketPage.getIntegerPriceOfPhone("Смартфон SAMSUNG SM-A315F Galaxy A31 4/64 Duos Prism Crush Black (SM-A315FZKUSEK)");
   //     System.out.println(priceSamsung);
    //    int priceIphone = basketPage.getIntegerPriceOfPhone("Смартфон APPLE iPhone 12 64GB Black (MGJ53FS/A)");
    //    int priceXiomi = basketPage.getIntegerPriceOfPhone("Смартфон XIAOMI Mi 10T 6/128GB Cosmic Black");
   //     int finalPrice = basketPage.getFinalPrice();
    //    int sum = priceIphone + priceSamsung + priceXiomi;
     //   Assert.assertEquals(finalPrice,49197);
   // }

}
