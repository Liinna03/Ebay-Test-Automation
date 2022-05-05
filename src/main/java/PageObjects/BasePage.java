package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public final WebDriver driver;
    public WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30), Duration.ofSeconds(5));
    }

    public WebElement waitForElementToAppear(WebElement searchProduct) {
        try {
            return (wait.until(ExpectedConditions.visibilityOfElementLocated((By) searchProduct)));
        } catch (Exception e) {
            e.printStackTrace();
            return searchProduct;
        }
    }

    public boolean checkLoadPage(WebElement element){
        try {
            return element.isDisplayed();
        }catch(Exception e){
            System.out.println("Se encontro el siguiente error" + e);
            return false;
        }
    }
}
