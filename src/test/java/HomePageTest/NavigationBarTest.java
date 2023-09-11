package HomePageTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigationBarTest{

    WebDriver driver;
    WebElement logo;
    @BeforeClass
    public void setUp(){
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver=  WebDriverManager.chromedriver().capabilities(options).create();
        driver.get("https://famcare.app/");
    }
    @Test(priority = 1)
    public void logoTest(){
        logo = driver.findElement(By.cssSelector(".navbar-brand > img"));
        Assert.assertTrue(logo.isDisplayed());
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2022/06/logo-ar.svg",logo.getAttribute("src"));
        Assert.assertEquals("فامكير | Famcare",logo.getAttribute("alt"));
    }
    @Test(priority = 7)
    public void famcareMenuItemTest(){
        WebElement famcareItem = driver.findElement(By.cssSelector("#menu-item-6 > .nav-link"));
        Assert.assertTrue(famcareItem.isDisplayed());
        Assert.assertEquals(famcareItem.getText(),"فامكير" );
        Assert.assertEquals(famcareItem.getAttribute("href"),"https://famcare.app/" );
        famcareItem.click();
        Assert.assertEquals("https://famcare.app/", driver.getCurrentUrl());
        driver.navigate().back();
    }
    @Test(priority = 2)
    public void specialistsMenuItemTest(){
        WebElement specialistsItem = driver.findElement(By.cssSelector("#menu-item-1026 > .nav-link"));
        Assert.assertTrue(specialistsItem.isDisplayed());
        Assert.assertEquals(specialistsItem.getText(),"الأخصائيين" );
        Assert.assertEquals(specialistsItem.getAttribute("href"),"https://famcare.app/specialists/" );
        specialistsItem.click();
        Assert.assertEquals("https://famcare.app/specialists/", driver.getCurrentUrl());
        driver.navigate().back();
    }
    @Test(priority = 3)
    public void blogMenuItemTest(){
        WebElement blogItem = driver.findElement(By.xpath("//*[@id=\"menu-item-2633\"]/a"));
        Assert.assertTrue(blogItem.isDisplayed());
        Assert.assertEquals(blogItem.getText(),"المدونة" );
        Assert.assertEquals(blogItem.getAttribute("href"),"https://famcare.app/blog-2/" );
        blogItem.click();
        Assert.assertEquals("https://famcare.app/blog-2/", driver.getCurrentUrl());
        driver.navigate().back();
    }
    @Test(priority = 4)
    public void academyMenuItemTest(){
        WebElement academyItem = driver.findElement(By.cssSelector("#menu-item-1227 > .nav-link"));
        Assert.assertTrue(academyItem.isDisplayed());
        Assert.assertEquals(academyItem.getText(),"الأكاديمية" );
        Assert.assertEquals(academyItem.getAttribute("href"),"https://academy.famcare.app/" );
        academyItem.click();
        Assert.assertEquals("https://academy.famcare.app/", driver.getCurrentUrl());
        driver.navigate().back();
    }
    @Test(priority = 5)
    public void organizationsMenuItemTest(){
        WebElement organizationsItem = driver.findElement(By.cssSelector("#menu-item-187 > .nav-link"));
        Assert.assertTrue(organizationsItem.isDisplayed());
        Assert.assertEquals(organizationsItem.getText(),"المنظمات" );
        Assert.assertEquals(organizationsItem.getAttribute("href"),"https://famcare.app/%d9%81%d8%a7%d9%85%d9%83%d9%8a%d8%b1-%d9%84%d9%84%d9%85%d9%86%d8%b8%d9%85%d8%a7%d8%aa/" );
        organizationsItem.click();
        Assert.assertEquals("https://famcare.app/%d9%81%d8%a7%d9%85%d9%83%d9%8a%d8%b1-%d9%84%d9%84%d9%85%d9%86%d8%b8%d9%85%d8%a7%d8%aa/", driver.getCurrentUrl());
        driver.navigate().back();
    }
    @Test(priority = 6)
    public void aboutUsMenuItemTest(){
        WebElement aboutUsItem = driver.findElement(By.cssSelector("#menu-item-188 > .nav-link"));
        Assert.assertTrue(aboutUsItem.isDisplayed());
        Assert.assertEquals(aboutUsItem.getText(),"من نحن" );
        Assert.assertEquals(aboutUsItem.getAttribute("href"),"https://famcare.app/%d9%85%d9%86-%d9%86%d8%ad%d9%86/" );
        aboutUsItem.click();
        Assert.assertEquals("https://famcare.app/%d9%85%d9%86-%d9%86%d8%ad%d9%86/", driver.getCurrentUrl());
        driver.navigate().back();
    }
    @Test(priority = 8)
    public void joinAsSpecialistButton(){
        WebElement joinAsSpecialistButton = driver.findElement(By.cssSelector("#navbarContent > .btn"));
        Assert.assertTrue(joinAsSpecialistButton.isDisplayed());
        Assert.assertEquals(joinAsSpecialistButton.getText(),"انضم كأخصائي" );
        joinAsSpecialistButton.click();
        WebElement joinAsSpecialistForm= driver.findElement(By.cssSelector("#joinUsModal > .modal-dialog > .modal-content"));
        Assert.assertTrue(joinAsSpecialistForm.isDisplayed());
        WebElement joinAsSpecialistFormClose= driver.findElement(By.cssSelector("#joinUsModal > .modal-dialog > .modal-content > .close > span"));
        joinAsSpecialistFormClose.click();
    }

}