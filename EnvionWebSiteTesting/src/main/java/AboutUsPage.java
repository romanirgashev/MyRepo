import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AboutUsPage {

    public WebDriver driver;


    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    protected By AboutUsH3Header = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/div[1]/h1/span");
    protected By Image = By.xpath("/html/body/div[2]/div[1]/div/div[2]/img");
    protected String AboutUsPageURL = "https://envionsoftware.com/about_us/";

    public String checkCurrentURL(){
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }

    public boolean checkPresenseOElement(By Element) throws InterruptedException {

        boolean elemIsPresent = driver.findElement(Element).isDisplayed() ;
        return  elemIsPresent;
    }








}
