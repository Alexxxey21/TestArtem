import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Алексей on 03.03.2019.
 */
public class OlxElements extends DriverConfiguration{

    private WebDriver driver;

    public OlxElements(WebDriver driver) {
        this.driver = driver;
    }

//    @Override
//    public void getDriver(WebDriver driver) {
//        super.getDriver(driver);
//    }

    WebElement poisk = driver.findElement(By.id("//*[@id='headerSearch']"));
}
