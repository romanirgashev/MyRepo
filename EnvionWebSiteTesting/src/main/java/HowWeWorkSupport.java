import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HowWeWorkSupport{

    public WebDriver driver ;

    public HowWeWorkSupport(WebDriver driver) {
        this.driver = driver;
    }


    protected By BusinessAnalysis_TabSwither = By.xpath("//a[text()='Business Analysis']");
    protected By ProductDesign_TabSwither = By.xpath("//a[text()='UX/UI Design']");
    protected By Development_TabSwither = By.xpath("//a[text()='Development']");
    protected By QualityAssurance_TabSwither = By.xpath("//a[text()='Quality Assurance']");
    protected By Support_TabSwither = By.xpath("//a[text()='Support']");


}



