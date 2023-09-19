import HomePageTest.SetUpDriver;
import WebsitePagesElements.BlogPageElements;
import WebsitePagesElements.HomePageElements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static HomePageTest.SetUpDriver.driver;
import static HomePageTest.SetUpDriver.wait;
import static org.testng.Assert.assertTrue;

public class BlogPageTest {
    @BeforeTest
    public void setUp() {
        SetUpDriver.setUp();
    }
    @Test(priority = 1)
    public void NavigateToBlogPage(){
        wait.until(ExpectedConditions.elementToBeClickable( HomePageElements.getBlogMenuItem()));
        HomePageElements.getBlogMenuItem().click();
    }
    @Test(priority = 2)
    public void verifySliderSectionIsDisplayed (){
        Assert.assertTrue(BlogPageElements.getSliderSection().isDisplayed());
    }
    @Test(priority = 3)
    public void verifySliderIndexOneIsDisplayed (){
        Assert.assertTrue(BlogPageElements.getSliderIndexOne().isDisplayed());
    }
    @Test(priority = 4)
    public void verifySliderIndexOneDateIsDisplayed (){
        Assert.assertTrue(BlogPageElements.getSliderIndexOneDate().isDisplayed());
    }
    @Test(priority = 5)
    public void verifySliderIndexOneDateTextIsCorrect() {
        Assert.assertEquals("10 يوليو 2023", BlogPageElements.getSliderIndexOneDate().getText());
    }
    @Test(priority = 6)
    public void verifySliderIndexOneCategoryIsDisplayed (){
        Assert.assertTrue(BlogPageElements.getSliderIndexOneCategory().isDisplayed());
    }
    @Test(priority = 7)
    public void verifySliderIndexOneCategoryTextIsCorrect() {
        Assert.assertEquals("الصحة النفسية", BlogPageElements.getSliderIndexOneCategory().getText());
    }
    @Test(priority = 8)
    public void verifySliderIndexOneTitleIsDisplayed (){
        Assert.assertTrue(BlogPageElements.getSliderIndexOneTitle().isDisplayed());
    }
    @Test(priority = 9)
    public void verifySliderIndexOneTitleTextIsCorrect() {
        Assert.assertEquals("استكشف مخاطر الاحتراق الوظيفي", BlogPageElements.getSliderIndexOneTitle().getText());
    }
    @Test(priority = 10)
    public void ClickingSliderIndexOneTitleOpenArticlePage() {
        BlogPageElements.getSliderIndexOneTitle().click();
        assertTrue(BlogPageElements.getArticleTitle().isDisplayed());
        driver.navigate().back();
    }
    @Test(priority = 11)
    public void verifySliderIndexOneParagraphTextIsCorrect() {
        Assert.assertEquals("  ماهو الاحتراق الوظيفي ؟ هو ضعف الطاقة الفكرية والجسدية، وبالتالي النفسية تكاد تكون معدومة الراحة والرضا الوظيفي. كيف يأتي الاحتراق؟ يأتي من عدة نوافذ منها مرئية ومنها غير مرئية للموظف. النوافذ المرئية: – عدم توازن البيئة العملية وانعدام الامان والعدل. -عمل الموظف من أجل", BlogPageElements.getSliderIndexOneParagraph().getText());
    }
    @Test(priority = 12)
    public void verifySliderIndexOnePostAuthorImageIsDisplayed (){
        Assert.assertTrue(BlogPageElements.getBlogPostAuthorImage().isDisplayed());
    }
    @Test(priority = 13)
    public void ClickingSliderIndexOnePostAuthorImageOpenHisPage() {
        BlogPageElements.getBlogPostAuthorImage().click();
        assertTrue(BlogPageElements.getBlogPostAuthorNameInPage().isDisplayed());
        driver.navigate().back();
    }
    @Test(priority = 14)
    public void verifySliderIndexOneBlogPostAuthorNameIsDisplayed (){
        Assert.assertTrue(BlogPageElements.getBlogPostAuthorName().isDisplayed());
    }
    @Test(priority = 15)
    public void verifySliderIndexOneBlogPostAuthorNameTextIsCorrect (){
        Assert.assertTrue(BlogPageElements.getBlogPostAuthorName().isDisplayed());
        Assert.assertEquals("خلود المرغلاني", BlogPageElements.getBlogPostAuthorName().getText());
    }
    @Test(priority = 15)
    public void ClickingSliderIndexOneBlogPostAuthorNameOpenHisPage() {
        BlogPageElements.getBlogPostAuthorImage().click();
        assertTrue(BlogPageElements.getBlogPostAuthorNameInPage().isDisplayed());
        driver.navigate().back();
    }
}
