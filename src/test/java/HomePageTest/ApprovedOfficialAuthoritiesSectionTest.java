package HomePageTest;


import WebsitePagesElements.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static HomePageTest.SetUpDriver.jse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ApprovedOfficialAuthoritiesSectionTest {


    @Test(priority = 1)
    public void scrollDownSection(){
        jse.executeScript("arguments[0].scrollIntoView(true);", HomePageElements.getApprovedOfficialAuthoritiesSection() );
    }

    @Test(priority = 1 , description = "verify Approved Official Authorities Section Is Displayed")
    public void verifyApprovedOfficialAuthoritiesSectionIsDisplayed() {
        assertTrue(HomePageElements.getApprovedOfficialAuthoritiesSection().isDisplayed());
    }


    @Test(priority = 2)
    public void verifyHeadTitleApprovedOfficialAuthoritiesSectionIsDisplayed() {
        Assert.assertTrue(HomePageElements.getHeadApprovedOfficialAuthoritiesSection().isDisplayed());
    }
    @Test(priority = 3)
    public void verifyHeadTitleApprovedOfficialAuthoritiesSectionTextIsCorrect(){
        Assert.assertEquals(HomePageElements.getHeadApprovedOfficialAuthoritiesSection().getText(),"تطبيق معتمد من الجهات الرسمية" );
    }

    @Test(priority = 4)
    public void  verifyCard_1_ImageIsDisplayed(){
        assertTrue(HomePageElements.getCard_1_Image().isDisplayed());
    }
    @Test(priority = 5)
    public void verifyCard_1_ImageSrcIsCorrect(){
        assertEquals("https://famcare.app/wp-content/uploads/2023/06/aa.png", HomePageElements.getCard_1_Image().getAttribute("src"));
    }
    @Test(priority = 6)
    public void verifyCard_1_ImageAltIsCorrect(){
        assertEquals("img", HomePageElements.getCard_1_Image().getAttribute("alt"));
    }
    @Test(priority = 7)
    public void verifyCard_1_HeadIsDisplayed(){
        assertTrue(HomePageElements.getCard_1_Head().isDisplayed());
    }
    @Test(priority = 8)
    public void verifyCard_1_HeadTextIsCorrect(){
        assertEquals(HomePageElements.getCard_1_Head().getText(),"لوائح حماية البيانات" );
    }

    @Test(priority = 9)
    public void  verifyCard_2_ImageIsDisplayed(){

        assertTrue(HomePageElements.getCard_2_Image().isDisplayed());
    }
    @Test(priority = 10)
    public void verifyCard_2_ImageSrcIsCorrect(){
        assertEquals("https://famcare.app/wp-content/uploads/2022/05/%D8%B4%D8%B1%D9%83%D8%A9-%D9%85%D8%AC%D8%AA%D9%85%D8%B9%D9%8A%D8%A9.png", HomePageElements.getCard_2_Image().getAttribute("src"));
    }
    @Test(priority = 11)
    public void verifyCard_2_ImageAltIsCorrect(){
        assertEquals("img", HomePageElements.getCard_2_Image().getAttribute("alt"));
    }
    @Test(priority = 12)
    public void verifyCard_2_HeadIsDisplayed(){
        assertTrue(HomePageElements.getCard_2_Head().isDisplayed());
    }
    @Test(priority = 13)
    public void verifyCard_2_HeadTextIsCorrect(){
        assertEquals(HomePageElements.getCard_2_Head().getText(),"شركة مجتمعية" );
    }

    @Test(priority = 14)
    public void  verifyCard_3_ImageIsDisplayed(){
        assertTrue(HomePageElements.getCard_3_Image().isDisplayed());
    }
    @Test(priority = 15)
    public void verifyCard_3_ImageSrcIsCorrect(){
        assertEquals("https://famcare.app/wp-content/uploads/2022/05/back.png", HomePageElements.getCard_3_Image().getAttribute("src"));
    }
    @Test(priority = 16)
    public void verifyCard_3_ImageAltIsCorrect(){
        assertEquals("img", HomePageElements.getCard_3_Image().getAttribute("alt"));
    }
    @Test(priority = 17)
    public void verifyCard_3_HeadIsDisplayed(){

        assertTrue(HomePageElements.getCard_3_Head().isDisplayed());
    }
    @Test(priority = 18)
    public void verifyCard_3_HeadTextIsCorrect(){
        assertEquals(HomePageElements.getCard_3_Head().getText(),"مركز ارشاد اسري" );
    }


    @Test(priority = 19)
    public void  verifyCard_4_ImageIsDisplayed(){
        assertTrue(HomePageElements.getCard_4_Image().isDisplayed());
    }
    @Test(priority = 20)
    public void verifyCard_4_ImageSrcIsCorrect(){
        assertEquals("https://famcare.app/wp-content/uploads/2022/05/%D9%85%D8%B1%D9%83%D8%B2-%D8%B7%D8%A8-%D8%A7%D8%AA%D8%B5%D8%A7%D9%84%D9%8A.png", HomePageElements.getCard_4_Image().getAttribute("src"));
    }
    @Test(priority = 21)
    public void verifyCard_4_ImageAltIsCorrect(){
        assertEquals("img", HomePageElements.getCard_4_Image().getAttribute("alt"));
    }
    @Test(priority = 22)
    public void verifyCard_4_HeadIsDisplayed(){

        assertTrue(HomePageElements.getCard_4_Head().isDisplayed());
    }
    @Test(priority = 23)
    public void verifyCard_4_HeadTextIsCorrect(){
        assertEquals(HomePageElements.getCard_4_Head().getText(),"مركز طب اتصالي" );
    }

}
