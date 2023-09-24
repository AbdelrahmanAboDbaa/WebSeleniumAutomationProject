package WebsitePagesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static HomePageTest.SetUpDriver.driver;

public class AcademyPageElements {
    public static WebElement getHeroSectionTitle(){
        return driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div[2]/div/div/section[1]/div/div/div/div/div/h1"));
    }
    public static WebElement getRegistrationButton (){
        return driver.findElement(By.className("join_link"));
    }
    public static WebElement getRegistrationHeroSection (){
        return driver.findElement(By.className("page-header_wrapper"));
    }
    public static WebElement getRegistrationHeroSectionTitle (){
        return driver.findElement(By.className("page-header_title"));
    }
    public static WebElement getRegistrationForm(){
        return driver.findElement(By.cssSelector(".u-column2 > .woocommerce-form"));
    }
    public static WebElement getRegistrationFormTitle(){
        return driver.findElement(By.cssSelector(".u-column2 > h2"));
    }
    public static WebElement getRegFirstNameFiled(){
        return driver.findElement(By.id("reg_billing_first_name"));
    }
    public static WebElement getRegLastNameFiled(){
        return driver.findElement(By.id("reg_billing_last_name"));
    }
    public static WebElement getRegUserNameFiled(){
        return driver.findElement(By.id("reg_username"));
    }
    public static WebElement getRegEmailFiled(){
        return driver.findElement(By.id("reg_email"));
    }
    public static WebElement getRegPasswordFiled(){
        return driver.findElement(By.id("reg_password"));
    }
    public static WebElement getMailchimpNewsletterCheckbox(){
        return driver.findElement(By.id("mailchimp_woocommerce_newsletter"));
    }
    public static WebElement getRegButtonSubmit(){
        return driver.findElement(By.className("woocommerce-Button"));
    }
    public static WebElement getRegOutputMessage(){
        return driver.findElement(By.cssSelector(".woocommerce-error li"));
    }




    public static WebElement getLoginForm(){
        return driver.findElement(By.cssSelector(".u-column1 > .woocommerce-form"));
    }
    public static WebElement getLoginFormTitle(){
        return driver.findElement(By.cssSelector(".u-column1 > h2"));
    }
    public static WebElement getLoginUserNameFiled(){
        return driver.findElement(By.id("username"));
    }
    public static WebElement getLoginPasswordFiled(){
        return driver.findElement(By.id("password"));
    }
    public static WebElement getRememberMeCheckbox(){
        return driver.findElement(By.id("rememberme"));
    }
    public static WebElement getLoginButtonSubmit(){
        return driver.findElement(By.className("woocommerce-form-login__submit"));
    }
    public static WebElement getProfileEdit(){
        return driver.findElement(By.className("ld-profile-edit-link"));
    }
    public static WebElement getLoginOutputMessage(){
        return driver.findElement(By.cssSelector(".woocommerce-error li"));
    }
    public static WebElement getHeaderCourseNavbarItem(){
        return driver.findElement(By.xpath("//*[@id=\"menu-item-16269\"]/a/span/span"));
    }
    public static WebElement getTitleHeroSectionCoursePage(){
        return driver.findElement(By.className("page-header_title"));
    }
    public static WebElement getHeaderSearchButton(){
        return driver.findElement(By.className("header_search-button"));
    }
    public static WebElement getSearchFiled(){
        return driver.findElement(By.cssSelector(".search-form > .search-field"));
    }
    public static WebElement getSearchResultHeader(){
        return driver.findElement(By.className("searсh-header"));
    }
    public static WebElement getSearchResultHeaderTitle(){
        return driver.findElement(By.cssSelector(".searсh-header .page-title"));
    }

}
