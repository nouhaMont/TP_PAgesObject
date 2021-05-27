import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage {

    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();

        By cookiesSelector = By.id("sp-cc-accept");
        driver.findElement(cookiesSelector).click();
    }


    @Test
    public void testSearchAmazon() {

       HomePage amazonHomePage = new HomePage(driver);
       amazonHomePage.searchNintendoSwitch().selectFirstArticle().isTrue();

    }


    @AfterMethod
    public void tearDown() {
       driver.quit();
    }

}
