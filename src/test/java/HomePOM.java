import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePOM {
    public static WebElement getJoinAsSpecialistButton(){
        return Setup.driver.findElement(By.xpath("//button[@data-target='#joinUsModal']"));
    }

}
