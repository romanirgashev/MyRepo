import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPageTests extends TestBase{


    private MainPage mainPage;
    private AboutUsPage aboutUsPage;
    private ExpertisePage expertisePage;
    private HowWeWorkSupport howWeWorkSupport;




    @Before
    public void SetUp() {
        setUp("chrome","https://envionsoftware.com");
        mainPage = new MainPage(driver);
        expertisePage = new ExpertisePage(driver);
        aboutUsPage = new AboutUsPage(driver);
        howWeWorkSupport = new HowWeWorkSupport(driver);
    }


    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    public void Company_Name_Header_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.CompanyNameHeader);
        captureScreen();
        Assert.assertTrue(bool);
    }

    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    public void Company_Name_Header_Has_Correct_Text_expect_pass() {
        String actual = getTextOfElement(mainPage.CompanyNameHeader);
        captureScreen();
        Assert.assertEquals("Envion software",actual);
    }

    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    public void Development_Header_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.DevelopmentHeader);
        Assert.assertTrue(bool);
    }

    @Test
    public void Development_Header_Has_Correct_Text_expect_pass() {
        String actual = getTextOfElement(mainPage.DevelopmentHeader);
        Assert.assertEquals("Development with spirit",actual);
    }

    @Test
    public void Company_Logo_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.CompanyLogo);
        Assert.assertTrue(bool);
    }

    @Test
    public void Company_Logo_Has_Correct_Link_expect_pass() {
        clickElement(mainPage.CompanyLogo);
        boolean bool = checkURLCorrectness("https://envionsoftware.com/");
        Assert.assertTrue(bool);
    }

    @Test
    public void Expertise_Image_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.ExpertiseImage);
        Assert.assertTrue(bool);
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    public void Expertise_Image_Has_Correct_Dimension_expect_pass() {
        Dimension actual = getDimensionOfElement(mainPage.ExpertiseImage);
        Dimension expected = new Dimension(350,280);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Expertise_Image_Has_Correct_Link_expect_pass()  {
        clickElement(mainPage.gamburgerMenuButton);
        clickElement(mainPage.AboutUsButtonFromGamburgerMenu);
        boolean bool =  checkURLCorrectness(aboutUsPage.AboutUsPageURL);
        Assert.assertTrue(bool);
    }


    @Test
    public void Gamburger_Menu_Button_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.gamburgerMenuButton);
        Assert.assertTrue(bool);
    }

    @Test
    public void Gamburger_Menu_Button_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.gamburgerMenuButton);
        Assert.assertEquals("menu",actual);
    }



    @Test
    public void Gamburger_Menu_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        boolean bool = checkPresenseOfElement(mainPage.gamburgerMenu);
        Assert.assertTrue(bool);
    }


    @Epic(value = "checkchek")
    @Severity(value = SeverityLevel.TRIVIAL)
    @Test
    public void Industry_Header_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        boolean bool = checkPresenseOfElement(mainPage.IndustryH2Header);
        Assert.assertTrue(bool);
    }


    @Test
    public void First_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionFirstH3Header);
        Assert.assertEquals("Healthcare",actual);
    }

    @Test
    public void Second_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionSecondH3Header);
        Assert.assertEquals("CRM Systems",actual);
    }

    @Test
    public void Third_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionThirdH3Header);
        Assert.assertEquals("Data Science",actual);
    }

    @Test
    public void Fourth_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionFourthH3Header);
        Assert.assertEquals("Fitness & Wellness",actual);
    }

    @Test
    public void Fifth_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionFifthH3Header);
        Assert.assertEquals("GPS Navigation",actual);
    }

    @Test
    public void Sixth_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionSixthH3Header);
        Assert.assertEquals("Marketing & Advertising",actual);
    }

    @Test
    public void Seventh_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionSeventhH3Header);
        Assert.assertEquals("Media & Education",actual);
    }

    @Test
    public void Eighth_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionEighthH3Header);
        Assert.assertEquals("Natural Language Processing",actual);
    }

    @Test
    public void Ninth_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionNinthH3Header);
        Assert.assertEquals("Social Media",actual);
    }

    @Test
    public void Tenth_Industry_H3_Header_Has_Correct_Text_expect_pass()  {
       String actual = getTextOfElement(mainPage.ScrollableSectionTenthH3Header);
        Assert.assertEquals("Travel & Hospitality",actual);
    }



/*    @Test
    public void Switch_to_DataScienceTab_byClick_toNext_expect_pass() throws InterruptedException {
        scrollToElement(1);
        clickElement(mainPage.ScrollableSectionSecondTabNextDiv);
        boolean bool = checkPresenseOfElement(mainPage.ScrollableSectionThirdTabNextDiv);
        Assert.assertEquals(true,bool);
    }

    @Test
    public void Switch_to_HealthcareTab_byClick_toPrevious_expect_pass() throws InterruptedException {
        scrollToElement(1);
        clickElement(mainPage.ScrollableSectionSecondImage);
        boolean bool = mainPage.checkTextOfScrollableSection(mainPage.ScrollableSectionFirstH3Header);
        Assert.assertTrue(bool);
    }*/


    @Feature(value = "cont")
    @Test
    public void Main_Page_Contains_3_H2Headers_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkH2HeadersQuantity(3);
        Assert.assertTrue(bool);
    }

    @Story(value = "H2 Headers text check")
    @Test
    public void first_H2_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkH2HeaderNumberMatchesWithText(1, "Industries");
        Assert.assertTrue(bool);

    }

    @Story(value = "H2 Headers text check")
    @Test
    public void second_H2_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkH2HeaderNumberMatchesWithText(2, "Services");
        Assert.assertTrue(bool);
    }
    @Test
    public void Services_Header_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_Services_H2Header);
        Assert.assertTrue(bool);
    }

    @Story(value = "H2 Headers text check")
    @Test
    public void third_H2_Header_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkH2HeaderNumberMatchesWithText(3, "Our clients");
        Assert.assertTrue(bool);
    }

    @Test
    public void OurClients_Header_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(5);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(mainPage.OurClientsSection_OurClients_H2Header);
        Assert.assertTrue(bool);
    }


    @Test
    public void Main_Page_Contains_27_H3Headers_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkAllH3HeadersQuantity(27);
        Assert.assertTrue(bool);
    }

    @Test
    public void IndustriesTab_Contains_10_Original_H3Headers_expect_pass() throws InterruptedException {
        boolean bool = mainPage.check_H3Headers_Quantity_IndustriesTab(10);
        Assert.assertTrue(bool);
    }

    @Test
    public void ServicesTab_Contains_5_Original_H3Headers_expect_pass() throws InterruptedException {
        boolean bool = mainPage.check_H3Headers_Quantity_ServicesTab(5);
        Assert.assertTrue(bool);
    }

    @Test
    public void first_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(1, "Travel & Hospitality");
        Assert.assertTrue(bool);
    }

    @Test
    public void second_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(2, "Healthcare");
        Assert.assertTrue(bool);
    }

    @Test
    public void third_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(3, "CRM Systems");
        Assert.assertTrue(bool);
    }

    @Test
    public void fourth_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(4, "Data Science");
        Assert.assertTrue(bool);
    }

    @Test
    public void fifth_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(5, "Fitness & Wellness");
        Assert.assertTrue(bool);
    }

    @Test
    public void sixth_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(6, "GPS Navigation");
        Assert.assertTrue(bool);
    }

    @Test
    public void seventh_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(7, "Marketing & Advertising");
        Assert.assertTrue(bool);
    }

    @Test
    public void eighth_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(8, "Media & Education");
        Assert.assertTrue(bool);
    }

    @Test
    public void ninth_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(9, "Natural Language Processing");
        Assert.assertTrue(bool);
    }

    @Test
    public void tenth_IndustryTab_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(10, "Social Media");
        Assert.assertTrue(bool);
    }

    @Test
    public void first_Services_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkServicesH3HeaderNumberMatchesWithText(1, "Business Analysis");
        Assert.assertTrue(bool);
    }

    @Test
    public void second_Services_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkServicesH3HeaderNumberMatchesWithText(2, "Product Design");
        Assert.assertTrue(bool);
    }

    @Test
    public void third_Services_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkServicesH3HeaderNumberMatchesWithText(3, "Development");
        Assert.assertTrue(bool);
    }

    @Test
    public void fourth_Services_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkServicesH3HeaderNumberMatchesWithText(4, "Quality Assurance");
        Assert.assertTrue(bool);
    }

    @Test
    public void fifth_Services_H3_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkServicesH3HeaderNumberMatchesWithText(5, "Support");
        Assert.assertTrue(bool);
    }



    @Test
    public void IndustryTab_Contains_10_Paragraphs_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsQuantity_IndustriesTab(10);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_First_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(1, mainPage.ScrollableHealthcareSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Second_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(2, mainPage.ScrollableCRMSystemsSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Third_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(3, mainPage.ScrollableDataScienceSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Fourth_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(4, mainPage.ScrollableFitnessSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Fifth_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(5, mainPage.ScrollableGPSNavigationSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Sixth_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(6, mainPage.ScrollableMarketingSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Seventh_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(7, mainPage.ScrollableMediaAndEducationSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Eighth_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(8, mainPage.ScrollableNaturalLanguageSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Ninth_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(9, mainPage.ScrollableSocialMediaSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Tenth_IndustryTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(10, mainPage.ScrollableTravelAndHospitalitySectionParagraphText);
        Assert.assertTrue(bool);
    }


    @Test
    public void Services_Section_Contains_5_Paragraphs() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsQuantity_ServicesSection(5);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_First_ServicesTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(1,mainPage.ServicesBusinessAnalysisSectionParagraphText);
        Assert.assertTrue(bool);

    }

    @Test
    public void paragraph_Of_Second_ServicesTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(2,mainPage.ServicesProductDesignSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Third_ServicesTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(3,mainPage.ServicesDevelopmentSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Fourth_ServicesTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(4,mainPage.ServicesQualityAssuranceSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void paragraph_Of_Fifth_ServicesTab_Has_Correct_Text_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(5,mainPage.ServicesSupportSectionParagraphText);
        Assert.assertTrue(bool);
    }

    @Test
    public void Business_Analysis_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_BusinessAnalysisParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Business_Analysis_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_BusinessAnalysisH3HeaderLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Business_Analysis_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_BusinessAnalysisReadMoreButton);
        Assert.assertTrue(bool);
    }

    @Test
    public void Business_Analysis_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        clickElement(mainPage.ServicesSection_BusinessAnalysisReadMoreButton);
        boolean bool = checkURLCorrectness("https://envionsoftware.com/how-we-work/#tab1");
        Assert.assertTrue(bool);
    }

    @Test
    public void Click_On_Business_Analysis_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        clickElement(mainPage.ServicesSection_BusinessAnalysisReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.BusinessAnalysis_TabSwither);
        WebDriverWait(howWeWorkSupport.BusinessAnalysis_TabSwither);
        captureScreen();
        Assert.assertTrue(bool);
    }

    @Test
    public void Product_Design_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_ProductDesignParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Product_Design_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_ProductDesignH3HeaderLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Product_Design_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_ProductDesignReadMoreButton);
        Assert.assertTrue(bool);
    }

    @Test
    public void Product_Design_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        clickElement(mainPage.ServicesSection_ProductDesignReadMoreButton);
        boolean bool = checkURLCorrectness("https://envionsoftware.com/how-we-work/#tab2");
        Assert.assertTrue(bool);
    }

    @Test
    public void Click_On_Product_Design_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        clickElement(mainPage.ServicesSection_ProductDesignReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.ProductDesign_TabSwither);
        Assert.assertTrue(bool);
    }

    @Test
    public void Development_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_DevelopmentParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Development_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_DevelopmentH3HeaderLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Development_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_DevelopmentReadMoreButton);
        Assert.assertTrue(bool);
    }

    @Test
    public void Development_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(10);
        clickElement(mainPage.ServicesSection_DevelopmentReadMoreButton);
        boolean bool = checkURLCorrectness("https://envionsoftware.com/how-we-work/#tab3");
        Assert.assertTrue(bool);
    }

    @Test
    public void Click_On_Development_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        clickElement(mainPage.ServicesSection_DevelopmentReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.Development_TabSwither);
        Assert.assertTrue(bool);
    }


    @Test
    public void Quality_Assurance_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
            boolean bool = checkPresenseOfElement(mainPage.ServicesSection_QualityAssuranceParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Quality_Assurance_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_QualityAssuranceH3HeaderLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Quality_Assurance_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_QualityAssuranceReadMoreButton);
        Assert.assertTrue(bool);
    }

    @Test
    public void Quality_Assurance_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        clickElement(mainPage.ServicesSection_QualityAssuranceReadMoreButton);
        boolean bool = checkURLCorrectness("https://envionsoftware.com/how-we-work/#tab4");
        Assert.assertTrue(bool);
    }

    @Test
    public void Click_On_Quality_Assurance_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        clickElement(mainPage.ServicesSection_QualityAssuranceReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.QualityAssurance_TabSwither);
        Assert.assertTrue(bool);
    }

    @Test
    public void Support_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_QualityAssuranceParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Support_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_QualityAssuranceH3HeaderLocator);
        Assert.assertTrue(bool);
    }

    @Test
    public void Support_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_QualityAssuranceReadMoreButton);
        Assert.assertTrue(bool);
    }


    @Test
    public void Support_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(5);
        clickElement(mainPage.ServicesSection_SupportReadMoreButton);
        boolean bool = checkURLCorrectness("https://envionsoftware.com/how-we-work/#tab5");
        Assert.assertTrue(bool);
    }

    @Test
    public void Click_On_Support_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(5);
        clickElement(mainPage.ServicesSection_SupportReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.Support_TabSwither);
        Assert.assertTrue(bool);
    }

    @Test
    public void OurClients_Paragraph_From_OurClients_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.OurClientsSection_OurClients_Paragraph);
        Assert.assertTrue(bool);
    }

    @Test
    public void OurClients_Paragraph_From_OurClients_Section_Has_Correct_Text_expect_pass() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(1);
        String actual = getTextOfElement(mainPage.OurClientsSection_OurClients_Paragraph);
        Assert.assertEquals(mainPage.OurClientsSection_OurClients_Paragraph_Text,actual);
    }







    @Test
    public void OurClients_Section_Contains_38_Client_ITEMS_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkClientItems_Quantity_OurClientsSection(19);
        Assert.assertTrue(bool);
    }

    @Test
    public void OurClients_Section_Contains_38_Client_LOGOS_expect_pass() throws InterruptedException {
        boolean bool = mainPage.checkClientLogos_Quantity_OurClientsSection(19);
        Assert.assertTrue(bool);
    }

    @Test
    public void Client_ITEMS_Have_Same_Dimensions_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension( 141,100);
        boolean bool = mainPage.check_All_Client_Items_Have_theSame_Size(expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void Client_LOGOS_Have_Different_Dimensions_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension( 232,70);
        boolean bool = mainPage.check_All_Client_Logos_Have_theSame_Size(expected);
        Assert.assertFalse(bool);
    }

    @Test
    public void first_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,30);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(1,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void second_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,26);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(2,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void third_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,15);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(3,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void fourth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,23);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(4,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void fifth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,22);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(5,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void sixth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,20);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(6,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void seventh_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,52);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(7,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void eighth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,36);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(8,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void ninth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,31);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(9,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void tenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,23);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(10,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void eleventh_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(81,30);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(11,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void twelfth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,36);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(12,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void thirteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(87,79);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(13,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void fourteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,36);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(14,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void fifteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,39);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(15,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void sixteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,36);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(16,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void seventeenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(114,57);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(17,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void eighteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,25);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(18,expected);
        Assert.assertTrue(bool);
    }

    @Test
    public void nineteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,28);
        boolean bool = mainPage.check_Logos_Number_Matches_With_Dimension(19,expected);
        Assert.assertTrue(bool);
    }







/*    @Test
    public void gav() throws InterruptedException {
        String actual = mainPage.gav(2);
        String expected = mainPage.ServicesProductDesignSectionParagraphText;
        System.out.println(actual);
        System.out.println(expected);
        Assert.assertEquals(expected,actual);
    }*/





    @After
    public void TearDown(){
        tearDown();
    }






}
