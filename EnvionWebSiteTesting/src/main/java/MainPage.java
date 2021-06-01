import io.qameta.allure.Step;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;


public class MainPage {

    public WebDriver driver ;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    protected By CompanyNameHeader = By.xpath("//span[text()='Envion software' ]");
    protected By DevelopmentHeader = By.xpath("//span[text()='Development with spirit' ]");
    protected By CompanyLogo = By.xpath("/html/body/div[2]/div[1]/div/header/div/a/img");
    protected By ExpertiseImage = By.xpath("//html/body/div[2]/div[1]/div/div/section/div/a/img");
    protected By gamburgerMenuButton = By.xpath("/html/body/nav/div[1]/button");
//    protected By HomePageBackground = (By.xpath("/html/body/div[2]/div[1]/div/div/section/img"));

    //The curtain which opens after clicking gamburgerMenuButton
    protected By gamburgerMenu = By.xpath("//nav/div/div[2]");
    protected By AboutUsButtonFromGamburgerMenu = By.xpath("//*[@id=\"menu-item-257\"]/a/em/span");



//Elements from Industries Section

    protected By IndustryH2Header = By.xpath("/html/body/div[2]/div[1]/div/div");

    protected By ScrollableSectionFirstH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='Healthcare']") ;
    protected By ScrollableSectionSecondH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='CRM Systems']") ;
    protected By ScrollableSectionThirdH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='Data Science']") ;
    protected By ScrollableSectionFourthH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='Fitness & Wellness']") ;
    protected By ScrollableSectionFifthH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='GPS Navigation']") ;
    protected By ScrollableSectionSixthH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='Marketing & Advertising']") ;
    protected By ScrollableSectionSeventhH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='Media & Education']") ;
    protected By ScrollableSectionEighthH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='Natural Language Processing']") ;
    protected By ScrollableSectionNinthH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='Social Media']") ;
    protected By ScrollableSectionTenthH3Header =By.xpath("//div[@class='industries__text slick-arrow']/h3[text()='Travel & Hospitality']") ;
//    protected By ScrollableSectionH3HeaderCommonLocator = By.xpath("//div[@class='industries__text slick-arrow']/h3");


    protected By ScrollableSectionSecondTabNextDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[3]");
    protected By ScrollableSectionThirdTabNextDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[4]");
//    protected By ScrollableSectionFourthNextDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[5]");

    protected By ScrollableSectionSecondImage =By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[3]/div/div[1]/img") ;

    protected By ScrollableSectionFirstDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[3]");
    protected By ScrollableSectionSecondDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[4]");
    protected By ScrollableSectionThirdDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[5]");
    protected By ScrollableSectionFourthDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[6]");
    protected By ScrollableSectionFifthDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[7]");
    protected By ScrollableSectionSixthDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[8]");
    protected By ScrollableSectionTenthDiv = By.xpath("/html/body/div[2]/div[1]/div/section[1]/div/ul/div/div/li[11]");

    protected By ScrollableSectionCommonTextDivLocator = By.cssSelector("body > div.site-wrapper > div.scroll-content > div > section.industries.container-md.pb20 > div > ul > div > div > li > div > div.industries__text.slick-arrow");

    String [] IndustryTabH3Headers = {"Healthcare","CRM Systems","Data Science","Fitness & Wellness","GPS Navigation","Marketing & Advertising",
            "Media & Education","Natural Language Processing","Social Media","Travel & Hospitality"};

    String [] ServicesTabH3Headers = {"Healthcare","CRM Systems","Data Science","Fitness & Wellness","GPS Navigation"};


    protected String ScrollableHealthcareSectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">Healthcare</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>Envion’s Healthcare IT practice stems from the company’s technological eminence: the company’s first project in this business domain was awarded to us as a highly dependable and skillful provider that boast\u00ADed an immaculate delivery track record.</p><br>\n" +
            "<p>We found the exacting and impactful nature of Healthcare IT to be a great incentive for us to develop as a company, as well as a great chance to make a difference and help a huge number of people with something they needed the most. Those were the main reasons that prompted us to allocate significant resources, ac\u00ADquire the knowledge and experience we needed, and, eventually, make Healthcare IT a strong area of ex\u00ADpertise and part of our flagship service offering.</p><br>\n" +
            "<p>We have spent more than 6 years developing large-scale Heathcare projects, some of which make us proud to be part of something of nationwide significance in a critically important area. In addition to technologi\u00ADcally equipping well-established medical institutions, Envion’s Healthcare IT practice has become an inte\u00ADgral part of several remarkable startup success stories, thus enabling medical innovation reach an even greater number of people.</p>                      <p></p>\n" +
            "\n" +
            "                    ";


    protected String ScrollableCRMSystemsSectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">CRM Systems</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>Customer relationship management (CRM) is a technology for managing all your company’s relationships and interactions with customers and potential customers. The goal is simple: Improve business relationships. A CRM system helps companies stay connected to customers, streamline processes, and improve profitability.</p>                      <p></p>\n" +
            "\n" +
            "                    ";

    protected String ScrollableDataScienceSectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">Data Science</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>Our Data Science experts have a solid Data Science background and have previously taken part in a number of challenging projects for international clients in an array of business domains. The following is a brief description of several projects which they have taken part in implementing, which illustrate the high level of their Data Science skills and expertise.</p>                      <p></p>\n" +
            "\n" +
            "                    ";


    protected String ScrollableFitnessSectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">Fitness &amp; Wellness</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>Our expertise in this industry lies in implementing complex and multi-platform projects easily integrating into the Fitness industry of sensors, styles, user behavior patterns and takes into account the latest trends in this field. Our team excelled at introducing products that improve end-users lives, and in the Fitness Industry, we launched more than one application revealing the full potential of state-of-the-art needs.</p>                      <p></p>\n" +
            "\n" +
            "                    ";

    protected String ScrollableGPSNavigationSectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">GPS Navigation</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>Envion company has lauchned a big number of with GPS Navigation …. The purpose of navigation system is to facilitate the access to any point around the area under consideration. The GPS system was devoted to determine the current location based on a 24 satellite system located around the earth. Please add more information to here.</p>                      <p></p>\n" +
            "\n" +
            "                    ";

    protected String ScrollableMarketingSectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">Marketing &amp; Advertising</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>Projects in this domain are like bright meteors lighting up the night sky – always inspiring our clients, delighting Envion Software’s team, and astonishing products’ end-users. We always work at our limit in Marktech and Adtech projects both technologically and creatively, because marketing and advertising are the engines of progress in today’s world. Check out our latest intriguing cases from this category, and you will be encouraged by new advertising ideas.</p>                      <p></p>\n" +
            "\n" +
            "                    ";

    protected String ScrollableMediaAndEducationSectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">Media &amp; Education</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>Schooling the younger generation, professional development, content delivery, and administration were important and necessary tasks for any project related to this domain. Our team commitment, tang, and zest to this domain projects are always the highest since the future generations’ success highly depends on them. Data storage and administration, smart search, parsing, Machine Learning, and data arrays storage – here’s what forms the basis of such projects.</p>                      <p></p>\n" +
            "\n" +
            "                    ";

    protected String ScrollableNaturalLanguageSectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">Natural Language Processing</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>The history of Envion’s NLP practice spans nearly 30 years and dates back to 1984, when the company just began to operate as Circle Noetic Services.</p><br>\n" +
            "<p>Back then, as a group of Massachusetts Institute of Technology graduates led by our CEO, we initially tackled the problem of automatic hyphenation and, eventually, succeeded in delivering an utterly novel proprietary technology solution that was licensed to Adobe, Quark, Microsoft, Oracle, Atex, and many other publishing and IT heavyweights.</p><br>\n" +
            "<p>We started at the industry’s outset, and have since built, through unrelenting search and sustained effort, a remarkably powerful NLP practice that focuses on two major areas: Proprietary NLP products and Custom NLP Solutions.</p><br>\n" +
            "<p>As part of its NLP Practice, Envion employs a cherry-picked in-house linguistic team that includes scientists from Eastern Europe’s leading universities.</p>                      <p></p>\n" +
            "\n" +
            "                    ";

    protected String ScrollableSocialMediaSectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">Social Media</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>Envion Software foray into social media began in 1999 with an idea for a website where people could connect to their friends and family and let them know about their lives. Since then we worked on a number of projects in this area. We developed a community portal where members could share their language learning content among themselves with an option to monetize it.</p> <br>\n" +
            "<p>We developed a dating application targeting the alphabet people. We have&nbsp;explored and added insight to the online-dating services phenomena which is the next product and beneficiary of the internet revolution that offers customers a convenient and affordable alternative to traditional methods of dating.</p> <br>\n" +
            "<p>Design/methodology/approach – Empirically investigated through conceptual models and statistical methods were the value proposition of online matchmaking services, which boils down to the ability to provide appropriate matches through successfully business-to-customer customer service enhanced by the web and based on sound customer relations management practices.</p>                      <p></p>\n" +
            "\n" +
            "                    ";

    protected String ScrollableTravelAndHospitalitySectionParagraphText = "\n" +
            "                      <h3 class=\"industries__title\">Travel &amp; Hospitality</h3>\n" +
            "\n" +
            "                      <p>\n" +
            "                        </p><p>Envion Software expertise in this very dynamic business environment has always lied in high-quality integration with the systems of location and positioning, notification/response, as well as security and planning. Many of our Travel/Hospitality projects were particularly challenging in task implementation in the shortest possible time, and using the best positioning and logistics systems.</p>                      <p></p>\n" +
            "\n" +
            "                    ";



// Elements from the Services Section
    protected  By ServicesSection_FirstDiv = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[1]");

    protected By ServicesSection_Services_H2Header = By.xpath("/html/body/div[2]/div[1]/div/section[2]/h2");



    protected By ServicesSection_BusinessAnalysisParagraphLocator = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[1]/div[2]/p");
    protected By ServicesSection_BusinessAnalysisH3HeaderLocator = By.xpath("//h3[text()='Business Analysis']");
    protected By ServicesSection_BusinessAnalysisReadMoreButton = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[1]/div[2]/a/span[1]/span");

    protected By ServicesSection_ProductDesignParagraphLocator = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[2]/div[2]/p");
    protected By ServicesSection_ProductDesignH3HeaderLocator = By.xpath("//h3[text()='Product Design']");
    protected By ServicesSection_ProductDesignReadMoreButton = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[2]/div[2]/a/span[1]/span");

    protected By ServicesSection_DevelopmentParagraphLocator = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[3]/div[2]/p");
    protected By ServicesSection_DevelopmentH3HeaderLocator = By.xpath("//h3[text()='Development']");
    protected By ServicesSection_DevelopmentReadMoreButton = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[3]/div[2]/a/span[1]/span");

    protected By ServicesSection_QualityAssuranceParagraphLocator = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[4]/div[2]/p");
    protected By ServicesSection_QualityAssuranceH3HeaderLocator = By.xpath("//h3[text()='Quality Assurance']");
    protected By ServicesSection_QualityAssuranceReadMoreButton = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[4]/div[2]/a/span[1]/span");

    protected By ServicesSection_SupportParagraphLocator = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[5]/div[2]/p");
    protected By ServicesSection_SupportH3HeaderLocator = By.xpath("//h3[text()='Support']");
    protected By ServicesSection_SupportReadMoreButton = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div[5]/div[2]/a/span[1]/span");

    protected By ServicesSectionCommonParagraphLocator = By.xpath("/html/body/div[2]/div[1]/div/section[2]/div/div[2]/p");


    protected By ServicesSection_ReadMoreButton_CommonLocator = By.xpath("//span[@class = 'cta-ripple__ripple']");




    protected String ServicesBusinessAnalysisSectionParagraphText ="Think first is a credo of the Business Analysis at Envion Software. The team of professional specialists will learn about your product, the marking it will be launching and prospects. Business Analyst will be working directly with you: gather the requirements, create Specifications, select a methodology. One word – build a skeleton of the project and the flow. He will be the point of call if you have new ideas, changes, thoughts. Business Analyst&nbsp;is responsible for creating new models that support business decisions by working closely with financial reporting and IT teams to establish initiatives and strategies to improve importing and to optimize costs.";

    protected String ServicesProductDesignSectionParagraphText = "The team of experienced &amp; professional&nbsp;Product Designers go hand in hand with Business Analysts and learn about the end-users of your product. This is the key to the successful product, which we will use to create UI &amp; UX.&nbsp;Product Designers at Envion Software attempt to solve real problems for real people by using both empathy and knowledge of their prospective customers’ habits, behaviors, frustrations, needs, and wants.";

    protected String ServicesDevelopmentSectionParagraphText = "Envion Software is proud to have onboard strong high-professional engineers. At the&nbsp;Implementation phase your dedicated team will be&nbsp;occupied with encoding. We will make sure you will see interim results and all changes will be taken into consideration. Our developers will meet all of the requirements that were originally specified in the definition phase.";

    protected String ServicesQualityAssuranceSectionParagraphText = "Software testing services ensure the company software is fully functional, stable, reliable, secure, and user-friendly. Envion Software company with development and quality assurance has a large experience,&nbsp;and we are ready to take up a testing project of any scale and complexity, introduce an efficient quality assurance process, and enhance your software quality management strategy.";

    protected String ServicesSupportSectionParagraphText = "At this phase, your dedicated team supports your product after it’s been released. Business Analysts have a&nbsp;full immersion in getting feedback from the end-users, create a plan for further development in order to achieve the best result, and bring your product to out of competition level!";



    protected By OurClientsSection_OurClients_H2Header = By.xpath("/html/body/div[2]/div[1]/div/section[3]/div[1]/h2");
    protected By OurClientsSection_OurClients_Paragraph = By.xpath("/html/body/div[2]/div[1]/div/section[3]/div[1]/p");
    protected String OurClientsSection_OurClients_Paragraph_Text = "Our clients are top international companies with many years of experience, small teams, and even startups without full-fledged formed teams inside. We take on various roles on the road to product delivery and a high level of service for our customers. Our team is ready to take over at any stage of project development.";
    protected By ClientItem = By.cssSelector("body > div.site-wrapper > div.scroll-content > div > section.clients.pt20.container-md > div.clients__body > div.clients__desktop-list > div > div");
    protected By ClientLogo = By.cssSelector("body > div.site-wrapper > div.scroll-content > div > section.clients.pt20.container-md > div.clients__body > div.clients__desktop-list > div > div > img");


    //Collection of H2 headers locators
    List<WebElement>H2 =  new ArrayList<>();
    //Collection of H2 Headers values
    List<String>H2Texts =  new ArrayList<>();

    //Collection of H3 headers locators
    List<WebElement>H3 =  new ArrayList<>();
    //Collection of H3 headers values from Industries Section
    List<String>IndustriesH3Texts =  new ArrayList<>();
    //Collection of H3 headers values from Services Section
    List<String>ServicesH3Texts =  new ArrayList<>();

    //Collection of paragraphs locators from Industries Section
    List<WebElement>IndustrySectionParagraphs =  new ArrayList<>();
    //Collection of paragraphs values  from Industries Section
    List<String>IndustrySectionParagraphsTexts =  new ArrayList<>();

    //Collection of paragraphs locators from Services Section
    List<WebElement>ServicesSectionParagraphs =  new ArrayList<>();
    //Collection of paragraphs values  from Services Section
    List<String>ServicesSectionParagraphsTexts =  new ArrayList<>();

    //Collection of paragraphs locators from Services Section
    List<WebElement>ClientLogos =  new ArrayList<>();
    //Collection of sizes of client Logos from Our Clients Section
    List<Dimension>ClientLogosSizes =  new ArrayList<>();


    //Collection of Divs from Our Clients Section
    List<WebElement> ClientItems =  new ArrayList<>();
    //Collection of sizes of Divs from Our Clients Section
    List<Dimension> ClientItemsSizes =  new ArrayList<>();






/*    public boolean checkTextOfScrollableSection(By Element)
    {
        String getH3Heading = driver.findElement(Element).getAttribute("textContent");
        boolean isTabSwitched = Arrays.asList(TabH3Headers).contains(getH3Heading);
        return isTabSwitched;
    }*/


    @Step
    public boolean checkH2HeadersQuantity(int quantity) throws InterruptedException {

        H2.addAll(driver.findElements(new By.ByTagName("h2")));
        int size = H2.size();
        boolean bool =  size == quantity;
        return bool;

    }

    @Step
    public boolean checkH2HeaderNumberMatchesWithText(int number,String ExpectedText) throws InterruptedException {

        H2.addAll(driver.findElements(new By.ByTagName("h2")));
        int size = H2.size();

        for(int i = 0; i < size; i++ )
        {
            H2Texts.add(H2.get(i).getAttribute("textContent"));
        }
        String actual = H2Texts.get(number - 1).trim();
        boolean bool = actual.equals(ExpectedText);
        return bool;
    }

    @Step
    public boolean checkAllH3HeadersQuantity(int quantity) throws InterruptedException {

        H3.addAll(driver.findElements(new By.ByTagName("h3")));
        int size = H3.size();
        boolean bool =  size == quantity;
        return bool;
    }

    @Step
    public boolean check_H3Headers_Quantity_IndustriesTab(int number) throws InterruptedException {

        H3.addAll(driver.findElements(new By.ByTagName("h3")));
        for(int i = 0; i < 10; i++ )
        {
            IndustriesH3Texts.add(H3.get(i).getAttribute("textContent"));
        }
        boolean bool = IndustriesH3Texts.size() == number;
        return bool;
    }
    @Step
    public boolean check_H3Headers_Quantity_ServicesTab(int number) throws InterruptedException {

        H3.addAll(driver.findElements(new By.ByTagName("h3")));
        for(int i = 22; i < 27; i++ )
        {
            ServicesH3Texts.add(H3.get(i).getAttribute("textContent"));
        }
        boolean bool = ServicesH3Texts.size() == number;
        return bool;
    }

    @Step
    public boolean checkIndustriesH3HeaderNumberMatchesWithText(int number,String ExpectedText) throws InterruptedException {

        H3.addAll(driver.findElements(new By.ByTagName("h3")));

        for(int i = 0; i < 10; i++ )
        {
            IndustriesH3Texts.add(H3.get(i).getAttribute("textContent"));
        }
        String actual = IndustriesH3Texts.get(number - 1).trim();
        boolean bool = actual.equals(ExpectedText);
        return bool;
    }

    @Step
    public boolean checkServicesH3HeaderNumberMatchesWithText(int number,String ExpectedText) throws InterruptedException {

        H3.addAll(driver.findElements(new By.ByTagName("h3")));

        for(int i = 21; i < 27; i++ )
        {
            ServicesH3Texts.add(H3.get(i).getAttribute("textContent"));
        }
        String actual = ServicesH3Texts.get(number - 1).trim();
        boolean bool = actual.equals(ExpectedText);
        return bool;
    }

    @Step
    public boolean checkParagraphsQuantity_IndustriesTab(int quantity) throws InterruptedException {

        IndustrySectionParagraphs.addAll(driver.findElements(ScrollableSectionCommonTextDivLocator));
        int size = IndustrySectionParagraphs.size();
        boolean bool =  size == quantity;
        return bool;

    }

    @Step
    public boolean checkParagraphsNumberMatchesWithText_IndustriesTab(int number,String expected) throws InterruptedException {

        IndustrySectionParagraphs.addAll(driver.findElements(ScrollableSectionCommonTextDivLocator));
        int size = IndustrySectionParagraphs.size();

        for(int i = 0; i < size; i++ )
        {
            IndustrySectionParagraphsTexts.add(IndustrySectionParagraphs.get(i).getAttribute("innerHTML"));
        }
        String actual = IndustrySectionParagraphsTexts.get(number - 1);
        boolean bool = actual.equals(expected);
        return bool;

    }

    @Step
    public boolean checkParagraphsQuantity_ServicesSection(int quantity) throws InterruptedException {

        ServicesSectionParagraphs.addAll(driver.findElements(ServicesSectionCommonParagraphLocator));
        int size = ServicesSectionParagraphs.size();
        boolean bool =  size == quantity;
        return bool;

    }

    @Step
    public boolean checkParagraphsNumberMatchesWithText_ServicesSection(int number,String ExpectedText) throws InterruptedException {

        ServicesSectionParagraphs.addAll(driver.findElements(ServicesSectionCommonParagraphLocator));
        int size = ServicesSectionParagraphs.size();

        for(int i = 0; i < size; i++ )
        {
            ServicesSectionParagraphsTexts.add(ServicesSectionParagraphs.get(i).getAttribute("innerHTML"));
        }
        String actual = ServicesSectionParagraphsTexts.get(number - 1);
        boolean bool = actual.equals(ExpectedText);
        return bool;

    }


    @Step
    public boolean checkClientItems_Quantity_OurClientsSection(int quantity) throws InterruptedException {
        ClientItems.addAll(driver.findElements(ClientItem));
        int size = ClientItems.size();
        boolean bool =  size == quantity;
        return bool;

    }


    @Step
    public boolean checkClientLogos_Quantity_OurClientsSection(int quantity) throws InterruptedException {

        ClientLogos.addAll(driver.findElements(ClientLogo));
        int size = ClientLogos.size();
        boolean bool =  size == quantity;
        return bool;

    }

    @Step
    public boolean check_All_Client_Items_Have_theSame_Size(Dimension expected) throws InterruptedException {

        boolean bool = false;
        ClientItems.addAll(driver.findElements(ClientItem));
        int size = ClientItems.size();

        for(int i = 0; i < size; i++ ) {
            ClientItemsSizes.add(ClientItems.get(i).getSize());
            Dimension actual =  ClientItemsSizes.get(i);
            bool = actual.equals(expected);
        }
        return bool;
    }

    @Step
    public boolean check_All_Client_Logos_Have_theSame_Size(Dimension expected) throws InterruptedException {

        boolean bool = false;
        ClientLogos.addAll(driver.findElements(ClientLogo));
        int size = ClientLogos.size();

        for(int i = 0; i < size; i++ ) {
            ClientLogosSizes.add( ClientLogos.get(i).getSize());
            Dimension actual =  ClientLogosSizes.get(i);
            bool = actual.equals(expected);
        }
        return bool;
    }

    @Step
    public boolean check_Logos_Number_Matches_With_Dimension(int number,Dimension expected) throws InterruptedException {

        ClientLogos.addAll(driver.findElements(ClientLogo));
        int size = ClientLogos.size();

        for(int i = 0; i < size; i++ ) {
            ClientLogosSizes.add( ClientLogos.get(i).getSize());
        }
        Dimension actual = ClientLogosSizes.get(number - 1);
        boolean bool = actual.equals(expected);
        return bool;
    }







/*    public String gav(int number) throws InterruptedException {

        ServicesSectionParagraphs.addAll(driver.findElements(ServicesSectionCommonParagraphLocator));
        int size = ServicesSectionParagraphs.size();

        for(int i = 0; i < size; i++ )
        {
            ServicesSectionParagraphsTexts.add(ServicesSectionParagraphs.get(i).getAttribute("innerHTML"));
        }
        String actual = ServicesSectionParagraphsTexts.get(number - 1).replace("\\u00A0","");
        return actual;

    }*/

    public String  gavgav(int number) throws InterruptedException {

        IndustrySectionParagraphs.addAll(driver.findElements(ScrollableSectionCommonTextDivLocator));
        int size = IndustrySectionParagraphs.size();

        for(int i = 0; i < size; i++ )
        {
            IndustrySectionParagraphsTexts.add(IndustrySectionParagraphs.get(i).getAttribute("innerHTML"));
        }
        String actual = IndustrySectionParagraphsTexts.get(number - 1);
        return actual;

    }



}




























