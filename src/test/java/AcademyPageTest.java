import HomePageTest.SetUpDriver;
import HomePageTest.TearDown;
import JsonReader.TestDataLoader;
import WebsitePagesElements.AcademyPageElements;
import WebsitePagesElements.HomePageElements;
import org.json.simple.JSONObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static HomePageTest.SetUpDriver.wait;

public class AcademyPageTest {

    @BeforeTest
    public void setUp() {
        SetUpDriver.setUp();
    }

    @Test(priority = 1)
    public void NavigateToAcademyPage(){
        wait.until(ExpectedConditions.elementToBeClickable( HomePageElements.getAcademyMenuItem()));
        HomePageElements.getAcademyMenuItem().click();
    }
    @Test(priority = 2)
    public void verifyAcademyPageHeroSectionTitleIsDisplayed (){
        wait.until(ExpectedConditions.visibilityOf(AcademyPageElements.getHeroSectionTitle()));
        Assert.assertTrue(AcademyPageElements.getHeroSectionTitle().isDisplayed());
    }
    @Test(priority = 3)
    public void verifyAcademyPageHeroSectionTitleTextIsCorrect (){
        Assert.assertEquals("تصفّح دوراتك حسب احتياجك!",AcademyPageElements.getHeroSectionTitle().getText());
    }
    @Test(priority = 4)
    public void NavigateToRegistrationPage(){
        wait.until(ExpectedConditions.elementToBeClickable( AcademyPageElements.getRegistrationButton()));
        AcademyPageElements.getRegistrationButton().click();
    }
    @Test(priority = 5)
    public void verifyRegistrationHeroSectionIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getRegistrationHeroSection().isDisplayed());
    }
    @Test(priority = 6)
    public void verifyRegistrationHeroSectionTitleIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getRegistrationHeroSectionTitle().isDisplayed());
    }
    @Test(priority = 7)
    public void verifyRegistrationHeroSectionTitleTextIsCorrect (){
        Assert.assertEquals("حسابي",AcademyPageElements.getRegistrationHeroSectionTitle().getText());
    }
    @Test(priority = 8)
    public void verifyRegistrationFormIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getRegistrationForm().isDisplayed());
    }
    @Test(priority = 9)
    public void verifyRegistrationFormTitleIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getRegistrationFormTitle().isDisplayed());
    }
    @Test(priority = 10)
    public void verifyRegistrationFormTitleTextIsCorrect (){
        Assert.assertEquals("تسجيل جديد",AcademyPageElements.getRegistrationFormTitle().getText());
    }

    @Test(dataProvider = "RegistrationAcademyForm", dataProviderClass = TestDataLoader.class , priority = 11)
    public void testRegistrationAcademyForm(JSONObject testData) {

        wait.until(ExpectedConditions.textToBePresentInElementValue(AcademyPageElements.getRegFirstNameFiled(), ""));

        AcademyPageElements.getRegFirstNameFiled().sendKeys((String) testData.get("firstName"));
        AcademyPageElements.getRegLastNameFiled().sendKeys((String) testData.get("lastName"));
        AcademyPageElements.getRegUserNameFiled().sendKeys((String) testData.get("username"));
        AcademyPageElements.getRegEmailFiled().sendKeys((String) testData.get("email"));
        AcademyPageElements.getRegPasswordFiled().sendKeys((String) testData.get("password"));
        AcademyPageElements.getMailchimpNewsletterCheckbox().click();

        AcademyPageElements.getRegButtonSubmit().click();

        wait.until(ExpectedConditions.visibilityOf(AcademyPageElements.getRegOutputMessage()));
        Assert.assertEquals(AcademyPageElements.getRegOutputMessage().getText(), testData.get("outputMessage"));
    }

    @Test(priority = 12)
    public void verifyLoginFormIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getLoginForm().isDisplayed());
    }
    @Test(priority = 13)
    public void verifyLoginFormTitleIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getLoginFormTitle().isDisplayed());
    }
    @Test(priority = 14)
    public void verifyLoginFormTitleTextIsCorrect (){
        Assert.assertEquals("تسجيل الدخول",AcademyPageElements.getLoginFormTitle().getText());
    }

    @Test(dataProvider = "LoginAcademyForm", dataProviderClass = TestDataLoader.class , priority = 15)
    public void testFailLoginAcademyForm(JSONObject testData) {
        AcademyPageElements.getLoginUserNameFiled().clear();
        wait.until(ExpectedConditions.textToBePresentInElementValue(AcademyPageElements.getLoginUserNameFiled(), ""));

        AcademyPageElements.getLoginUserNameFiled().sendKeys((String) testData.get("username"));
        AcademyPageElements.getLoginPasswordFiled().sendKeys((String) testData.get("password"));
        AcademyPageElements.getRememberMeCheckbox().click();

        AcademyPageElements.getLoginButtonSubmit().click();

        Assert.assertEquals(AcademyPageElements.getLoginOutputMessage().getText(), testData.get("outputMessage"));
    }
    @Test(dataProvider = "SuccessLoginAcademyForm", dataProviderClass = TestDataLoader.class , priority = 16)
    public void testSuccessLoginAcademyForm(String username , String password) {
        AcademyPageElements.getLoginUserNameFiled().clear();
        wait.until(ExpectedConditions.textToBePresentInElementValue(AcademyPageElements.getLoginUserNameFiled(), ""));

        AcademyPageElements.getLoginUserNameFiled().sendKeys(username);
        AcademyPageElements.getLoginPasswordFiled().sendKeys(password);
        AcademyPageElements.getRememberMeCheckbox().click();

        AcademyPageElements.getLoginButtonSubmit().click();
        Assert.assertTrue(AcademyPageElements.getProfileEdit().isDisplayed());

    }



    @Test(priority = 17)
    public void verifyCoursesNavbarItemIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getHeaderCourseNavbarItem().isDisplayed());
    }
    @Test(priority = 18)
    public void clickingCoursesNavbarItemOpenCoursesPage (){
        AcademyPageElements.getHeaderCourseNavbarItem().click();
        Assert.assertTrue(AcademyPageElements.getHeaderCourseNavbarItem().isDisplayed());
    }
    @Test(priority = 19)
    public void verifyTitleHeroSectionCoursePageIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getTitleHeroSectionCoursePage().isDisplayed());
    }
    @Test(priority = 20)
    public void verifyTitleHeroSectionCoursePageTextIsCorrect(){
        Assert.assertEquals("الدورات",AcademyPageElements.getTitleHeroSectionCoursePage().getText());
    }

    @Test(priority = 21)
    public void verifyHeaderSearchButtonIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getHeaderSearchButton().isDisplayed());
    }
    @Test(priority = 22)
    public void clickingHeaderSearchButtonDisplaysSearchFiled (){
        AcademyPageElements.getHeaderSearchButton().click();
        wait.until(ExpectedConditions.visibilityOf(AcademyPageElements.getSearchFiled()));
        Assert.assertTrue(AcademyPageElements.getSearchFiled().isDisplayed());
    }

    @Test(priority = 23)
    public void enterValidFormatCourseNameDisplaysAtLeastOne(){
        AcademyPageElements.getSearchFiled().sendKeys("تطوير الذات");
        AcademyPageElements.getSearchFiled().sendKeys(Keys.RETURN);
        Assert.assertTrue(AcademyPageElements.getSearchResultHeader().isDisplayed());
    }
    @Test(priority = 24)
    public void verifyHeaderSearchResultTitleIsDisplayed (){
        Assert.assertTrue(AcademyPageElements.getSearchResultHeaderTitle().isDisplayed());
    }
    @Test(priority = 25)
    public void verifyHeaderSearchResultTitleTextIsCorrect(){
        Assert.assertTrue(AcademyPageElements.getSearchResultHeaderTitle().isDisplayed());
    }

    @AfterTest
    public void TearDown() {
        TearDown.tearDown();
    }
}
