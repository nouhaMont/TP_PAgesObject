import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NintendoPage {
    WebDriver driver;

    public NintendoPage (WebDriver driver) {
        this.driver = driver;
    }

    public boolean  isArticleExist( ) {
        By Article = By.cssSelector("#title");
        WebElement resultat = driver.findElement(Article);
        return resultat.isDisplayed();


    }



}
