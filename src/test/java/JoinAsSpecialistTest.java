import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JoinAsSpecialistTest{
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    @BeforeClass
    public void setUp(){
      driver=  baseTest.setUp("https://famcare.app");
    }



    @Test(priority = 1)
    public void verifyJoinAsSpecialistIsDisplayed(){
        WebElement joinAsSpecialistButton= driver.findElement(By.xpath("//button[@data-target='#joinUsModal']"));
        Assert.assertTrue(joinAsSpecialistButton.isDisplayed());
    }

    @Test(priority = 2)
    public void verifyClickingJoinAsSpecialistOpensTheForm(){
        WebElement joinAsSpecialistButton= driver.findElement(By.xpath("//button[@data-target='#joinUsModal']"));
        joinAsSpecialistButton.click();
        WebElement joinUsForm = driver.findElement(By.id("joinUsModal"));
        Assert.assertTrue(joinUsForm.isDisplayed());
    }

    @Test(priority = 3)
    public void verifyClickingJoinAsSpecialistOpensTheFormjhg(){
      WebElement name= driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[2]/input"));
      //BaseTest.wait.until(ExpectedConditions.elementToBeClickable(name));
      name.sendKeys(TestData.name);

    }

    @AfterClass
    public void tearDown(){
        baseTest.tearDown();
    }
}
