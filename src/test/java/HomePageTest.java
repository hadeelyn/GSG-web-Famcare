import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest {
    ChromeDriver chromeDriver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 60);
        chromeDriver.get("https://famcare.app");
    }


    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        WebElement heroSection = chromeDriver.findElement(By.id("heroSection"));
        assertTrue(heroSection.isDisplayed());
    }

    @Test (priority = 2)
    public void verifyThatAcademyButtonIsDisplayed() {
        WebElement academyButton = chromeDriver.findElement(By.xpath("//a[@title='الأكاديمية']"));
        assertTrue(academyButton.isDisplayed());
    }

    @Test(priority = 3)
    public void verifyThatClickingAcademyButtonOpensTheAcademy() {
        WebElement academyButton = chromeDriver.findElement(By.xpath("//a[@title='الأكاديمية']"));
        academyButton.click();
        WebElement ikhlasElement = chromeDriver.findElement(By.xpath("//div[@data-id='4b8df64']"));
        assertTrue(ikhlasElement.isDisplayed());
    }


    @AfterClass
    public void tearDown() {
        chromeDriver.quit();
    }
}
