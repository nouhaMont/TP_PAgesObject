import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
     By InputSearch = By.id("twotabsearchtextbox");

    public ListArticleNintendo searchNintendoSwitch(String motCle) {

        driver.findElement(InputSearch).sendKeys(motCle);
        By btnSearch = By.id("nav-search-submit-button");
        driver.findElement(btnSearch).click();
         return new ListArticleNintendo(driver);
    }





}
