import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Алексей on 03.03.2019.
 */
public class OlxFunctions extends DriverConfiguration{

    private WebDriver driver;

    public OlxFunctions(WebDriver driver) {
        this.driver = driver;
    }

//    @Override
//    public void getDriver(WebDriver driver){
//        super.getDriver(driver);
//    }

    public void clickPoisk(WebElement element){
        element.click();
    }

}
