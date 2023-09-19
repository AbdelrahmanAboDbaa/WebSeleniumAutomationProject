package HomePageTest;


import WebsitePagesElements.HomePageElements;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static HomePageTest.SetUpDriver.driver;
import static org.testng.Assert.assertTrue;

//
public class SpecialistsAndGuidesSectionTest {

    @Test(priority = 1)
    public static void scrollDownSection() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HomePageElements.getSpecialistsAndGuidesSection());
    }

    @Test(priority = 1, description = "verify Specialists And Guides Section Is Displayed")
    public void verifySpecialistsAndGuidesSectionIsDisplayed() {
        assertTrue(HomePageElements.getApprovedOfficialAuthoritiesSection().isDisplayed());
    }


    @Test(priority = 1)
    public void verifyHeadTitleSpecialistsAndGuidesSectionIsDisplayed() {
        Assert.assertTrue(HomePageElements.getHeadSpecialistsAndGuidesSection().isDisplayed());
    }

    @Test(priority = 1)
    public void verifyHeadTitleSpecialistsAndGuidesSectionTextIsCorrect() {
        Assert.assertEquals(HomePageElements.getHeadSpecialistsAndGuidesSection().getText(), "نخبة من الأخصائيين والمرشدين");
    }


    @Test(priority = 2)
    public void contactNowButtonIsDisplayed() {
        Assert.assertTrue(HomePageElements.getContactNowButton().isDisplayed());
    }

    @Test(priority = 3)
    public void contactNowButtonTextIsCorrect() {
        Assert.assertEquals(HomePageElements.getContactNowButton().getText(), "تواصل الآن");
    }
    @Test(priority = 4)
    public void contactNowButtonHrefIsCorrect() {
        Assert.assertEquals(HomePageElements.getContactNowButton().getAttribute("href"), "https://famcare.onelink.me/v4gj/y2wra5uz");
    }

//        contactNowButton.click();
//        Assert.assertEquals("https://famcare.app/specialists/?shortlink=y2wra5uz&c=communicate%20now&pid=website-specialists&deep_link_value=https%3A%2F%2Ffamcare.app%2Fspecialists&source_caller=ui", driver.getCurrentUrl());
//        driver.navigate().back();

}
