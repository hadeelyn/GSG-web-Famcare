import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Setup {
    public static ChromeDriver driver;
    public static WebDriverWait wait;
@Test
    public void setUp() {
    ChromeOptions options= new ChromeOptions();
    options.addArguments("--headless");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
    wait = new WebDriverWait(driver, 60);
    driver.get("https://famcare.app");
    }

}
