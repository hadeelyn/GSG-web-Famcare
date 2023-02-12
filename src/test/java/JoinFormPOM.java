import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JoinFormPOM {

    public static WebElement getJoinForm(){
        return Setup.driver.findElement(By.id("joinUsModal"));
    }
    public static WebElement getNameField(){
      return  Setup.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[2]/input"));
    }

    public static WebElement getMobileField(){
      return  Setup.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[3]/input"));
    }

    public static WebElement getAcademicDegreeField(){
      return  Setup.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[4]/input"));
    }

    public static WebElement getSpecialityField(){
      return  Setup.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[5]/input"));
    }

    public static WebElement getYearsOfExperienceField(){
      return  Setup.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[6]/input"));
    }
    public static WebElement getSocialAccountField(){
      return  Setup.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[7]/input"));
    }

    public static WebElement getSendFormButtontField(){
      return  Setup.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/input"));
    }
    public static WebElement getSuccessLabel(){
      return  Setup.driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[8]"));
    }

}
