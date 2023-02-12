import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest{
    Setup baseTest= new Setup();


    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        WebElement heroSection = Setup.driver.findElement(By.id("heroSection"));
        assertTrue(heroSection.isDisplayed());
    }

    @Test (priority = 2)
    public void verifyThatAcademyButtonIsDisplayed() {
        WebElement academyButton = Setup.driver.findElement(By.xpath("//a[@title='الأكاديمية']"));
        assertTrue(academyButton.isDisplayed());
    }

    @Test(priority = 3, enabled = false)
    public void verifyThatClickingAcademyButtonOpensTheAcademy() {
        WebElement academyButton = Setup.driver.findElement(By.xpath("//a[@title='الأكاديمية']"));
        academyButton.click();
        WebElement ikhlasElement = Setup.driver.findElement(By.xpath("//div[@data-id='4b8df64']"));
        assertTrue(ikhlasElement.isDisplayed());
    }

}
