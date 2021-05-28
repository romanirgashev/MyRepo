import io.qameta.allure.Step;
import org.apache.tika.io.FilenameUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestBase {



    WebDriver driver;









    public void setUp(String browser, String URL) {

        System.setProperty("allure.results.directory", "allure-results/");
        switch (browser)
        {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\drivers for testing\\chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "D:\\drivers for testing\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", "D:\\drivers for testing\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;

        }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);

    }

    @Step
    public Object scrollToElement(int quantity) throws InterruptedException {
        Actions action = new Actions(driver);
        for(int i = 1; i <= quantity;i ++) {
            Thread.sleep(300);
            action.moveByOffset(30, 20).click().build().perform();
            Thread.sleep(300);
            action.sendKeys(Keys.PAGE_DOWN).build().perform();
        }
        return this;
    }

    @Step
    public Object scrollToElementSmoothly(int quantity) throws InterruptedException {
        Actions action = new Actions(driver);
        for(int i = 1; i <= quantity;i ++) {
            Thread.sleep(300);
            action.moveByOffset(30, 20).click().build().perform();
            Thread.sleep(300);
            action.sendKeys(Keys.ARROW_DOWN).build().perform();
        }
        return this;
    }

    public void captureScreen() {
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("D:\\mygit\\at2021-roman\\EnvionWebSiteTesting\\target\\allure-results\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Step
    public boolean checkURLCorrectness(String expected){
        String actual = driver.getCurrentUrl();
        boolean bool = actual.equals(expected);
        return bool;
    }

    @Step
    public Object clickElement(By Element)
    {
        driver.findElement(Element).click();
        return this;
    }

    @Step
    public boolean checkPresenseOfElement(By Element) throws InterruptedException {
        return driver.findElement(Element).isDisplayed() ;
    }

    public boolean check_Element_IsEnabled(By Element) throws InterruptedException {
        return driver.findElement(Element).isEnabled();
    }


    @Step
    public Object WebDriverWait(By Element)
    {
//        WebDriverWait waitDriver = new WebDriverWait(driver, 10);
        new WebDriverWait(driver,5)
                .until(ExpectedConditions.elementToBeClickable(Element));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return this;
    }

    @Step
    public String getTextOfElement(By Element)
    {
        String textOfElement = driver.findElement(Element).getAttribute("textContent").trim();
        return textOfElement;
    }
    @Step
    public String getInnerHTMLOfElement(By Element)
    {
        String textOfElement = driver.findElement(Element).getAttribute("innerHTML").trim();
        return textOfElement;
    }
    @Step
    public Dimension getDimensionOfElement(By Element)
    {
        Dimension dimension = driver.findElement(Element).getSize();
        return dimension;
    }
    @Step
    public String getParagraphText (String ParagraphLocator)
    {
        String Paragraph = driver.findElement(By.xpath(ParagraphLocator)).getAttribute("innerHTML").trim();
        return Paragraph;
    }


    public void tearDown()
    {
        driver.quit();
    }




}
