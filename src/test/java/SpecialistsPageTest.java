import HomePageTest.SetUpDriver;
import HomePageTest.TearDown;
import JsonReader.TestDataLoader;
import WebsitePagesElements.HomePageElements;
import WebsitePagesElements.SpecialistsPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static HomePageTest.SetUpDriver.driver;
import static HomePageTest.SetUpDriver.wait;

public class SpecialistsPageTest {
    @BeforeTest
    public void setUp() {
        SetUpDriver.setUp();
    }
    @Test(priority = 1)
    public static void scrollDownSection() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HomePageElements.getSpecialistsAndGuidesSection());
    }

    @Test(priority = 2)
    public void NavigateToSpecialistsPage(){
        wait.until(ExpectedConditions.elementToBeClickable( HomePageElements.getContactNowButton()));
        HomePageElements.getContactNowButton().click();
    }
    @Test(priority = 3)
    public void verifyContactNowButtonOpensSpecialistsPage (){
        driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(),"https://famcare.app/specialists/?shortlink=y2wra5uz&c=communicate%20now&pid=website-specialists&deep_link_value=https%3A%2F%2Ffamcare.app%2Fspecialists&source_caller=ui");
    }
    @Test(priority = 4)
    public void verifyHeroSectionSpecialistsPageIsDisplayed (){
        Assert.assertTrue(SpecialistsPageElements.getHeroSection().isDisplayed());
    }
    @Test(priority = 5)
    public void verifyHeadTitleHeroSectionIsDisplayed (){
        Assert.assertTrue(SpecialistsPageElements.getHeadTitleHeroSection().isDisplayed());
    }
    @Test(priority = 6)
    public void verifyHeadTitleHeroSectionTextIsCorrect() {
        Assert.assertEquals("أخصائيين فامكير", SpecialistsPageElements.getHeadTitleHeroSection().getText());
    }
    @Test(priority = 7)
    public void verifyParagraphHeroSectionIsDisplayed (){
        Assert.assertTrue(SpecialistsPageElements.getParagraphHeroSection().isDisplayed());
    }
    @Test(priority = 8)
    public void verifyParagraphHeroSectionTextIsCorrect() {
        Assert.assertEquals("اسماء اخصائيين نفسيين  وقائمة من الأخصائيين المعتمدين والمرّخصين معك ولأجلك في متنفّسك ومساحتك الآمنة", SpecialistsPageElements.getParagraphHeroSection().getText());
    }
    @Test(priority = 9)
    public void verifySearchNameFiledDisplayed (){
        Assert.assertTrue(SpecialistsPageElements.getSearchFiled().isDisplayed());
    }
    @Test(priority = 10)
    public void verifySearchNameFiledPlaceholderIsCorrect() {
        Assert.assertEquals("ابحث عن أخصائي من هنا", SpecialistsPageElements.getSearchFiled().getAttribute("placeholder"));
    }

    private void helperMethode(String name){
        SpecialistsPageElements.getSearchFiled().sendKeys(name);
        SpecialistsPageElements.getSearchFiled().sendKeys(Keys.RETURN);
        SpecialistsPageElements.getSearchFiled().clear();
    }

    @Test(dataProvider = "ExistSpecialistNamesToSearch", dataProviderClass = TestDataLoader.class , priority = 11)
    public void verifySearchExistingSpecialistNameDisplaysMatchResult( String name) {
        helperMethode(name);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("specialist-profile")));
        Assert.assertTrue(SpecialistsPageElements.getSpecialistCard().isDisplayed());
        Assert.assertTrue(SpecialistsPageElements.getSpecialistNameOnCard().getText().contains(name));
    }
    @Test(dataProvider = "Non-ExistSpecialistNamesToSearch", dataProviderClass = TestDataLoader.class , priority = 12)
    public void verifySearchNotExistSpecialistNameDoesNotDisplayResult( String name) {
        helperMethode(name);
        Assert.assertTrue(driver.findElements(By.cssSelector(".specialist-profile")).isEmpty());
    }





    @AfterTest
    public void TearDown() {
        TearDown.tearDown();
    }
}
