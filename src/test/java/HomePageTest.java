import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest{
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://famcare.app");
    }

    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        WebElement heroSection = driver.findElement(By.id("heroSection"));
        assertTrue(heroSection.isDisplayed());
    }

    @Test (priority = 2)
    public void verifyThatAcademyButtonIsDisplayed() {
        WebElement academyButton = driver.findElement(By.xpath("//a[@title='الأكاديمية']"));
        assertTrue(academyButton.isDisplayed());
    }

    @Test(priority = 3)
    public void verifyThatClickingAcademyButtonOpensTheAcademy() {
        WebElement academyButton = driver.findElement(By.xpath("//a[@title='الأكاديمية']"));
        academyButton.click();
        WebElement ikhlasElement = driver.findElement(By.xpath("//div[@data-id='4b8df64']"));
        assertTrue(ikhlasElement.isDisplayed());
    }
    @AfterClass
    public void tearDown(){
        baseTest.tearDown();
    }
}
