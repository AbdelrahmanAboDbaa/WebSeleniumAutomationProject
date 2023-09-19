package HomePageTest;


import WebsitePagesElements.HomePageElements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static HomePageTest.SetUpDriver.driver;

import static HomePageTest.SetUpDriver.wait;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class HeroSectionTest {


    @Test(priority = 1)
    public void verifyThatHeroSectionIsDisplayed() {
        assertTrue(HomePageElements.getTopNavbar().isDisplayed());
    }

    // Hero Section Image Test Methods
    @Test(priority = 1)
    public void verifyThatHeroSectionImageIsDisplayed() {
        Assert.assertTrue(HomePageElements.getHeroSectionImage().isDisplayed());
    }
    @Test(priority = 2)
    public void verifyHeroSectionImageSrcIsCorrect() {
        Assert.assertEquals("https://famcare.app/wp-content/uploads/2022/06/shutterstock_1989703088-1-1024x493.png",HomePageElements.getHeroSectionImage().getAttribute("src"));
    }
    @Test(priority = 3)
    public void verifyHeroSectionImageAltIsCorrect() {
        Assert.assertEquals("تطبيق فامكير للاستشارات النفسية",HomePageElements.getHeroSectionImage().getAttribute("alt"));
    }

    // Hero Section Head Title Test Methods
    @Test(priority = 4)
    public void verifyThatHeroSectionHeadTitleIsDisplayed(){
        Assert.assertTrue(HomePageElements.getHeroSectionHead().isDisplayed());
    }
    @Test(priority = 5)
    public void verifyHeroSectionHeadTitleTextIsCorrect(){
        Assert.assertEquals(HomePageElements.getHeroSectionHead().getText(),"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%" );
    }

    // Hero Section Paragraph Test Methods
    @Test(priority = 6)
    public void verifyThatHeroSectionParagraphIsDisplayed(){
        Assert.assertTrue(HomePageElements.getHeroSectionParagraph().isDisplayed());
    }
    @Test(priority = 7)
    public void verifyHeroSectionParagraphTextIsCorrect(){
        Assert.assertEquals(HomePageElements.getHeroSectionParagraph().getText(),"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن " );
    }

    // Hero Section Paragraph Test Methods
    @Test(priority = 8)
    public void verifyThatBookFirstSessionButtonIsDisplayed() {
        Assert.assertTrue(HomePageElements.getBookFirstSessionButton().isDisplayed());
    }
    @Test(priority = 9)
    public void verifyThatBookFirstSessionButtonTextIsCorrect() {
        Assert.assertEquals(HomePageElements.getBookFirstSessionButton().getText(),"احجز جلستك الأولى" );
    }
    @Test(priority = 10)
    public void verifyBookFirstSessionButtonHrefIsCorrect(){
        assertEquals(HomePageElements.getBookFirstSessionButton().getAttribute("href"),"https://famcare.onelink.me/v4gj/9zbejndb" );
    }
    @Test(priority = 11)
    public void verifyClickingBookFirstSessionButtonOpensAppStore(){
        wait.until(ExpectedConditions.elementToBeClickable(HomePageElements.getBookFirstSessionButton()));
        HomePageElements.getBookFirstSessionButton().click();
        assertEquals(driver.getCurrentUrl(),"https://apps.apple.com/SA/app/id1517781498?mt=8" );
        //methode display of booking first session button
    }
    @Test(priority = 12)
    public void verifyBackFromAppStorePageToHomePage() {
        SetUpDriver.driver.navigate().back();
        assertEquals(driver.getCurrentUrl(),"https://famcare.app/");
    }
}



