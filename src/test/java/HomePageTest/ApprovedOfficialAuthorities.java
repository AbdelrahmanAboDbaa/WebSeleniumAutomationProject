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

public class ApprovedOfficialAuthorities {
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
        WebElement section = driver.findElement(By.cssSelector(".kc-css-16652"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", section);
        return new WebDriverWait(driver, Duration.ofMillis(2000));
    }
    @Test(priority = 2)
    public void headSectionTest(){
        scrollDownSection();
        WebElement headSection = driver.findElement(By.cssSelector(".kc-css-480965 > .kc_title"));
        Assert.assertTrue(headSection.isDisplayed());
        Assert.assertEquals(headSection.getText(),"تطبيق معتمد من الجهات الرسمية" );
    }
    @Test(priority = 3)
    public void imageCard_1_SectionTest(){

        WebDriverWait wait = scrollDownSection();
        WebElement imageSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-373193 > img")));

        Assert.assertTrue(imageSection.isDisplayed());
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2023/06/aa.png",imageSection.getAttribute("src"));
        Assert.assertEquals("img",imageSection.getAttribute("alt"));
    }
    @Test(priority = 4)
    public void headCard_1_Test(){

        WebDriverWait wait = scrollDownSection();

        WebElement headSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-493653 > .kc_title")));

        Assert.assertTrue(headSection.isDisplayed());
        Assert.assertEquals(headSection.getText(),"لوائح حماية البيانات" );
    }

    @Test(priority = 5)
    public void imageCard_2_SectionTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement imageSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-268709 > img")));

        Assert.assertTrue(imageSection.isDisplayed());
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2022/05/شركة-مجتمعية.png",imageSection.getAttribute("src"));
        Assert.assertEquals("img",imageSection.getAttribute("alt"));
    }
    @Test(priority = 6)
    public void headCard_2_Test(){
        WebDriverWait wait = scrollDownSection();
        WebElement headSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-374927 > .kc_title")));

        Assert.assertTrue(headSection.isDisplayed());
        Assert.assertEquals(headSection.getText(),"شركة مجتمعية" );
    }
    @Test(priority = 7)
    public void imageCard_3_SectionTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement imageSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-833582  > img")));

        Assert.assertTrue(imageSection.isDisplayed());
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2022/05/back.png",imageSection.getAttribute("src"));
        Assert.assertEquals("img",imageSection.getAttribute("alt"));
    }
    @Test(priority = 8)
    public void headCard_3_Test(){
        WebDriverWait wait = scrollDownSection();
        WebElement headSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-167776 > .kc_title")));

        Assert.assertTrue(headSection.isDisplayed());
        Assert.assertEquals(headSection.getText(),"مركز ارشاد اسري" );
    }

    @Test(priority = 7)
    public void imageCard_4_SectionTest(){
        WebDriverWait wait = scrollDownSection();
        WebElement imageSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-744171   > img")));

        Assert.assertTrue(imageSection.isDisplayed());
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2022/05/مركز-طب-اتصالي.png",imageSection.getAttribute("src"));
        Assert.assertEquals("img",imageSection.getAttribute("alt"));
    }
    @Test(priority = 8)
    public void headCard_4_Test(){
        WebDriverWait wait = scrollDownSection();
        WebElement headSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".kc-css-485816  > .kc_title")));

        Assert.assertTrue(headSection.isDisplayed());
        Assert.assertEquals(headSection.getText(),"مركز طب اتصالي" );
    }


}
