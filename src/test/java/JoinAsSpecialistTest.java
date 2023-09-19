import HomePageTest.SetUpDriver;
import HomePageTest.TearDown;
import JsonReader.TestDataLoader;
import WebsitePagesElements.HomePageElements;
import WebsitePagesElements.JoinFormElements;
import org.json.simple.JSONObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static HomePageTest.SetUpDriver.wait;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class JoinAsSpecialistTest {
    @BeforeTest
    public void setUp() {
        SetUpDriver.setUp();
    }
    @Test(priority = 1)
    public void verifyJoinAsSpecialistButtonIsDisplayed() {
        Assert.assertTrue(HomePageElements.getJoinAsSpecialistButton().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyClickingJoinAsSpecialistButtonOpensTheForm() {
        HomePageElements.getJoinAsSpecialistButton().click();
        Assert.assertTrue(JoinFormElements.getJoinForm().isDisplayed());
    }
    @Test(priority = 3)
    public void verifyTitleJoinAsSpecialistFormIsDisplayed() {
        Assert.assertTrue(JoinFormElements.getHeadForm().isDisplayed());
    }
    @Test(priority = 4)
    public void verifyTitleJoinAsSpecialistFormTextIsCorrect() {
        assertEquals(JoinFormElements.getHeadForm().getText(),"الرجاء إدخال المعلومات لنقوم بالتواصل معكم" );
    }
    @Test(priority = 5)
    public void verifyFullNameFiledIsDisplayed() {
        Assert.assertTrue(JoinFormElements.getNameField().isDisplayed());
    }
    @Test(priority = 6)
    public void verifyFullNameFiledPlaceholderIsCorrect() {
        Assert.assertEquals("الإسم الثلاثي",JoinFormElements.getNameField().getAttribute("placeholder"));
    }
    @Test(priority = 5)
    public void verifyMobileNumberFiledIsDisplayed() {
        Assert.assertTrue(JoinFormElements.getMobileField().isDisplayed());
    }
    @Test(priority = 6)
    public void verifyMobileNumberFieldPlaceholderIsCorrect() {
        Assert.assertEquals("الجوال",JoinFormElements.getMobileField().getAttribute("placeholder"));
    }

    @Test(priority = 7)
    public void verifyAcademicDegreeFieldIsDisplayed() {
        Assert.assertTrue(JoinFormElements.getAcademicDegreeField().isDisplayed());
    }
    @Test(priority = 8)
    public void verifyAcademicDegreeFieldPlaceholderIsCorrect() {
        Assert.assertEquals("الدرجة العلمية",JoinFormElements.getAcademicDegreeField().getAttribute("placeholder"));
    }
    @Test(priority = 9)
    public void verifyAcademicSpecialityFieldIsDisplayed() {
        Assert.assertTrue(JoinFormElements.getSpecialityField().isDisplayed());
    }
    @Test(priority = 10)
    public void verifyAcademicSpecialityFieldPlaceholderIsCorrect() {
        Assert.assertEquals("التخصص العلمي",JoinFormElements.getSpecialityField().getAttribute("placeholder"));
    }
    @Test(priority = 11)
    public void verifyYearsOfExperienceFieldIsDisplayed() {
        Assert.assertTrue(JoinFormElements.getYearsOfExperienceField().isDisplayed());
    }
    @Test(priority = 12)
    public void verifyYearsOfExperienceFieldPlaceholderIsCorrect() {
        Assert.assertEquals("عدد سنوات الخبرة في مجال الاستشارات؟",JoinFormElements.getYearsOfExperienceField().getAttribute("placeholder"));
    }
    @Test(priority = 13)
    public void verifySocialMediaAccountFieldIsDisplayed() {
        Assert.assertTrue(JoinFormElements.getSocialMediaAccountField().isDisplayed());
    }
    @Test(priority = 14)
    public void verifySocialMediaAccountFieldPlaceholderIsCorrect() {
        Assert.assertEquals("هل لديك نشاط فعال في منصات التواصل الاجتماعي",JoinFormElements.getSocialMediaAccountField().getAttribute("placeholder"));
    }


    @Test(priority = 15)
    public void verifySendFormButtonFormIsDisplayed() {
        Assert.assertTrue(JoinFormElements.getSendFormButton().isDisplayed());
    }
    @Test(priority = 16)
    public void verifySendFormButtonTextIsCorrect() {
        Assert.assertEquals("إرسال",JoinFormElements.getSendFormButton().getAttribute("value"));
    }


    @Test(dataProvider = "JoinAsSpecialistFormData", dataProviderClass = TestDataLoader.class , priority = 17)
    public void testJoinAsSpecialist(JSONObject testData) {

        wait.until(ExpectedConditions.textToBePresentInElementValue(JoinFormElements.getNameField(), ""));

        JoinFormElements.getNameField().sendKeys((String) testData.get("fullName"));
        JoinFormElements.getMobileField().sendKeys((String) testData.get("mobile"));
        JoinFormElements.getAcademicDegreeField().sendKeys((String) testData.get("degree"));
        JoinFormElements.getSpecialityField().sendKeys((String) testData.get("specialization"));
        JoinFormElements.getYearsOfExperienceField().sendKeys((String) testData.get("yearsOfExperience"));
        JoinFormElements.getSocialMediaAccountField().sendKeys((String) testData.get("socialAccount"));

        JoinFormElements.getSendFormButton().click();

        wait.until(ExpectedConditions.visibilityOf(JoinFormElements.getSuccessMessage()));
        Assert.assertEquals(JoinFormElements.getSuccessMessage().getText(), "شكراً لك. لقد تم الإرسال بنجاح.");
    }
    @Test(priority = 18)
    public void ClickingJoinAsSpecialistFormCloseHiddenEnterInformationForm() {
        HomePageElements.getJoinAsSpecialistFormClose().click();
        assertFalse(HomePageElements.getJoinAsSpecialistForm().isDisplayed());
    }
    @AfterTest
    public void TearDown() {
        TearDown.tearDown();
    }
}
