import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AcademyPageTest{
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://academy.famcare.app");
    }

    @Test
    public void verifyThatClickingIkhlasButtonOpensTheArchive() {
        WebElement ikhlasElement = driver.findElement(By.xpath("//div[@data-id='4b8df64']"));
        //clickable?
//        wait.until(ExpectedConditions.elementToBeClickable(ikhlasElement));
        ikhlasElement.click();
    }

    @AfterClass
    public void tearDown(){
        baseTest.tearDown();
    }

}
