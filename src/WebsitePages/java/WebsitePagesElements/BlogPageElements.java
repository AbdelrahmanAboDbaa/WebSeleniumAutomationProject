package WebsitePagesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static HomePageTest.SetUpDriver.driver;

public class BlogPageElements {
    public static WebElement getSliderSection(){
        return driver.findElement(By.className("featured-blog"));
    }
    public static WebElement getSliderIndexOne(){
        return driver.findElement(By.cssSelector("[data-swiper-slide-index='0']"));
    }
    public static WebElement getSliderIndexOneDate(){
        return driver.findElement(By.cssSelector("[data-swiper-slide-index='0'] p.date"));
    }
    public static WebElement getSliderIndexOneCategory(){
        return driver.findElement(By.cssSelector("[data-swiper-slide-index='0'] p.category > a"));
    }
    public static WebElement getSliderIndexOneTitle(){
        return driver.findElement(By.cssSelector("[data-swiper-slide-index='0'] .featured-blog__title"));
    }
    public static WebElement getArticleTitle(){
        return driver.findElement(By.cssSelector(".post_title"));
    }
    public static WebElement getSliderIndexOneParagraph(){
        return driver.findElement(By.cssSelector("[data-swiper-slide-index='0'] .featured-blog__excerpt"));
    }
    public static WebElement getBlogPostAuthorImage(){
        return driver.findElement(By.cssSelector("[data-swiper-slide-index='0'] .blog-post__author-image"));
    }
    public static WebElement getBlogPostAuthorNameInPage(){
        return driver.findElement(By.cssSelector(".sticky-top > h1"));
    }
    public static WebElement getBlogPostAuthorName(){
        return driver.findElement(By.cssSelector("[data-swiper-slide-index='0'] .blog-post__author-name>a"));
    }

}
