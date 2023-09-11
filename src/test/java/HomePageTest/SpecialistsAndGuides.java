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

public class SpecialistsAndGuides {
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
        WebElement section = driver.findElement(By.cssSelector(".kc-css-616729"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", section);
        return new WebDriverWait(driver, Duration.ofMillis(5000));
    }
    @Test(priority = 2)
    public void headSectionTest(){
        scrollDownSection();
        WebElement headSection = driver.findElement(By.cssSelector(".kc-css-554197  > .kc_title"));
        Assert.assertTrue(headSection.isDisplayed());
        Assert.assertEquals(headSection.getText(),"نخبة من الأخصائيين والمرشدين" );
    }
    @Test(priority = 3)
    public void imageCard_1_SectionTest(){

        WebDriverWait wait = scrollDownSection();
        WebElement imageSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".swiper-slide-next > .text-center > .position-relative > a > img")));

        Assert.assertTrue(imageSection.isDisplayed());
        Assert.assertEquals("https://famcare-production.s3.eu-central-1.amazonaws.com/4547/image_cropper_E394D08D-B6C0-4B03-B90A-4692B7FF805A-1066-000000C9AE87A9A7.jpg",imageSection.getAttribute("src"));
        Assert.assertEquals("د. عطالله العبار",imageSection.getAttribute("alt"));
    }
    @Test(priority = 4)
    public void specialistNameCard_1_Test(){

        WebDriverWait wait = scrollDownSection();

        WebElement specialistName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".swiper-slide-next > .text-center > .mt-3 > a")));

        Assert.assertTrue(specialistName.isDisplayed());
        Assert.assertEquals(specialistName.getText(), "د. عطالله العبار" );
        Assert.assertEquals(specialistName.getAttribute("href"),"https://famcare.app/?author=270&specialist_id=1392" );
    }
    @Test(priority = 5)
    public void specialityCard_1_Test(){

        WebDriverWait wait = scrollDownSection();

        WebElement speciality = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".swiper-slide-next > .text-center > .speciality > a")));

        Assert.assertTrue(speciality.isDisplayed());
        Assert.assertEquals(speciality.getText(), "      أخصائي نفسي    " );
        Assert.assertEquals(speciality.getAttribute("href"),"https://famcare.app/?author=270&specialist_id=1392" );
    }
}
