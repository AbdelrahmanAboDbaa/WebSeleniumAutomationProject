package WebsitePagesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static HomePageTest.SetUpDriver.driver;


public class SpecialistsPageElements {
    public static WebElement getHeroSection (){
        return driver.findElement(By.className("col-12"));
    }
    public static WebElement getHeadTitleHeroSection (){
        return driver.findElement(By.className("mt-5"));
    }
    public static WebElement getParagraphHeroSection (){
        return driver.findElement(By.cssSelector(".col-12 > .mb-4"));
    }
    public static WebElement getSearchFiled (){
        return driver.findElement(By.className("search-text"));
    }
    public static WebElement getSpecialistCard (){
        return driver.findElement(By.className("specialist-profile"));
    }
    public static WebElement getSpecialistNameOnCard (){
        return driver.findElement(By.cssSelector(".text-center > .mt-3 > a"));
    }
}
