package HomePageTest;

import org.testng.annotations.Test;

import static HomePageTest.SetUpDriver.driver;

public class TearDown {
    @Test
    public static void tearDown() {
        driver.quit();
    }

}