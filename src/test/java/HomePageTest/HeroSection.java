package HomePageTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HeroSection {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver=  WebDriverManager.chromedriver().capabilities(options).create();
        driver.get("https://famcare.app/");
    }
    @Test(priority = 1)
    public void imageSectionTest(){
        WebElement imageSection = driver.findElement(By.cssSelector(".kc-css-107922 > img"));
        Assert.assertTrue(imageSection.isDisplayed());
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2022/06/shutterstock_1989703088-1-1024x493.png",imageSection.getAttribute("src"));
        Assert.assertEquals("تطبيق فامكير للاستشارات النفسية",imageSection.getAttribute("alt"));
    }
    @Test(priority = 2)
    public void headSectionTest(){
        WebElement headSection = driver.findElement(By.cssSelector(".kc-css-964511 > .kc_title"));
        Assert.assertTrue(headSection.isDisplayed());
        Assert.assertEquals(headSection.getText(),"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%" );
    }
    @Test(priority = 3)
    public void paragraphSectionTest(){
        WebElement paragraphSection = driver.findElement(By.cssSelector(".kc-css-912794 > p"));
        Assert.assertTrue(paragraphSection.isDisplayed());
        Assert.assertEquals(paragraphSection.getText(),"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن " );
    }

    @Test(priority = 4)
    public void buttonSectionTest(){
        WebElement buttonSection = driver.findElement(By.cssSelector(".kc-css-780143 > .kc_button"));
        Assert.assertTrue(buttonSection.isDisplayed());
        Assert.assertEquals(buttonSection.getText(),"احجز جلستك الأولى" );
    }




}
