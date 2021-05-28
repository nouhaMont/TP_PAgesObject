import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListArticleNintendo {

    WebDriver driver;
    public ListArticleNintendo (WebDriver driver) {
        this.driver = driver;
    }

    public NintendoPage selectFirstArticle(int index) {
        List<WebElement> listArticles = driver.findElements(By.cssSelector(".s-image"));
        listArticles.get(index).click();
        return new NintendoPage(driver);
    }
}
