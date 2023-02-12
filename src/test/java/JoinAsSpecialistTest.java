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
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(name));
        WebElement mobile= driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[3]/input"));
        WebElement academicDegree= driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[4]/input"));
        WebElement speciality= driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[5]/input"));
        WebElement yearsOfExperience= driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[6]/input"));
        WebElement socialAccount= driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[7]/input"));
        WebElement sendFormButton= driver.findElement(By.xpath("//*[@id='wpcf7-f167-o1']/form/input[2]"));
        WebElement successLabel= driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[8]"));
        name.sendKeys(TestData.NewSpecialistData.name);
        mobile.sendKeys(TestData.NewSpecialistData.mobile);
        academicDegree.sendKeys(TestData.NewSpecialistData.academicDegree);
        speciality.sendKeys(TestData.NewSpecialistData.specialization);
        yearsOfExperience.sendKeys(TestData.NewSpecialistData.yearsOfExperience);
        socialAccount.sendKeys(TestData.NewSpecialistData.socialAccount);
        sendFormButton.click();
        BaseTest.wait.until(ExpectedConditions.visibilityOf(successLabel));
        Assert.assertEquals(successLabel.getText(),TestData.NewSpecialistData.successMessage);
    }

    public void tearDown(){
        baseTest.tearDown();
    }
}
