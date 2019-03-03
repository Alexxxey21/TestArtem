import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 03.03.2019.
 */
public class FirstTest extends DriverConfiguration{

//    public WebDriver driver;
//    public OlxElements olxElements;
//    public OlxFunctions olxFunctions;

    public WebDriverWait wait;

    @Before
    public void start() {
        getDriver(driver);
        driver = new ChromeDriver();
//        waitUntill(driver);
//        olxElements = new OlxElements(driver);
//        olxFunctions = new OlxFunctions(driver);
        driver.get("https://www.olx.ua/");
//        driver.manage().window().fullscreen();
        wait = new WebDriverWait(driver, 30);

    }

    @Test
    public void fierstTest(){
        WebElement poisk = driver.findElement(By.id("headerSearch"));
//        poisk.click();
        poisk.sendKeys("Seiko");
        WebElement submit = driver.findElement(By.xpath("//*[@id='submit-searchmain']"));
        submit.click();

        List<WebElement> chasu = driver.findElements(By.xpath("//*[@id='offers_table']/tbody//tr[@class='wrap']"));


        int col = chasu.size();

        for (int i=0; i < chasu.size(); i++){
        }

        System.out.println("Summa " + col);
    }
}
