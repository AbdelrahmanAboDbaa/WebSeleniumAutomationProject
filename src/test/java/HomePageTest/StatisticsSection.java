package HomePageTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class StatisticsSection {
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
        WebElement section = driver.findElement(By.cssSelector(".kc-css-338666"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", section);
        return new WebDriverWait(driver, Duration.ofMillis(5000));
    }
    @Test(priority = 2)
    public void imageIconRatingTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement iconRating = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-879570 > .lazyloaded")));

        Assert.assertTrue(iconRating.isDisplayed());
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2022/05/Group-8718.svg",iconRating.getAttribute("src"));
        Assert.assertEquals("img",iconRating.getAttribute("alt"));
    }

    @Test(priority = 3)
    public void satisfactionRateTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement satisfactionRate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-862127 > p")));

        Assert.assertTrue(satisfactionRate.isDisplayed());
        Assert.assertEquals(satisfactionRate.getText(),"4.9" );
    }
    @Test(priority = 4)
    public void paragraphRateTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement paragraphRate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-32894 > p")));

        Assert.assertTrue(paragraphRate.isDisplayed());
        Assert.assertEquals(paragraphRate.getText(),"رضا المستفيدين عن جودة الاستشارة" );
    }

    @Test(priority = 5)
    public void imageIconBeneficiariesTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement iconRating = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-500681  > .lazyloaded")));

        Assert.assertTrue(iconRating.isDisplayed());
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2022/05/Group-8720.svg",iconRating.getAttribute("src"));
        Assert.assertEquals("img",iconRating.getAttribute("alt"));
    }

    @Test(priority = 6)
    public void numberOfBeneficiariesTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement numberOfBeneficiaries = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-328768  > p")));

        Assert.assertTrue(numberOfBeneficiaries.isDisplayed());
        Assert.assertEquals(numberOfBeneficiaries.getText(),"+500,000" );
    }
    @Test(priority = 7)
    public void paragraphBeneficiariesTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement paragraphBeneficiaries = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-998675  > p")));

        Assert.assertTrue(paragraphBeneficiaries.isDisplayed());
        Assert.assertEquals(paragraphBeneficiaries.getText(),"مستفيد ومستفيدة" );
    }

    @Test(priority = 8)
    public void imageIconSessionDurationTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement iconSessionDuration = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-288563  > .lazyloaded")));

        Assert.assertTrue(iconSessionDuration.isDisplayed());
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2022/05/Group-87195.svg",iconSessionDuration.getAttribute("src"));
        Assert.assertEquals("img",iconSessionDuration.getAttribute("alt"));
    }

    @Test(priority = 9)
    public void numberOfSessionDuration(){
        WebDriverWait wait = scrollDownSection();
        WebElement numberOfSessionDuration = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-290527   > p")));

        Assert.assertTrue(numberOfSessionDuration.isDisplayed());
        Assert.assertEquals(numberOfSessionDuration.getText(),"+2,000,000" );
    }
    @Test(priority = 10)
    public void paragraphSessionDurationTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement paragraphSessionDuration = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-230656  > p")));

        Assert.assertTrue(paragraphSessionDuration.isDisplayed());
        Assert.assertEquals(paragraphSessionDuration.getText(),"دقيقة من الاستشارات والإرشاد" );
    }
}
