import PageObjects.EbayPage;
import PageObjects.ProductsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class EbayHomeTests extends BaseTest {

    @Test
    public void homepageTests() {
        EbayPage ebayPage = new EbayPage(getDriver());
        assertTrue(ebayPage.checkLoadEbayPage());
        ebayPage.searchItem();
        ebayPage.clickSearchButton();
        ProductsPage productsPage = new ProductsPage(getDriver());
        assertTrue(productsPage.checkLoadProductPage());
        productsPage.selectAdidasProducts();
        assertTrue(productsPage.getAdidasInventory());
    }
}
