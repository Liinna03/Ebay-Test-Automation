package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(css=".srp-controls__row-2")
    WebElement productPage;

    @FindBy(css=".srp-controls__count-heading > span:nth-of-type(1)")
    WebElement productInventory;

    @FindBy(css="input[aria-label=\"adidas\"]")
    WebElement adidasCheckBox;

    public ProductsPage (WebDriver driver) {
        super(driver);
    }

    public boolean checkLoadProductPage() {
        boolean loadPage = checkLoadPage(productPage);
        return loadPage;
    }

    public void selectAdidasProducts(){
        WebElement checkBox = waitForElementToAppear(adidasCheckBox);
        checkBox.click();
    }

    public boolean getAdidasInventory(){
        WebElement adidasInventory = waitForElementToAppear(productInventory);
        String adidas_inventory = adidasInventory.getText();
        double adidas_inventory1 = Double.parseDouble(adidas_inventory.replace(".", ""));
        if (adidas_inventory1 > 2000){
            return true;
        }
        return false;
    }
}
