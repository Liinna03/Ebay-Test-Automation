package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EbayPage extends BasePage {

    @FindBy(id="gh-logo")
    WebElement idLogo;

    @FindBy(id="gh-ac")
    WebElement searchProduct;

    @FindBy(id="gh-btn")
    WebElement searchButton;


    public EbayPage (WebDriver driver) {
        super(driver);
    }

    public boolean checkLoadEbayPage(){
        boolean loadPage = checkLoadPage(idLogo);
        return loadPage;
    }

    public void searchItem(){
        WebElement searchItem = waitForElementToAppear(searchProduct);
        searchItem.sendKeys("shoes");
    }
    public void clickSearchButton(){
        WebElement clickSearchButton = waitForElementToAppear(searchButton);
        clickSearchButton.click();
    }
}

