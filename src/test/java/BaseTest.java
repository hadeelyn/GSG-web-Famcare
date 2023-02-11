import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest{
    ChromeDriver chromeDriver;
    public static WebDriverWait wait;

    public ChromeDriver setUp(String url) {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        wait = new WebDriverWait(chromeDriver, 60);
        chromeDriver.get(url);
        return chromeDriver;
    }



    public void tearDown() {
        chromeDriver.quit();
    }
}
