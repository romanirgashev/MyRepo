import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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

/*
    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Фоновая картинка на стартовой странице отображается")
    public void Background_Image_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.BackgroundImage);
        Assert.assertTrue(bool);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Test
    @DisplayName("Разрешение фоновой картинки на стартовой странице соответствует требованиям")
    public void Background_Image_Has_Correct_Dimension_expect_pass()  {
        Dimension actual = getDimensionOfElement(mainPage.BackgroundImage);
        Dimension expected = new Dimension(1536,710);
        Assert.assertEquals(expected,actual);
    }


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок с названием компании отображен на главной странице")
    public void Company_Name_Header_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.CompanyNameHeader);
        makeScreenshot();
        Assert.assertTrue(bool);
    }


    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок с названием компании содержит текст \"Envion software\"")
    public void Company_Name_Header_Has_Correct_Text_expect_pass() {
        String actual = getTextOfElement(mainPage.CompanyNameHeader);
        makeScreenshot();
        Assert.assertEquals("Envion software",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок \"Development\" отображается на главной странице")
    public void Development_Header_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.DevelopmentHeader);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок \"Development\" содержит текст , соответствующий требованиям ")
    public void Development_Header_Has_Correct_Text_expect_pass() {
        String actual = getTextOfElement(mainPage.DevelopmentHeader);
        Assert.assertEquals("Development with spirit",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Логотип компании отображен на главной странице")
    public void Company_Logo_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.CompanyLogo);
        Assert.assertTrue(bool);
    }

    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Логотип компании на стартовой странице содержит ссылку, соответствующую требованиям")
    public void Company_Logo_Has_Correct_Link_expect_pass() {
        clickElement(mainPage.CompanyLogo);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Картинка \"Expertise\" отображается на главной странице")
    public void Expertise_Image_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.ExpertiseImage);
        Assert.assertTrue(bool);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Test
    @DisplayName("Разрешение картинки \"Expertise\" на стартовой странице соответствует требованиям")
    @Severity(SeverityLevel.CRITICAL)
    public void Expertise_Image_Has_Correct_Dimension_expect_pass() {
        Dimension actual = getDimensionOfElement(mainPage.ExpertiseImage);
        Dimension expected = new Dimension(350,280);
        Assert.assertEquals(expected,actual);
    }

*/
/*    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Изображение \"Expertise\" на стартовой странице содержит ссылку, соответствующую требованиям")
    public void Expertise_Image_Has_Correct_Link_expect_pass()  {
        clickElement(mainPage.ExpertiseImage);
        String actual = checkURLCorrectness();
        Assert.assertEquals(expertisePage.ExpertisePageURL,actual);
    }*//*



    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Menu\" отображена на главной странице")
    public void Gamburger_Menu_Button_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.gamburgerMenuButton);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"Menu\" в гамбургер меню на главной странице имеет название соответствующее требованиям")
    public void Gamburger_Menu_Button_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.gamburgerMenuButton);
        Assert.assertEquals("",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Меню отображено на главной странице после нажатия на кнопку \"Menu\"")
    public void Gamburger_Menu_Is_Opened_without_Scroll_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        boolean bool = checkPresenseOfElement(mainPage.gamburgerMenu);
        Assert.assertTrue(bool);
    }


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Меню отображено на главной странице после нажатия на кнопку \"Menu\" после скролла к боттому страницы")
    public void Gamburger_Menu_Is_Opened_with_Scroll_expect_pass() throws InterruptedException {
        scrollToElement(6);
        clickElement(mainPage.gamburgerMenuButton);
        boolean bool = checkPresenseOfElement(mainPage.gamburgerMenu);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Close Menu\" отображена в открытом гамбургер меню на главной странице вместо кнопки \"Menu\" ")
    public void Close_Gamburger_Menu_Button_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        boolean bool = checkPresenseOfElement(mainPage.CloseGamburgerMenuButton);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"Close Menu\" в гамбургер меню на главной странице имеет название соответствующее требованиям ")
    public void Close_Gamburger_Menu_Button_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.CloseGamburgerMenuButton);
        Assert.assertEquals("",actual);
    }


    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Название \"menu\" отображено в открытом гамбургер меню")
    public void Menu_Name_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        WebDriverWait(mainPage.MenuNameFromGamburgerMenu);
        boolean bool = checkPresenseOfElement(mainPage.MenuNameFromGamburgerMenu);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"Close Menu\" на главной странице имеет название соответствующее требованиям ")
    public void Menu_Name_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.MenuNameFromGamburgerMenu);
        Assert.assertEquals("Menu",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Текст \"Get in touch\" отображен в открытом гамбургер меню на главной странице")
    public void Get_In_Touch_Text_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        WebDriverWait(mainPage.GetInTouchInscriptionFromGamburgerMenu);
        boolean bool = checkPresenseOfElement(mainPage.GetInTouchInscriptionFromGamburgerMenu);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст \"Get in touch\" в гамбургер меню на главной странице имеет название соответствующее требованиям ")
    public void Get_In_Touch_Text_Has_Correct_Value_expect_pass()  {
        String actual = getTextOfElement(mainPage.GetInTouchInscriptionFromGamburgerMenu);
        Assert.assertEquals("Get in touch",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Почтовый адрес \"hello@envionsoftware.com\" отображен в открытом гамбургер меню на главной странице")
    public void Company_Email_Adress_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        WebDriverWait(mainPage.EmailAdressFromGamburgerMenu);
        boolean bool = checkPresenseOfElement(mainPage.EmailAdressFromGamburgerMenu);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст \"Get in touch\" в гамбургер меню на главной странице имеет название соответствующее требованиям ")
    public void Company_Email_Adress_Has_Correct_Value_expect_pass()  {
        String actual = getTextOfElement(mainPage.EmailAdressFromGamburgerMenu);
        Assert.assertEquals("hello@envionsoftware.com",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Home\" отображена в открытом гамбургер меню на главной странице")
    public void Home_Button_From_GambMenu_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        WebDriverWait(mainPage.HomeButtonFromGamburgerMenu);
        boolean bool = checkPresenseOfElement(mainPage.HomeButtonFromGamburgerMenu);
        Assert.assertTrue(bool);
    }


    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"Home\" в гамбургер меню имеет название соответствующее требованиям ")
    public void Home_Button_From_GambMenu_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.HomeButtonFromGamburgerMenu);
        Assert.assertEquals("Home",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"About Us\" отображена в открытом гамбургер меню на главной странице")
    public void AboutUs_Button_From_GambMenu_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        WebDriverWait(mainPage.AboutUsButtonFromGamburgerMenu);
        boolean bool = checkPresenseOfElement(mainPage.AboutUsButtonFromGamburgerMenu);
        Assert.assertTrue(bool);
    }


    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"About Us\" в гамбургер меню имеет название соответствующее требованиям ")
    public void AboutUs_Button_From_GambMenu_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.AboutUsButtonFromGamburgerMenu);
        Assert.assertEquals("About us",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"How we work\" отображена в открытом гамбургер меню на главной странице")
    public void HowWeWork_Button_From_GambMenu_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        WebDriverWait(mainPage.HowWeWorkButtonFromGamburgerMenu);
        boolean bool = checkPresenseOfElement(mainPage.HowWeWorkButtonFromGamburgerMenu);
        Assert.assertTrue(bool);
    }


    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"How we work\" в гамбургер меню имеет название соответствующее требованиям ")
    public void HowWeWork_Button_From_GambMenu_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.HowWeWorkButtonFromGamburgerMenu);
        Assert.assertEquals("How we work",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Portfolio\" отображена в открытом гамбургер меню на главной странице")
    public void Portfolio_Button_From_GambMenu_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        WebDriverWait(mainPage.PortfolioButtonFromGamburgerMenu);
        boolean bool = checkPresenseOfElement(mainPage.PortfolioButtonFromGamburgerMenu);
        Assert.assertTrue(bool);
    }


    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"Portfolio\" в гамбургер меню имеет название соответствующее требованиям ")
    public void Portfolio_Button_From_GambMenu_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.PortfolioButtonFromGamburgerMenu);
        Assert.assertEquals("Portfolio",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Career\" отображена в открытом гамбургер меню на главной странице")
    public void Career_Button_From_GambMenu_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        WebDriverWait(mainPage.CareerButtonFromGamburgerMenu);
        boolean bool = checkPresenseOfElement(mainPage.CareerButtonFromGamburgerMenu);
        Assert.assertTrue(bool);
    }


    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"Career\" в гамбургер меню имеет название соответствующее требованиям ")
    public void Career_Button_From_GambMenu_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.CareerButtonFromGamburgerMenu);
        Assert.assertEquals("Career",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Get In Touch\" отображена в открытом гамбургер меню на главной странице")
    public void Get_In_Touch_Button_From_GambMenu_Is_Displayed_expect_pass() throws InterruptedException {
        clickElement(mainPage.gamburgerMenuButton);
        WebDriverWait(mainPage.GetInTouchButtonFromGamburgerMenu);
        boolean bool = checkPresenseOfElement(mainPage.GetInTouchButtonFromGamburgerMenu);
        Assert.assertTrue(bool);
    }


    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"Get In Touch\" в гамбургер меню имеет название соответствующее требованиям ")
    public void Get_In_Touch_Button_From_GambMenu_Has_Correct_Name_expect_pass()  {
        String actual = getTextOfElement(mainPage.GetInTouchButtonFromGamburgerMenu);
        Assert.assertEquals("Get in touch",actual);
    }

    @Epic("Цвет элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Кнопка \"Get In Touch\" в гамбургер меню имеет название соответствующее требованиям ")
    public void Background_Has_Correct_Color_expect_pass()  {
        String actual = getColorAs_HEX_OfElement(mainPage.BodyLocator);
        Assert.assertEquals("#001c33",actual);
    }










*/
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
    }*//*




    @Epic("Главная страница содержит корректное количество элементов одного типа")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Главная страница содержит 3 заголовка 2 порядка")
    public void Main_Page_Contains_3_H2Headers_expect_pass()  {
        int actual = mainPage.checkH2HeadersQuantity();
        Assert.assertEquals(3,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Первый заголовок второго порядка имеет название \"Industries\"")
    public void first_H2_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkH2HeaderNumberMatchesWithText(1);
        Assert.assertEquals("Industries",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок \"Industries\" отображается на главной странице")
    public void Industry_Header_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        boolean bool = checkPresenseOfElement(mainPage.IndustryH2Header);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Второй заголовок второго порядка имеет название \"Services\"")
    public void second_H2_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkH2HeaderNumberMatchesWithText(2);
        Assert.assertEquals("Services",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок \"Services\" отображается на главной странице")
    public void Services_Header_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_Services_H2Header);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Третий заголовок второго порядка имеет название \"Our Clients\"")
    public void third_H2_Header_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkH2HeaderNumberMatchesWithText(3);
        Assert.assertEquals("Our clients",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок \"Our Clients\" отображается на главной странице")
    public void OurClients_Header_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(5);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(mainPage.OurClientsSection_OurClients_H2Header);
        Assert.assertTrue(bool);
    }


    @Epic("Главная страница содержит корректное количество элементов одного типа")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Главная страница содержит 27 заголовка 3 порядка")
    public void Main_Page_Contains_27_H3Headers_expect_pass()  {
        int actual = mainPage.checkAllH3HeadersQuantity();
        Assert.assertEquals(27,actual);
    }

    @Epic("Главная страница содержит корректное количество элементов одного типа")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Раздел \"Industries\"на главной странице содержит 10 оригинальных заголовков 3 порядка")
    public void IndustriesTab_Contains_10_Original_H3Headers_expect_pass()  {
        int actual = mainPage.check_H3Headers_Quantity_IndustriesTab();
        Assert.assertEquals(10,actual);
    }


    @Epic("Главная страница содержит корректное количество элементов одного типа")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Раздел \"Services\"на главной странице содержит 5 оригинальных заголовков 3 порядка")
    public void ServicesTab_Contains_5_Original_H3Headers_expect_pass()  {
        int actual = mainPage.check_H3Headers_Quantity_ServicesTab();
        Assert.assertEquals(5,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Десятый заголовок 3 порядка из секции \"Industries\" содержит текст \"Travel & Hospitality\"")
    public void tenth_IndustryTab_H3_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(1);
        Assert.assertEquals("Travel & Hospitality",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Первый заголовок 3 порядка из секции \"Industries\" содержит текст \"Healthcare\"")
    public void first_IndustryTab_H3_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(2);
        Assert.assertEquals("Healthcare",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Второй заголовок 3 порядка из секции \"Industries\" содержит текст \"CRM Systems\"")
    public void second_IndustryTab_H3_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(3);
        Assert.assertEquals("CRM Systems",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Третий заголовок 3 порядка из секции \"Industries\" содержит текст \"Data Science\"")
    public void third_IndustryTab_H3_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(4);
        Assert.assertEquals("Data Science",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Четвертый заголовок 3 порядка из секции \"Industries\" содержит текст \"Fitness & Wellness\"")
    public void fourth_IndustryTab_H3_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(5);
        Assert.assertEquals("Fitness & Wellness",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Пятый заголовок 3 порядка из секции \"Industries\" содержит текст \"GPS Navigation\"")
    public void fifth_IndustryTab_H3_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(6);
        Assert.assertEquals("GPS Navigation",actual);;
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Шестой заголовок 3 порядка из секции \"Industries\" содержит текст \"Marketing & Advertising\"")
    public void sixth_IndustryTab_H3_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(7);
        Assert.assertEquals("Marketing & Advertising",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Седьмой заголовок 3 порядка из секции \"Industries\" содержит текст \"Media & Education\"")
    public void seventh_IndustryTab_H3_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(8);
        Assert.assertEquals("Media & Education",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Восьмой заголовок 3 порядка из секции \"Industries\" содержит текст \"Natural Language Processing\"")
    public void eighth_IndustryTab_H3_Has_Correct_Text_expect_pass()  {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(9);
        Assert.assertEquals("Natural Language Processing",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Восьмой заголовок 3 порядка из секции \"Industries\" содержит текст \"Social Media\"")
    public void ninth_IndustryTab_H3_Has_Correct_Text_expect_pass() {
        String actual = mainPage.checkIndustriesH3HeaderNumberMatchesWithText(10);
        Assert.assertEquals("Social Media",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Первый заголовок 3 порядка из секции \"Services\" содержит текст \"Business Analysis\"")
    public void first_Services_H3_Has_Correct_Text_expect_pass() {
        String actual = mainPage.checkServicesH3HeaderNumberMatchesWithText(1);
        Assert.assertEquals("Business Analysis",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Второй заголовок 3 порядка из секции \"Services\" содержит текст \"Product Design\"")
    public void second_Services_H3_Has_Correct_Text_expect_pass() {
        String actual = mainPage.checkServicesH3HeaderNumberMatchesWithText(2);
        Assert.assertEquals("Product Design",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Третий заголовок 3 порядка из секции \"Services\" содержит текст \"Development\"")
    public void third_Services_H3_Has_Correct_Text_expect_pass() {
        String actual = mainPage.checkServicesH3HeaderNumberMatchesWithText(3);
        Assert.assertEquals("Development",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Четвертый заголовок 3 порядка из секции \"Services\" содержит текст \"Quality Assurance\"")
    public void fourth_Services_H3_Has_Correct_Text_expect_pass() {
        String actual = mainPage.checkServicesH3HeaderNumberMatchesWithText(4);
        Assert.assertEquals("Quality Assurance",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Пятый заголовок 3 порядка из секции \"Services\" содержит текст \"Support\"")
    public void fifth_Services_H3_Has_Correct_Text_expect_pass() {
        String actual = mainPage.checkServicesH3HeaderNumberMatchesWithText(5);
        Assert.assertEquals("Support",actual);
    }



    @Epic("Главная страница содержит корректное количество элементов одного типа")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Раздел \"Industries\"на главной странице содержит 10 оригинальных описаний")
    public void IndustryTab_Contains_10_Articles_expect_pass()  {
        int actual = mainPage.checkParagraphsQuantity_IndustriesTab();
        Assert.assertEquals(10,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст первой статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_First_IndustryTab_Has_Correct_InnerHTML_expect_pass() {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(1);
        Assert.assertEquals(mainPage.ScrollableHealthcareSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст второй статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Second_IndustryTab_Has_Correct_InnerHTML_expect_pass()  {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(2);
        Assert.assertEquals(mainPage.ScrollableCRMSystemsSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст третьей статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Third_IndustryTab_Has_Correct_InnerHTML_expect_pass()  {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(3);
        Assert.assertEquals(mainPage.ScrollableDataScienceSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст четвертой статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Fourth_IndustryTab_Has_Correct_InnerHTML_expect_pass()  {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(4);
        Assert.assertEquals(mainPage.ScrollableFitnessSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст пятой статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Fifth_IndustryTab_Has_Correct_InnerHTML_expect_pass()  {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(5);
        Assert.assertEquals(mainPage.ScrollableGPSNavigationSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст шестой статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Sixth_IndustryTab_Has_Correct_InnerHTML_expect_pass() {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(6);
        Assert.assertEquals(mainPage.ScrollableMarketingSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст седьмой статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Seventh_IndustryTab_Has_Correct_InnerHTML_expect_pass()  {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(7);
        Assert.assertEquals(mainPage.ScrollableMediaAndEducationSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст восьмой статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Eighth_IndustryTab_Has_Correct_InnerHTML_expect_pass()  {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(8);
        Assert.assertEquals(mainPage.ScrollableNaturalLanguageSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст девятой статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Ninth_IndustryTab_Has_Correct_InnerHTML_expect_pass()  {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(9);
        Assert.assertEquals(mainPage.ScrollableSocialMediaSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст десятой статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Tenth_IndustryTab_Has_Correct_InnerHTML_expect_pass()  {
        String actual = mainPage.checkParagraphsNumberMatchesWithText_IndustriesTab(10);
        Assert.assertEquals(mainPage.ScrollableTravelAndHospitalitySectionParagraphText,actual);
    }


    @Epic("Главная страница содержит корректное количество элементов одного типа")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Раздел \"Services\"на главной странице содержит 5 оригинальных описаний")
    public void Services_Section_Contains_5_Paragraphs() {
        int actual = mainPage.checkParagraphsQuantity_ServicesSection();
        Assert.assertEquals(5,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст первой статьи из секции \"Services\" соответствует требованиям")
    public void paragraph_Of_First_ServicesTab_Has_Correct_InnerHTML_expect_pass() throws InterruptedException {
        String actual  = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(1);
        Assert.assertEquals(mainPage.ServicesBusinessAnalysisSectionParagraphText,actual);

    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст второй статьи из секции \"Services\" соответствует требованиям")
    public void paragraph_Of_Second_ServicesTab_Has_Correct_InnerHTML_expect_pass() throws InterruptedException {
        String actual  = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(2);
        Assert.assertEquals(mainPage.ServicesProductDesignSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст третьей статьи из секции \"Services\" соответствует требованиям")
    public void paragraph_Of_Third_ServicesTab_Has_Correct_InnerHTML_expect_pass() throws InterruptedException {
        String actual  = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(3);
        Assert.assertEquals(mainPage.ServicesDevelopmentSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @Flaky
    @DisplayName("Текст четвертой статьи из секции \"Services\" соответствует требованиям")
    public void paragraph_Of_Fourth_ServicesTab_Has_Correct_InnerHTML_expect_pass() throws InterruptedException {
        String actual  = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(4);
        Assert.assertEquals(mainPage.ServicesQualityAssuranceSectionParagraphText,actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Flaky
    @Test
    @DisplayName("Текст пятой статьи из секции \"Industries\" соответствует требованиям")
    public void paragraph_Of_Fifth_ServicesTab_Has_Correct_InnerHTML_expect_pass() throws InterruptedException {
        String actual  = mainPage.checkParagraphsNumberMatchesWithText_ServicesSection(5);
        Assert.assertEquals(mainPage.ServicesSupportSectionParagraphText,actual);
    }








    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Параграф \"Business Analysis\" из секции \"Services\" отображается на главной странице")
    public void Business_Analysis_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_BusinessAnalysisParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок \"Business Analysis\" 3 порядка из секции \"Services\" отображается на главной странице")
    public void Business_Analysis_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_BusinessAnalysisH3HeaderLocator);
        Assert.assertTrue(bool);
    }

*/
/*    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    public void test() throws InterruptedException {
        long time = System.currentTimeMillis();
        scrollToElement(2);
        scrollToElementSmoothly(5);
        long time2 = System.currentTimeMillis();
        double actual = time2 - time;
        Assert.assertEquals(5000,actual,1000);
        System.out.println(time);
        System.out.println(time2);
    }*//*


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" под параграфом \"Business Analysis\" из секции \"Services\" отображается на главной странице")
    public void Business_Analysis_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_BusinessAnalysisReadMoreButton);
        Assert.assertTrue(bool);
    }

    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" в секции \"Business Analysis\" из раздела \"Services\" содержит ссылку, соответствующую требованиям")
    public void Business_Analysis_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        clickElement(mainPage.ServicesSection_BusinessAnalysisReadMoreButton);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/how-we-work/#tab1",actual);
    }

    @Epic("Элемент(ы) имеет правильное состояние после перехода")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Business Analysis\" на странице \"How we work\" имеет состояние \"Enabled\" после перехода с главной страницы")
    public void Click_On_Business_Analysis_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        clickElement(mainPage.ServicesSection_BusinessAnalysisReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.BusinessAnalysis_TabSwither);
        WebDriverWait(howWeWorkSupport.BusinessAnalysis_TabSwither);
        makeScreenshot();
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Параграф \"Product Design\" из секции \"Services\" отображается на главной странице")
    public void Product_Design_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_ProductDesignParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок \"Product Design\" 3 порядка из секции \"Services\" отображается на главной странице")
    public void Product_Design_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_ProductDesignH3HeaderLocator);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" под параграфом \"Product Design\" из секции \"Services\" отображается на главной странице")
    public void Product_Design_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_ProductDesignReadMoreButton);
        Assert.assertTrue(bool);
    }

    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" в секции \"Product Design\" из раздела \"Services\" содержит ссылку, соответствующую требованиям")
    public void Product_Design_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        clickElement(mainPage.ServicesSection_ProductDesignReadMoreButton);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/how-we-work/#tab2",actual);
    }

    @Epic("Элемент(ы) имеет правильное состояние после перехода")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Product Design\" на странице \"How we work\" имеет состояние \"Enabled\" после перехода с главной страницы")
    public void Click_On_Product_Design_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        clickElement(mainPage.ServicesSection_ProductDesignReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.ProductDesign_TabSwither);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Параграф \"Development\" из секции \"Services\" отображается на главной странице")
    public void Development_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_DevelopmentParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок \"Development\" 3 порядка из секции \"Services\" отображается на главной странице")
    public void Development_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_DevelopmentH3HeaderLocator);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" под параграфом \"Development\" из секции \"Services\" отображается на главной странице")
    public void Development_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_DevelopmentReadMoreButton);
        Assert.assertTrue(bool);
    }

    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" в секции \"Development\" из раздела \"Services\" содержит ссылку, соответствующую требованиям")
    public void Development_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(10);
        clickElement(mainPage.ServicesSection_DevelopmentReadMoreButton);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/how-we-work/#tab3",actual);
    }

    @Epic("Элемент(ы) имеет правильное состояние после перехода")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Development\" на странице \"How we work\" имеет состояние \"Enabled\" после перехода с главной страницы")
    public void Click_On_Development_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        clickElement(mainPage.ServicesSection_DevelopmentReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.Development_TabSwither);
        Assert.assertTrue(bool);
    }


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Параграф \"Quality Assurance\" из секции \"Services\" отображается на главной странице")
    public void Quality_Assurance_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
            boolean bool = checkPresenseOfElement(mainPage.ServicesSection_QualityAssuranceParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок \"Quality Assurance\" в секции \"Quality Assurance\" из раздела \"Services\" отображается на главной странице")
    public void Quality_Assurance_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_QualityAssuranceH3HeaderLocator);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" в секции \"Quality Assurance\" из раздела \"Services\" отображается на главной странице")
    public void Quality_Assurance_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_QualityAssuranceReadMoreButton);
        Assert.assertTrue(bool);
    }

    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" в секции \"Quality Assurance\" из раздела \"Services\" содержит ссылку, соответствующую требованиям")
    public void Quality_Assurance_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        clickElement(mainPage.ServicesSection_QualityAssuranceReadMoreButton);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/how-we-work/#tab4",actual);
    }

    @Epic("Элемент(ы) имеет правильное состояние после перехода")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Quality Assurance\" на странице \"How we work\" имеет состояние \"Enabled\" после перехода с главной страницы")
    public void Click_On_Quality_Assurance_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(4);
        scrollToElementSmoothly(5);
        clickElement(mainPage.ServicesSection_QualityAssuranceReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.QualityAssurance_TabSwither);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Параграф \"Support\" из секции \"Services\" отображается на главной странице")
    public void Support_Paragraph_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(5);
        WebDriverWait(mainPage.ServicesSection_SupportParagraphLocator);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_SupportParagraphLocator);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок \"Support\" 3 порядка из секции \"Services\" отображается на главной странице")
    public void Support_H3Header_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(5);
        WebDriverWait(mainPage.ServicesSection_SupportH3HeaderLocator);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_SupportH3HeaderLocator);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" в секции \"Support\" из раздела \"Services\" отображается на главной странице")
    public void Support_ReadMore_Button_From_Services_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(5);
        WebDriverWait(mainPage.ServicesSection_SupportReadMoreButton);
        boolean bool = checkPresenseOfElement(mainPage.ServicesSection_SupportReadMoreButton);
        Assert.assertTrue(bool);
    }


    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Read More\" в секции \"Support\" из раздела \"Services\" содержит ссылку, соответствующую требованиям")
    public void Support_ReadMore_Button_From_Services_Section_Has_Correct_Link_expect_pass() throws InterruptedException {
        scrollToElement(5);
        clickElement(mainPage.ServicesSection_SupportReadMoreButton);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/how-we-work/#tab5",actual);
    }

    @Epic("Элемент(ы) имеет правильное состояние после перехода")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Support\" на странице \"How we work\" имеет состояние \"Enabled\" после перехода с главной страницы")
    public void Click_On_Support_ReadMore_Button_From_Services_Section_Opens_Correct_Tab_expect_pass() throws InterruptedException {
        scrollToElement(5);
        clickElement(mainPage.ServicesSection_SupportReadMoreButton);
        boolean bool = check_Element_IsEnabled(howWeWorkSupport.Support_TabSwither);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Параграф из раздела \"Our Clients\" отображается на главной странице")
    public void OurClients_Paragraph_From_OurClients_Section_is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(mainPage.OurClientsSection_OurClients_Paragraph);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст параграфа из раздела \"Our Clients\" соответствует требованиям")
    public void OurClients_Paragraph_From_OurClients_Section_Has_Correct_Text_expect_pass() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(1);
        String actual = getTextOfElement(mainPage.OurClientsSection_OurClients_Paragraph);
        Assert.assertEquals(mainPage.OurClientsSection_OurClients_Paragraph_Text,actual);
    }







    @Epic("Главная страница содержит корректное количество элементов одного типа")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Раздел \"Our clients\"на главной странице содержит 19 контейнеров для логотипов клиентов")
    public void OurClients_Section_Contains_19_Client_ITEMS_expect_pass()  {
        int actual = mainPage.checkClientItems_Quantity_OurClientsSection();
        Assert.assertEquals(19,actual);
    }

    @Epic("Главная страница содержит корректное количество элементов одного типа")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Раздел \"Our clients\"на главной странице содержит 19  логотипов клиентов")
    public void OurClients_Section_Contains_19_Client_LOGOS_expect_pass()  {
        int actual = mainPage.checkClientLogos_Quantity_OurClientsSection();
        Assert.assertEquals(19,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.NORMAL)
    @Test
    @DisplayName("Контейнеры для логотипов клиентов имеют одинаковое разрешение")
    public void Client_ITEMS_Have_Same_Dimensions_expect_pass() {
        Dimension expected = new Dimension( 141,100);
        boolean bool = mainPage.check_All_Client_Items_Have_theSame_Size(expected);
        Assert.assertTrue(bool);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.NORMAL)
    @Test
    @DisplayName("Логотипы клиентов имеют неодинаковое разрешение")
    public void Client_LOGOS_Have_Different_Dimensions_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension( 232,70);
        boolean bool = mainPage.check_All_Client_Logos_Do_Not_Have_theSame_Size(expected);
        Assert.assertFalse(bool);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №1 соответствует требованиям")
    public void first_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,30);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(1);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №2 соответствует требованиям")
    public void second_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,26);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(2);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №3 соответствует требованиям")
    public void third_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,15);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(3);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №4 соответствует требованиям")
    public void fourth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,23);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(4);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №5 соответствует требованиям")
    public void fifth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,22);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(5);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №6 соответствует требованиям")
    public void sixth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,20);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(6);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №7 соответствует требованиям")
    public void seventh_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,52);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(7);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №8 соответствует требованиям")
    public void eighth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,36);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(8);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №9 соответствует требованиям")
    public void ninth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,31);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(9);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №10 соответствует требованиям")
    public void tenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,23);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(10);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №11 соответствует требованиям")
    public void eleventh_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(81,30);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(11);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №12 соответствует требованиям")
    public void twelfth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,36);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(12);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №13 соответствует требованиям")
    public void thirteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(87,79);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(13);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №14 соответствует требованиям")
    public void fourteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,36);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(14);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №15 соответствует требованиям")
    public void fifteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,39);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(15);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №16 соответствует требованиям")
    public void sixteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,36);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(16);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №17 соответствует требованиям")
    public void seventeenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(114,57);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(17);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №18 соответствует требованиям")
    public void eighteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,25);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(18);
        Assert.assertEquals(expected,actual);
    }


    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение логотипа клиента №19 соответствует требованиям")
    public void nineteenth_Clients_Logo_Has_Correct_Dimension_expect_pass() throws InterruptedException {
        Dimension expected = new Dimension(121,28);
        Dimension actual = mainPage.check_Logos_Number_Matches_With_Dimension(19);
        Assert.assertEquals(expected,actual);
    }



//  In this type of tests edge and chrome have the same expected results,for FIREFOX expected+1
    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("1 логотип клиента отображен на главной странице после скролла вниз")
    public void One_ClientLogo_is_Displayed_After_Scrolling() throws InterruptedException {
        scrollToElement(5);
        scrollToElementSmoothly(15);
        makeScreenshot();
        int actual = mainPage.check_Quantity_Of_Displayed_Logos();
        Assert.assertEquals(1,actual);
    }



    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Flaky
    @Test
    @DisplayName("4 логотипа клиентов отображены на главной странице после скролла вниз")
    public void Four_ClientLogo_is_Displayed_After_Scrolling() throws InterruptedException {
        scrollToElement(5);
        scrollToElementSmoothly(17);
        Thread.sleep(1500);
        makeScreenshot();
        int actual = mainPage.check_Quantity_Of_Displayed_Logos();
        Assert.assertEquals(4,actual);
    }


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("6 логотипов клиентов отображены на главной странице после скролла вниз")
    public void Six_ClientLogo_is_Displayed_After_Scrolling() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(2);
        Thread.sleep(300);
        makeScreenshot();
        int actual = mainPage.check_Quantity_Of_Displayed_Logos();
        Assert.assertEquals(6,actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("9 логотипов клиентов отображены на главной странице после скролла вниз")
    public void eight_ClientLogo_is_Displayed_After_Scrolling() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(3);
        Thread.sleep(1500);
        makeScreenshot();
        int actual = mainPage.check_Quantity_Of_Displayed_Logos();
        Assert.assertEquals(9,actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("13 логотипов клиентов отображены на главной странице после скролла вниз")
    public void thirteen_ClientLogo_is_Displayed_After_Scrolling() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(5);
        Thread.sleep(1500);
        makeScreenshot();
        int actual = mainPage.check_Quantity_Of_Displayed_Logos();
        Assert.assertEquals(13,actual);
    }

*/
/*    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("15 логотипов клиентов отображены на главной странице после скролла вниз")
    public void fifteen_ClientLogo_is_Displayed_After_Scrolling() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(6);
        Thread.sleep(1500);
        makeScreenshot();
        int actual = mainPage.check_Quantity_Of_Displayed_Logos();
        Assert.assertEquals(15,actual);
    }*//*


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("16 логотипов клиентов отображены на главной странице после скролла вниз")
    public void sixteen_ClientLogo_is_Displayed_After_Scrolling() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(7);
        makeScreenshot();
        int actual = mainPage.check_Quantity_Of_Displayed_Logos();
        Assert.assertEquals(16,actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("18 логотипов клиентов отображены на главной странице после скролла вниз")
    public void eighteen_ClientLogo_is_Displayed_After_Scrolling() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(8);
        makeScreenshot();
        int actual = mainPage.check_Quantity_Of_Displayed_Logos();
        Assert.assertEquals(18,actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("19 логотипов клиентов отображены на главной странице после скролла вниз")
    public void nineteen_ClientLogo_is_Displayed_After_Scrolling() throws InterruptedException {
        scrollToElement(6);
        scrollToElementSmoothly(10);
        makeScreenshot();
        int actual = mainPage.check_Quantity_Of_Displayed_Logos();
        Assert.assertEquals(19,actual);
    }



    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"Healthcare\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_Healthcare_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(1);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"CRMSystems\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_CRMSystems_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(2);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"Data Science\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_DataScience_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(3);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"Fitness & Wellness\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_Fittness_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(4);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"GPSNavigation\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_GPSNavigation_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(5);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"Marketing & Advertising\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_Marketing_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(6);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"Media & Education\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_MediaAndEducation_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(7);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"Natural Language Processing\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_NaturalLanguageProcessing_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(8);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"Social Media\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_SocialMedia_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(3);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Разрешение изображения блока \"Travel & Hospitality\" из раздела \"Industries\" на главной странице имеет разрашение 452х500 пикселей")
    public void Image_from_TravelAndHospitality_Tab_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension(452,500);
        Dimension actual = mainPage.checkIndustriesImageNumberMatchesWithDimension(3);
        Assert.assertEquals(expected,actual);
    }


    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"About US\" из \"Menu\" на стартовой странице содержит ссылку, соответствующую требованиям")
    public void AboutUs_Button_From_GambMune_Has_Correct_Link_expect_pass()  {
        clickElement(mainPage.gamburgerMenuButton);
        clickElement(mainPage.AboutUsButtonFromGamburgerMenu);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/about_us/",actual);
    }


    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Home\" из \"Menu\" на стартовой странице содержит ссылку, соответствующую требованиям")
    public void Home_Button_GambMenu_Has_Correct_Link_expect_pass()  {
        clickElement(mainPage.gamburgerMenuButton);
        clickElement(mainPage.HomeButtonFromGamburgerMenu);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/",actual);
    }



    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Portfolio\" из \"Menu\" на стартовой странице содержит ссылку, соответствующую требованиям")
    public void Portfolio_Button_From_GambMune_Has_Correct_Link_expect_pass()  {
        clickElement(mainPage.gamburgerMenuButton);
        clickElement(mainPage.PortfolioButtonFromGamburgerMenu);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/case-studies/",actual);
    }

    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Career\" из \"Menu\" на стартовой странице содержит ссылку, соответствующую требованиям")
    public void Career_Button_From_GambMune_Has_Correct_Link_expect_pass()  {
        clickElement(mainPage.gamburgerMenuButton);
        clickElement(mainPage.CareerButtonFromGamburgerMenu);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/careers/",actual);
    }

    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"Get In Touch\" из \"Menu\" на стартовой странице содержит ссылку, соответствующую требованиям")
    public void GetInTouch_Button_From_GambMune_Has_Correct_Link_expect_pass()  {
        clickElement(mainPage.gamburgerMenuButton);
        clickElement(mainPage.GetInTouchButtonFromGamburgerMenu);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/contacts/",actual);
    }

    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Кнопка \"How We Work\" из \"Menu\" на стартовой странице содержит ссылку, соответствующую требованиям")
    public void HowWeWork_Button_GambMenu_Has_Correct_Link_expect_pass()  {
        clickElement(mainPage.gamburgerMenuButton);
        clickElement(mainPage.HowWeWorkButtonFromGamburgerMenu);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/how-we-work/",actual);
    }
*/









/*    @Test
    public void gav() throws InterruptedException {
        String actual = mainPage.gavgav(2);
        String expected = mainPage.ScrollableCRMSystemsSectionParagraphText;
        System.out.println(actual);
        System.out.println(expected);
        Assert.assertEquals(expected,actual);
    }*/





    @After
    public void TearDown(){
        tearDown();
    }






}
