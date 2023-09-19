package WebsitePagesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static HomePageTest.SetUpDriver.driver;

public class JoinFormElements {
    public static WebElement getJoinForm(){
        return driver.findElement(By.id("joinUsModal"));
    }
    public static WebElement getHeadForm(){
        return driver.findElement(By.cssSelector(".wpcf7-form > h2"));
    }
    public static WebElement getNameField(){
        return  driver.findElement(By.cssSelector("#wpcf7-f1890-o2 input[name=\"your-name\"]"));
    }

    public static WebElement getMobileField(){
        return  driver.findElement(By.cssSelector("#wpcf7-f1890-o2 input[name=\"your-phone\"]"));
    }

    public static WebElement getAcademicDegreeField(){
        return  driver.findElement(By.cssSelector("#wpcf7-f1890-o2 input[name=\"degree\"]"));
    }

    public static WebElement getSpecialityField(){
        return  driver.findElement(By.cssSelector("#wpcf7-f1890-o2 input[name=\"specialization\"]"));
    }

    public static WebElement getYearsOfExperienceField(){
        return  driver.findElement(By.cssSelector("#wpcf7-f1890-o2 input[name=\"experience\"]"));
    }
    public static WebElement getSocialMediaAccountField(){
        return  driver.findElement(By.cssSelector("#wpcf7-f1890-o2 input[name=\"socialmedia\"]"));
    }

    public static WebElement getSendFormButton(){
        return  driver.findElement(By.cssSelector("#wpcf7-f1890-o2 input[type=\"submit\"]"));
    }
    public static WebElement getSuccessMessage(){
        return driver.findElement(By.xpath("//*[@id='wpcf7-f1890-o2']/form/div[8]"));

       // return  driver.findElement(By.cssSelector("#wpcf7-f1890-o2 .wpcf7-response-output]"));
    }

}
