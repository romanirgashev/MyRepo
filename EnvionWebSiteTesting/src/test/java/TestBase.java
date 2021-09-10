import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.tika.io.FilenameUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.Color;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.JavascriptExecutor;

public class TestBase {



    protected WebDriver driver;
    List<Long> TimersOfLoading =  new ArrayList<>();






    public void setUp(String browser, String URL) {

        System.setProperty("allure.results.directory", "allure-results/");
        switch (browser)
        {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "F:\\drivers for testing\\chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "F:\\drivers for testing\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", "F:\\drivers for testing\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;

        }
        System.setProperty("webdriver.chrome.whitelistedIps", "192.168.56.1");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        Dimension test = new Dimension(400,898);
//        driver.manage().window().setSize(test);
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

    @Step
    public Object scrollUpToElementSmoothly(int quantity) throws InterruptedException {
        Actions action = new Actions(driver);
        for(int i = 1; i <= quantity;i ++) {
            Thread.sleep(300);
            action.moveByOffset(30, 20).click().build().perform();
            Thread.sleep(300);
            action.sendKeys(Keys.ARROW_UP).build().perform();
        }
        return this;
    }


/*    @Step
    public Object scrollToElementJS(By Element)  {
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) Element);
        actions.perform();

        return this;
    }*/

    /*//initialize element
    WebElement element = driver.findElement(By.id("..."));

    //get position
    int x = element.getLocation().getX();
    int y = element.getLocation().getY();

    //scroll to x y
    JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(" +x +", " +y +")");*/






    @Attachment(value = "Screenshot of the actual result of the test", type = "image/png")
    public byte[] makeScreenshot() {
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("target\\surefire-reports\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("screenshot was not transferred to folder");
        }
        BufferedImage image = null;
        try {
            image = ImageIO.read(screenshot);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("screenshot was not transformed to BufImage");
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", baos);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Buf image was not transformed to Byte");
        }

        byte[] imageBytes = baos.toByteArray();

        if (imageBytes.length == 0) {
            String errorMessage = "Converted byte array for screenshot is empty.";
            throw new RuntimeException(errorMessage);
        }
        return imageBytes;
    }


    @Step
    public String checkURLCorrectness(){
        String actual = driver.getCurrentUrl();
        return actual;
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


    @Step
    public boolean checkPresenseOfElement(String Element) throws InterruptedException {
        return driver.findElement(By.id(Element)).isDisplayed() ;
    }

    public boolean check_Element_IsEnabled(By Element) throws InterruptedException {
        return driver.findElement(Element).isEnabled();
    }


    @Step
    public Object WebDriverWait(By Element)
    {
//        WebDriverWait waitDriver = new WebDriverWait(driver, 10);
        new WebDriverWait(driver,1)
                .until(ExpectedConditions.elementToBeClickable(Element));
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return this;
    }


    @Step
    public Object WebDriverWait2(By Element)
    {
//        WebDriverWait waitDriver = new WebDriverWait(driver, 10);
        new WebDriverWait(driver,1)
                .until(ExpectedConditions.presenceOfElementLocated(Element));
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
    public String getRGBColorOfElementsName(By Element)
    {
        String colorOfElement = driver.findElement(Element).getCssValue("color");
        return colorOfElement;
    }

    @Step
    public String getRGBColorOfElementsBody(By Element)
    {
        String colorOfElement = driver.findElement(Element).getCssValue("background-color");
        return colorOfElement;
    }

    @Step
    public String getColorAs_HEX_OfElements_Name(By Element)
    {
        String colorOfElement = driver.findElement(Element).getCssValue("color");
        String ColorHEX = Color.fromString(colorOfElement).asHex();
        return ColorHEX;
    }

    @Step
    public String getColorAs_HEX_OfElements_Body(By Element)
    {
        String colorOfElement = driver.findElement(Element).getCssValue("background-color");
        String ColorHEX = Color.fromString(colorOfElement).asHex();
        return ColorHEX;
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

/*    @Step
    public double get_Time_of_Loading() {
            //Creating the JavascriptExecutor interface object by Type casting
            JavascriptExecutor js = (JavascriptExecutor)driver;

            //This will get you the time passed since you page navigation started
            return (Double)((JavascriptExecutor)driver).executeScript("return Date.now() - performance.timeOrigin;");
    }*/

    @Step
    public String get_alt_Attribute_of_Element (String ImageLocator)
    {
        String Paragraph = driver.findElement(By.xpath(ImageLocator)).getAttribute("alt").trim();
        return Paragraph;
    }

    @Step
    public String get_Class_Attribute_of_Element (String ImageLocator)
    {
        String Paragraph = driver.findElement(By.xpath(ImageLocator)).getAttribute("class").trim();
        return Paragraph;
    }

    @Step
    public String get_Style_Attribute_of_Element (String ImageLocator)
    {
        String Paragraph = driver.findElement(By.cssSelector(ImageLocator)).getAttribute("style").trim();
        return Paragraph;
    }

    @Step
    public String get_FontSize_of_Element (By ImageLocator)
    {
        String actual = driver.findElement(ImageLocator).getCssValue("font-size").trim();
        return actual;
    }


/*    @Step
    public String get_Naturel_Size_Of_Element(){
        WebElement Element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/div[1]/h1"));
        String naturalWidth = Element.getAttribute("naturalWidth");
        String naturalHeight = Element.getAttribute("naturalHeight");

// get the intrinsic size with a piece of Javascript
        *//*ArrayList result = (ArrayList)((JavascriptExecutor) driver).executeScript(
                "return [arguments[0].naturalWidth, arguments[0].naturalHeight];", Element);
        Long naturalWidth2 = (Long)result.get(0);
        Long naturalHeight2 = (Long)result.get(1);*//*
        return naturalWidth;
    }*/








    public void tearDown()
    {
        driver.quit();
    }




}
