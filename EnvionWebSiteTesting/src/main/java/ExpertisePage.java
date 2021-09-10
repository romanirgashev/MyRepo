import org.openqa.selenium.WebDriver;

public class ExpertisePage {

    public WebDriver driver;



    public ExpertisePage(WebDriver driver) {
        this.driver = driver;
    }

    String ExpertisePageURL = "https://www.expertise.com/ma/boston/software-development";

    public String checkCurrentURL(){
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }


}
