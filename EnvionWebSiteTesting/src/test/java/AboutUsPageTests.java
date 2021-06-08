import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AboutUsPageTests extends TestBase{

//    WebDriver driver;
    private AboutUsPage aboutUsPage;
    private MainPage mainPage;




    @Before
    public void SetUp() {
        setUp("chrome","https://envionsoftware.com");
        mainPage = new MainPage(driver);
        aboutUsPage = new AboutUsPage(driver);
    }




    @Test
    public void About_H3Header_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        clickElement(mainPage.AboutUsButtonFromGamburgerMenu);
        boolean bool = aboutUsPage.checkPresenseOElement(aboutUsPage.AboutUsH3Header);
        Assert.assertTrue(bool);
    }


    @Test
    public void Image_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        clickElement(mainPage.AboutUsButtonFromGamburgerMenu);
        scrollToElement(1);
        scrollToElementSmoothly(1);
        boolean bool = aboutUsPage.checkPresenseOElement(aboutUsPage.Image);
        Assert.assertTrue(bool);
    }




    @After
    public void TearDown(){
        tearDown();
    }


}





