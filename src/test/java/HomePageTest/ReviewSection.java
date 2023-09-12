package HomePageTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ReviewSection {
    WebDriver driver;
    JavascriptExecutor jse;
    @BeforeClass
    public void setUp(){
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver=  WebDriverManager.chromedriver().capabilities(options).create();
        jse = (JavascriptExecutor) driver;
        driver.get("https://famcare.app/");
    }
    @Test(priority = 1)
    public WebDriverWait scrollDownSection(){
        WebElement section = driver.findElement(By.cssSelector(".kc-css-66359"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", section);
        return new WebDriverWait(driver, Duration.ofMillis(5000));
    }


}
