import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AcademyPageTest{

    @Test
    public void verifyThatClickingIkhlasButtonOpensTheArchive() {
        WebElement ikhlasElement = Setup.driver.findElement(By.xpath("//div[@data-id='4b8df64']"));
        //clickable?
//        wait.until(ExpectedConditions.elementToBeClickable(ikhlasElement));
        ikhlasElement.click();
    }

}
