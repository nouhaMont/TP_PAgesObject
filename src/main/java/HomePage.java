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

    public HomePage searchNintendoSwitch() {
        By InputSearch = By.id("twotabsearchtextbox");
        driver.findElement(InputSearch).sendKeys("Nintendo Switch");
        By btnSearch = By.id("nav-search-submit-button");
        driver.findElement(btnSearch).click();
        return this;
    }

    public HomePage selectFirstArticle() {
        List<WebElement> listArticles = driver.findElements(By.cssSelector(".s-image"));
        listArticles.get(0).click();
        return this;
    }

    public void isTrue() {
        String resultatAttendu = "Nintendo Switch";
        By Article = By.cssSelector("#title");
        WebElement resultat = driver.findElement(Article);
        String resutatReel = resultat.getText();
          Assert.assertTrue(resutatReel.contains(resultatAttendu), "y'a une erreur!!");

    }



}
