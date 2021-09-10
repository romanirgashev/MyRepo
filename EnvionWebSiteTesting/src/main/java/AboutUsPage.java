import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AboutUsPage {

    public WebDriver driver;


    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }


    protected By AboutUsDiv = By.cssSelector("body > div.site-wrapper > div.scroll-content > div > div.modul-sequence.mt10 > div");
    protected By CompanyMission_H2 =  By.cssSelector("body > div.site-wrapper > div.scroll-content > div > div.features.container-s.pt10 > h2");
    protected By EnvionSoftware_H2 =  By.cssSelector("body > div.site-wrapper > div.scroll-content > div > div.modul-about.container-md.pt10 > h2");


    protected By AboutUsH1Header = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/div[1]/h1/span");
    protected By EnvionSoftwareH2Header = By.xpath("//h2[text() = 'Envion software']");
    protected By WhoWeAreH2Header = By.xpath("//h3[text() = 'Who we are']");


    protected By ModuleSequenceDiv = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div");
    protected By ModuleSequenceFirstParagraphNumber = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/ul/li[1]/span");
    protected By ModuleSequenceFirstParagraph = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/ul/li[1]/p");
    protected String ModuleSequenceFirstParagraphText = "Envion Software has over 30 years of professional experience in developing state-of-the-art software that resolves unique business challenges.";

    protected By ModuleSequenceSecondParagraphNumber = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/ul/li[2]/span");
    protected By ModuleSequenceSecondParagraph = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/ul/li[2]/p");
    protected String ModuleSequenceSecondParagraphText = "We’ve attracted the best Eastern Europe’s tech talent accumulated in our Ukrainian and Russian IT hubs with the HQ in Boston, USA.";

    protected By ModuleSequenceThirdParagraphNumber = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/ul/li[3]/span");
    protected By ModuleSequenceThirdParagraph = By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/ul/li[3]/p");
    protected String ModuleSequenceThirdParagraphText = "Full-cycle offshore programming operated by a trustworthy US-based company is what we do with the competence and reliability being our business card.";

    protected By EnvionSoftwareParagraph = By.xpath("/html/body/div[2]/div[1]/div/div[1]/div/p");
    protected String EnvionSoftwareParagraphText = "Envion Software is a global software partner that specializes in creating custom software solutions. How we do it is what makes us one of the top software firms in the Boston area. We approach each project as an opportunity to use our experience, creativity, intuition to deliver results that often exceed expectations. For our startup clients that means working on every aspect of the product development and evolution from fleshing out an idea to delivering a finished product. When we extend an existing development team our clients find our enthusiasm, cooperative spirit, our intelligence and experience a valuable asset. With many years under our belt, our team of project managers and engineers have what it takes to have our clients succeeded.";


    protected String Image = "/html/body/div[2]/div[1]/div/div[2]/img";
    protected By ImageBy =  By.xpath("/html/body/div[2]/div[1]/div/div[2]/img");
//    protected WebElement ImageWebElem = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/img"));

    protected String HeroImage = "/html/body/div[2]/div[1]/div/section[1]/div/div[2]/img";
    protected By HeroImageBy = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/div[2]/img");

    protected By CompanyMissionSectionFirstHeader = By.xpath("//h5[text()='Professionalism']");
    protected By CompanyMissionSectionFirstParagraph = By.xpath("/html/body/div[2]/div[1]/div/div[4]/div[1]/div[2]/p");
    protected String CompanyMissionSectionFirstParagraphText = "A blend of traditional approach and modern solutions are married to three decades of experience here, at Envion. Envion Software business analysts, system architects, QA engineers and senior level programmers for hire available for you, project by project approach and technical intelligence are our differentiating factors.";

    protected By CompanyMissionSectionSecondHeader = By.xpath("//h5[text()='Responsibility']");
    protected By CompanyMissionSectionSecondParagraph = By.xpath("/html/body/div[2]/div[1]/div/div[4]/div[2]/div[2]/p");
    protected String CompanyMissionSectionSecondParagraphText = "Our professionalism is tightly intertwined with the high level of responsibility when delivering projects. This creates the atmosphere of accurate estimates, deadlines compliance, and responsiveness to business needs. Our clients are welcome to control every stage of software development, including face-to-face meetings with designers or back-end programmers upon demand.";

    protected String AboutUsPageURL = "https://envionsoftware.com/about_us/";

    public String checkCurrentURL(){
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }









}
