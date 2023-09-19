package HomePageTest;

import WebsitePagesElements.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import static HomePageTest.SetUpDriver.driver;

public class NavigationBarTest{
    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        assertTrue(HomePageElements.getHeroSection().isDisplayed());
    }
    @Test(priority = 1)
    public void verifyThatTopNavbarIsDisplayed() {

        assertTrue(HomePageElements.getTopNavbar().isDisplayed());
    }

    @Test(priority = 2)
    public void  verifyLogoItemIsDisplayed(){
        assertTrue(HomePageElements.getNavbarLogo().isDisplayed());
    }
    @Test(priority = 3)
    public void verifyLogoItemSrcIsCorrect(){
        assertEquals("https://famcare.app/wp-content/uploads/2022/06/logo-ar.svg", HomePageElements.getNavbarLogo().getAttribute("src"));
    }
    @Test(priority = 4)
    public void verifyLogoItemAltIsCorrect(){
        assertEquals("فامكير | Famcare", HomePageElements.getNavbarLogo().getAttribute("alt"));
    }
    @Test(priority = 5)
    public void verifyClickingLogoItemOpensHomePage(){
        HomePageElements.getNavbarLogo().click();
        assertEquals("https://famcare.app/", SetUpDriver.driver.getCurrentUrl() );
        //methode display of booking first session button
    }



    @Test(priority = 6)
    public void verifyFamcareMenuItemIsDisplayed() {
//        wait.until(ExpectedConditions.visibilityOf(HomePageElements.getFamcareMenuItem()));
        assertTrue(HomePageElements.getFamcareMenuItem().isDisplayed());
    }
    @Test(priority = 7)
    public void verifyFamcareMenuItemIsActiveClass() {
        WebElement famcareListItem = driver.findElement(By.id("menu-item-6"));
        String classAttributeValue = famcareListItem.getAttribute("class");
        assertTrue(classAttributeValue.contains("active"));
    }
    @Test(priority = 8)
   public void verifyFamcareMenuItemTextIsCorrect(){
        assertEquals(HomePageElements.getFamcareMenuItem().getText(),"فامكير" );

    }
    @Test(priority = 9)
    public void verifyFamcareMenuItemHrefIsCorrect(){
        assertEquals(HomePageElements.getFamcareMenuItem().getAttribute("href"),"https://famcare.app/" );
    }
    @Test(priority = 10)
    public void verifyClickingFamcareMenuItemOpensHomePage(){
        HomePageElements.getFamcareMenuItem().click();
        assertEquals("https://famcare.app/", driver.getCurrentUrl());
        //methode display of booking first session button
    }

    @Test(priority = 11)
    public void specialistsMenuItemIsDisplayed(){
//        wait.until(ExpectedConditions.visibilityOf(HomePageElements.getSpecialistsMenuItem()));
        assertTrue(HomePageElements.getSpecialistsMenuItem().isDisplayed());
    }
    @Test(priority = 12)
    public void specialistsMenuItemTextIsCorrect(){
        assertEquals(HomePageElements.getSpecialistsMenuItem().getText(),"الأخصائيين" );
    }
    @Test(priority = 13)
    public void specialistsMenuItemHrefIsCorrect() {
        assertEquals(HomePageElements.getSpecialistsMenuItem().getAttribute("href"), "https://famcare.app/specialists/");
    }
    @Test(priority = 14)
    public void ClickingSpecialistsMenuItemOpensSpecialistsPage(){
        HomePageElements.getSpecialistsMenuItem().click();
        assertEquals("https://famcare.app/specialists/", driver.getCurrentUrl());
    }
    @Test(priority = 15)
    public void verifySpecialistsMenuItemIsActiveClassAfterClick() {
        WebElement specialistsListItem = driver.findElement(By.id("menu-item-1026"));
        String classAttributeValue = specialistsListItem.getAttribute("class");
        assertTrue(classAttributeValue.contains("active"));
    }
    @Test(priority = 16)
    public void verifyBackFromSpecialistsPageToHomePage() {
        driver.navigate().back();
        assertEquals("https://famcare.app/", driver.getCurrentUrl());
    }



    @Test(priority = 17)
    public void blogMenuItemIsDisplayed(){

        assertTrue(HomePageElements.getBlogMenuItem().isDisplayed());
    }
    @Test(priority = 18)
    public void blogMenuItemTextIsCorrect(){
        assertEquals(HomePageElements.getBlogMenuItem().getText(),"المدونة" );
    }
    @Test(priority = 19)
    public void blogMenuItemHrefIsCorrect() {
        assertEquals(HomePageElements.getBlogMenuItem().getAttribute("href"),"https://famcare.app/blog-2/" );
    }
    @Test(priority = 20)
    public void ClickingBlogMenuItemOpensBlogPage(){
        HomePageElements.getBlogMenuItem().click();
        assertEquals("https://famcare.app/blog-2/", driver.getCurrentUrl());
    }
    @Test(priority = 21)
    public void verifyBlogMenuItemIsActiveClassAfterClick() {
        WebElement blogListItem = driver.findElement(By.id("menu-item-2633"));
        String classAttributeValue = blogListItem.getAttribute("class");
        assertTrue(classAttributeValue.contains("active"));
    }
    @Test(priority = 22)
    public void verifyBackFormBlogPageToHomePage() {
        driver.navigate().back();
        assertEquals("https://famcare.app/", driver.getCurrentUrl());
        //methode
    }

    @Test(priority = 23)
    public void academyMenuItemIsDisplayed(){
        assertTrue(HomePageElements.getAcademyMenuItem().isDisplayed());
    }
    @Test(priority = 24)
    public void academyMenuItemTextIsCorrect(){
        assertEquals(HomePageElements.getAcademyMenuItem().getText(),"الأكاديمية" );
    }
    @Test(priority = 25)
    public void academyMenuItemHrefIsCorrect() {
        assertEquals(HomePageElements.getAcademyMenuItem().getAttribute("href"),"https://academy.famcare.app/" );
    }
    @Test(priority = 26)
    public void ClickingAcademyMenuItemOpensAcademyPage(){
        HomePageElements.getAcademyMenuItem().click();
        assertEquals("https://academy.famcare.app/", driver.getCurrentUrl());
    }
    @Test(priority = 26 ,enabled = false)
    public void verifyAcademyMenuItemAfterClickHideNavbar() {
        assertFalse(driver.findElement(By.cssSelector(".nav-menu > .container")).isDisplayed());
    }
    @Test(priority = 27)
    public void verifyBackFormAcademyPageToHomePage() {
        driver.navigate().back();
        assertEquals("https://famcare.app/", driver.getCurrentUrl());
        //methode
    }


    @Test(priority = 28)
    public void organizationsMenuItemIsDisplayed(){
        assertTrue(HomePageElements.getOrganizationsMenuItem().isDisplayed());
    }
    @Test(priority = 29)
    public void organizationsMenuItemTextIsCorrect(){
        assertEquals(HomePageElements.getOrganizationsMenuItem().getText(),"المنظمات" );
    }
    @Test(priority = 30)
    public void organizationsMenuItemHrefIsCorrect() {
        assertEquals(HomePageElements.getOrganizationsMenuItem().getAttribute("href"),"https://famcare.app/%d9%81%d8%a7%d9%85%d9%83%d9%8a%d8%b1-%d9%84%d9%84%d9%85%d9%86%d8%b8%d9%85%d8%a7%d8%aa/" );
    }
    @Test(priority = 31)
    public void ClickingOrganizationsMenuItemOpensOrganizationsPage(){
        HomePageElements.getOrganizationsMenuItem().click();
        assertEquals("https://famcare.app/%d9%81%d8%a7%d9%85%d9%83%d9%8a%d8%b1-%d9%84%d9%84%d9%85%d9%86%d8%b8%d9%85%d8%a7%d8%aa/", driver.getCurrentUrl());
    }
    @Test(priority = 32)
    public void verifyOrganizationsMenuItemIsActiveClassAfterClick() {
        WebElement organizationsListItem = driver.findElement(By.id("menu-item-187"));
        String classAttributeValue = organizationsListItem.getAttribute("class");
        assertTrue(classAttributeValue.contains("active"));
    }
    @Test(priority = 33)
    public void verifyBackFormOrganizationsPageToHomePage() {
        driver.navigate().back();
        assertEquals("https://famcare.app/", driver.getCurrentUrl());
        //methode
    }



    @Test(priority = 34)
    public void aboutUsMenuItemIsDisplayed(){
        assertTrue(HomePageElements.getAboutUsMenuItem().isDisplayed());
    }
    @Test(priority = 35)
    public void aboutUsMenuItemTextIsCorrect(){
        assertEquals(HomePageElements.getAboutUsMenuItem().getText(),"من نحن" );
    }
    @Test(priority = 36)
    public void aboutUsMenuItemHrefIsCorrect() {
        assertEquals(HomePageElements.getAboutUsMenuItem().getAttribute("href"),"https://famcare.app/%d9%85%d9%86-%d9%86%d8%ad%d9%86/" );
    }
    @Test(priority = 37)
    public void ClickingAboutUsMenuItemOpensAboutUsPage(){
        HomePageElements.getAboutUsMenuItem().click();
        assertEquals("https://famcare.app/%d9%85%d9%86-%d9%86%d8%ad%d9%86/", driver.getCurrentUrl());
    }
    @Test(priority = 38)
    public void verifyAboutUsMenuItemIsActiveClassAfterClick() {
        WebElement aboutUsListItem = driver.findElement(By.id("menu-item-188"));
        String classAttributeValue = aboutUsListItem.getAttribute("class");
        assertTrue(classAttributeValue.contains("active"));
    }
    @Test(priority = 39)
    public void verifyBackFormAboutUsPageToHomePage() {
        driver.navigate().back();
        assertEquals("https://famcare.app/", driver.getCurrentUrl());
        //methode
    }
    @Test(priority = 40)
    public void joinAsSpecialistButtonIsDisplayed(){
        assertTrue(HomePageElements.getJoinAsSpecialistButton().isDisplayed());
    }
    @Test(priority = 41)
    public void joinAsSpecialistButtonTextIsCorrect(){
        assertEquals(HomePageElements.getJoinAsSpecialistButton().getText(),"انضم كأخصائي" );
    }

    @Test(priority = 42)
    public void ClickingJoinAsSpecialistButtonOpensEnterInformationForm(){
        HomePageElements.getJoinAsSpecialistButton().click();
        assertTrue(HomePageElements.getJoinAsSpecialistForm().isDisplayed());
    }

    @Test(priority = 43)
    public void ClickingJoinAsSpecialistFormCloseHiddenEnterInformationForm() {
        HomePageElements.getJoinAsSpecialistFormClose().click();
        assertFalse(HomePageElements.getJoinAsSpecialistForm().isDisplayed());

    }




}