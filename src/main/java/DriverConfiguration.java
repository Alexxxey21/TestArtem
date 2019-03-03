/**
 * Created by Алексей on 03.03.2019.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverConfiguration {

    public WebDriver driver;
    private WebDriverWait wait;

    public void getDriver(WebDriver driver){
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
        this.driver = driver;
    }

    public void waitUntill(WebDriver driver){
        this.wait = new WebDriverWait(driver, 30);
    }
}
