package WebsitePagesElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static HomePageTest.SetUpDriver.driver;


public class HomePageElements {



    public static WebElement getTopNavbar(){

        return driver.findElement(By.cssSelector(".nav-menu"));
    }
    //Navigation top Bar
    public static WebElement getNavbarLogo(){
        return driver.findElement(By.cssSelector(".navbar-brand > img"));
    }
    public static WebElement getFamcareMenuItem(){
        return driver.findElement(By.cssSelector("#menu-item-6 > .nav-link"));
    }
    public static WebElement getSpecialistsMenuItem(){
        return driver.findElement(By.cssSelector("#menu-item-1026 > .nav-link"));
    }
    public static WebElement getBlogMenuItem(){
        return driver.findElement(By.cssSelector("#menu-item-2633 > .nav-link"));
    }
    public static WebElement getAcademyMenuItem(){
        return driver.findElement(By.cssSelector("#menu-item-1227 > .nav-link"));
    }
    public static WebElement getOrganizationsMenuItem(){
        return driver.findElement(By.cssSelector("#menu-item-187 > .nav-link"));
    }
    public static WebElement getAboutUsMenuItem(){
        return driver.findElement(By.cssSelector("#menu-item-188 > .nav-link"));
    }
    public static WebElement getJoinAsSpecialistButton(){
        return driver.findElement(By.cssSelector("#navbarContent > .btn"));
    }
    public static WebElement getJoinAsSpecialistForm(){
        return driver.findElement(By.cssSelector("#joinUsModal > .modal-dialog > .modal-content"));
    }
    public static WebElement getJoinAsSpecialistFormClose(){
        return driver.findElement(By.cssSelector("#joinUsModal > .modal-dialog > .modal-content > .close > span"));
    }

    // Hero Section

    public static WebElement getHeroSection() {
        return driver.findElement(By.id("heroSection"));
    }
    public static WebElement getHeroSectionImage() {
        return driver.findElement(By.cssSelector(".kc-css-107922 > img"));
    }
    public static WebElement getHeroSectionHead() {
        return driver.findElement(By.cssSelector(".kc-css-964511 > .kc_title"));
    }
    public static WebElement getHeroSectionParagraph() {
        return driver.findElement(By.cssSelector(".kc-css-912794 > p"));
    }
    public static WebElement getBookFirstSessionButton() {
        return driver.findElement(By.cssSelector(".kc-css-780143 > .kc_button"));
    }

    //Approved Official Authorities Section
    public static WebElement getApprovedOfficialAuthoritiesSection() {
        return driver.findElement(By.cssSelector(".kc-css-16652"));
    }
    public static WebElement getHeadApprovedOfficialAuthoritiesSection() {
        return driver.findElement(By.cssSelector(".kc-css-480965 > .kc_title"));
    }
    public static WebElement getCard_1_Image() {
        return driver.findElement(By.cssSelector(".kc-css-373193> img"));
    }
    public static WebElement getCard_1_Head() {
        return driver.findElement(By.cssSelector(".kc-css-493653 > .kc_title"));
    }
    public static WebElement getCard_2_Image() {
        return driver.findElement(By.cssSelector(".kc-css-268709 > img"));
    }
    public static WebElement getCard_2_Head() {
        return driver.findElement(By.cssSelector(".kc-css-374927 > .kc_title"));
    }
    public static WebElement getCard_3_Image() {
        return driver.findElement(By.cssSelector(".kc-css-833582  > img"));
    }
    public static WebElement getCard_3_Head() {
        return driver.findElement(By.cssSelector(".kc-css-167776 > .kc_title"));
    }
    public static WebElement getCard_4_Image() {
        return driver.findElement(By.cssSelector(".kc-css-744171   > img"));
    }
    public static WebElement getCard_4_Head() {
        return driver.findElement(By.cssSelector(".kc-css-485816  > .kc_title"));
    }

    // Specialists And Guides Section
    public static WebElement getSpecialistsAndGuidesSection() {
        return driver.findElement(By.cssSelector(".kc-css-616729"));
    }
    public static WebElement getHeadSpecialistsAndGuidesSection() {
        return driver.findElement(By.cssSelector(".kc-css-554197  > .kc_title"));
    }
    public static WebElement getContactNowButton() {
        return driver.findElement(By.cssSelector(".kc_wrapper > .kc-elm > .kc_button"));
    }


    //Statistics Section
    public static WebElement getStatisticsSection() {

        return driver.findElement(By.cssSelector(".kc-css-16652"));
    }
}

