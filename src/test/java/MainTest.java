import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MainTest {
    ChromeDriver chromeDriver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 30);
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

    @Test(priority = 4)
    public void verifyThatClickingIkhlasButtonOpensTheArchive() {
        WebElement ikhlasElement = chromeDriver.findElement(By.xpath("//div[@data-id='4b8df64']"));
        //clickable?
        wait.until(ExpectedConditions.elementToBeClickable(ikhlasElement));
        ikhlasElement.click();
    }


    @AfterClass
    public void tearDown() {
        chromeDriver.quit();
    }
}
