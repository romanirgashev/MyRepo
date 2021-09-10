import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AboutUsPageTests extends TestBase{

    WebDriver driver;
    private AboutUsPage aboutUsPage;
    private MainPage mainPage;




    @Before
    public void SetUp() {
        setUp("chrome","https://envionsoftware.com/about_us/");
        mainPage = new MainPage(driver);
        aboutUsPage = new AboutUsPage(driver);
    }



    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Логотип компании отображен на странице \"About Us\"")
    public void Company_Logo_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(mainPage.CompanyLogo);
        Assert.assertTrue(bool);
    }

    @Epic("Переход осуществляется на ожидаемую страницу")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Логотип компании на странице \"About Us\" содержит ссылку, соответствующую требованиям")
    public void Company_Logo_Has_Correct_Link_expect_pass() {
        clickElement(mainPage.CompanyLogo);
        String actual = checkURLCorrectness();
        Assert.assertEquals("https://envionsoftware.com/",actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Значение атрибута alt у логотипа компании на странице \"About Us\" соответствует требованиям ")
    public void Company_Logo_Has_Correct_Name_expect_pass()  {
        String actual = get_alt_Attribute_of_Element(mainPage.CompanyLogoString);
        Assert.assertEquals("logo",actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.NORMAL)
    @Test
    @DisplayName("Логотип компании имеет разрешение соответствующее требованиям")
    public void Company_Logo_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension( 80,77);
        Dimension actual = getDimensionOfElement(mainPage.CompanyLogo);
        Assert.assertEquals(expected,actual);
    }



    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок 1-го порядка \"About Us\" отображен на странице \"About Us\"")
    public void About_Us_Header_Is_Displayed_expect_pass() throws InterruptedException {
        boolean bool = checkPresenseOfElement(aboutUsPage.AboutUsH1Header);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст главного заголовка на странице \"About Us\" соответствует требованиям")
    public void AboutUs_Header_From_AboutUs_Page_Has_Correct_Text_expect_pass() throws InterruptedException {
        scrollToElementSmoothly(1);
        String actual = getTextOfElement(aboutUsPage.AboutUsH1Header);
        Assert.assertEquals("About us",actual);
    }

    @Epic("Цвет элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок \"About Us\" на странице \"About Us\" имеет цвет соответствующий требованиям ")
    public void About_Us_Header_From_AboutUs_Page_Has_Correct_Color_expect_pass() throws InterruptedException {
        String actual = getColorAs_HEX_OfElements_Name(aboutUsPage.AboutUsH1Header);
        Assert.assertEquals("#001c33",actual);
    }

    @Epic("Размер шрифта элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок \"About Us\" на странице \"About Us\" имеет размер шрифта соответствующий требованиям ")
    public void About_Us_Header_From_AboutUs_Page_Has_Correct_FontSize_expect_pass() throws InterruptedException {
        String actual = get_FontSize_of_Element(aboutUsPage.AboutUsH1Header);
        Assert.assertEquals("80px",actual);
    }




    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Изображение \"Office\" отображено на странице \"About Us\"")
    public void Image_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.ImageBy);
        Assert.assertTrue(bool);
    }


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Изображение \"Image\" отображено на странице \"About Us\"")
    public void Hero_Image_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.HeroImageBy);
        Assert.assertTrue(bool);
    }



    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Значение атрибута alt у изображения \"Hero\" на странице \"About Us\" соответствует требованиям ")
    public void Hero_Image_Has_Correct_alt_Attribute(){
        String actual = get_alt_Attribute_of_Element(aboutUsPage.HeroImage);
        Assert.assertEquals("hero-image", actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Значение атрибута alt у изображения \"Image\" на странице \"About Us\" соответствует требованиям ")
    public void Image_Has_Correct_alt_Attribute(){
        String actual = get_alt_Attribute_of_Element(aboutUsPage.Image);
        Assert.assertEquals("image", actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Изображение \"Hero\" имеет разрешение соответствующее требованиям")
    public void Image_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension( 1130,720);
        Dimension actual = getDimensionOfElement(aboutUsPage.HeroImageBy);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Фактическое разрешение элемента соответствует ожидаемому")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Изображение \"Image\" имеет разрешение соответствующее требованиям")
    public void Hero_Image_Has_Correct_Dimension_expect_pass() {
        Dimension expected = new Dimension( 1440,720);
        Dimension actual = getDimensionOfElement(aboutUsPage.ImageBy);
        Assert.assertEquals(expected,actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок 2-го порядка \"ENVION SOFTWARE\" отображен на странице \"About Us\"")
    public void EnvionSoftware_H2Header_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        scrollUpToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.EnvionSoftwareH2Header);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст заголовка 2-го порядка \"Envion Software\" на странице \"About Us\" соответствует требованиям")
    public void EnvionSoftware_H2Header_From_AboutUs_Page_Has_Correct_Text_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.EnvionSoftwareH2Header);
        Assert.assertEquals("Envion software",actual);
    }

    @Epic("Цвет элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 2-го порядка \"Envion Software\" на странице \"About Us\" имеет цвет соответствующий требованиям ")
    public void EnvionSoftware_H2Header_Has_Correct_Color_expect_pass() throws InterruptedException {
        String actual = getColorAs_HEX_OfElements_Name(aboutUsPage.EnvionSoftwareH2Header);//ModuleSequenceDiv
        Assert.assertEquals("#001c33",actual);
    }

    @Epic("Размер шрифта элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 2-го порядка \"Envion Software\" на странице \"About Us\" имеет размер шрифта соответствующий требованиям ")
    public void EnvionSoftware_Header_From_AboutUs_Page_Has_Correct_FontSize_expect_pass() throws InterruptedException {
        String actual = get_FontSize_of_Element(aboutUsPage.EnvionSoftwareH2Header);
        Assert.assertEquals("60px",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Параграф из секции \"ENVION SOFTWARE\" отображен на странице \"About Us\"")
    public void EnvionSoftware_Paragraph_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        scrollUpToElementSmoothly(1);
        boolean actual = checkPresenseOfElement(aboutUsPage.EnvionSoftwareParagraph);
        Assert.assertTrue(actual);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст параграфа \"Envion Software\" на странице \"About Us\" соответствует требованиям")
    public void EnvionSoftware_Paragraph_From_AboutUs_Page_Has_Correct_Text_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.EnvionSoftwareParagraph);
        Assert.assertEquals(aboutUsPage.EnvionSoftwareParagraphText, actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок 3-го порядка \"WHO WE ARE\" отображен на странице \"About Us\"")
    public void WhoWeAre_H2Header_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollUpToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.WhoWeAreH2Header);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст заголовка 3-го порядка \"WHO WE ARE\" на странице \"About Us\" соответствует требованиям")
    public void WhoWeAre_H2Header_From_AboutUs_Page_Has_Correct_Text_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.WhoWeAreH2Header);
        Assert.assertEquals("Who we are",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Секция \"WHO WE ARE\" отображена на странице \"About Us\"")
    public void ModuleSequenceDiv_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollUpToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.ModuleSequenceDiv);
        Assert.assertTrue(bool);
    }

    @Epic("Цвет элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 3-го порядка \"Who We Are\" на странице \"About Us\" имеет цвет соответствующий требованиям ")
    public void Who_We_Are_H3Header_Has_Correct_Color_expect_pass() {
        String actual = getColorAs_HEX_OfElements_Name(aboutUsPage.WhoWeAreH2Header);
        Assert.assertEquals("#001c33",actual);
    }

    @Epic("Размер шрифта элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 3-го порядка \"Who We Are\" на странице \"About Us\" имеет размер шрифта соответствующий требованиям ")
    public void Who_We_Are_H3Header_From_AboutUs_Page_Has_Correct_FontSize_expect_pass() {
        String actual = get_FontSize_of_Element(aboutUsPage.WhoWeAreH2Header);
        Assert.assertEquals("30px",actual);
    }



    @Epic("Цвет элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Секция \"WHO WE ARE\" на странице \"About Us\" имеет цвет соответствующий требованиям ")
    public void ModuleSequenceDivvv_Has_Correct_Color_expect_pass() throws InterruptedException {
        String actual = getColorAs_HEX_OfElements_Body(aboutUsPage.ModuleSequenceDiv);
        Assert.assertEquals("#51dacd",actual);
    }




    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Номер 1-го обзаца из секции \"WHO WE ARE\" отображен на странице \"About Us\"")
    public void Number_Of_First_Paragraph_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        scrollToElementSmoothly(24);
        boolean bool = checkPresenseOfElement(aboutUsPage.ModuleSequenceFirstParagraphNumber);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Номер 1-го обзаца из секции \"WHO WE ARE\" на странице \"About Us\" соответствует требованиям")
    public void Number_Of_First_Paragraph_From_WhoWeAre_Section_Has_Correct_Value_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.ModuleSequenceFirstParagraphNumber);
        Assert.assertEquals("01",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Текст 1-го обзаца из секции \"WHO WE ARE\" отображен на странице \"About Us\"")
    public void Text_Of_First_Paragraph_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        scrollToElementSmoothly(24);
        boolean bool = checkPresenseOfElement(aboutUsPage.ModuleSequenceFirstParagraph);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст 1-го обзаца из секции \"WHO WE ARE\" на странице \"About Us\" соответствует требованиям")
    public void First_Paragraph_From_WhoWeAre_Section_Has_Correct_Text_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.ModuleSequenceFirstParagraph);
        Assert.assertEquals(aboutUsPage.ModuleSequenceFirstParagraphText,actual);
    }


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Номер 2-го обзаца из секции \"WHO WE ARE\" отображен на странице \"About Us\"")
    public void Number_Of_Second_Paragraph_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        scrollToElementSmoothly(27);
        boolean bool = checkPresenseOfElement(aboutUsPage.ModuleSequenceSecondParagraphNumber);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Номер 2-го обзаца из секции \"WHO WE ARE\" на странице \"About Us\" соответствует требованиям")
    public void Number_Of_Second_Paragraph_From_WhoWeAre_Section_Has_Correct_Value_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.ModuleSequenceSecondParagraphNumber);
        Assert.assertEquals("02",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Текст 2-го обзаца из секции \"WHO WE ARE\" отображен на странице \"About Us\"")
    public void Text_Of_Second_Paragraph_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        scrollToElementSmoothly(27);
        boolean bool = checkPresenseOfElement(aboutUsPage.ModuleSequenceSecondParagraph);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст 2-го обзаца из секции \"WHO WE ARE\" на странице \"About Us\" соответствует требованиям")
    public void Second_Paragraph_From_WhoWeAre_Section_Has_Correct_Text_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.ModuleSequenceSecondParagraph);
        Assert.assertEquals(aboutUsPage.ModuleSequenceSecondParagraphText,actual);
    }


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Номер 3-го обзаца из секции \"WHO WE ARE\" отображен на странице \"About Us\"")
    public void Number_Of_Third_Paragraph_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(aboutUsPage.ModuleSequenceThirdParagraphNumber);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Номер 3-го обзаца из секции \"WHO WE ARE\" на странице \"About Us\" соответствует требованиям")
    public void Number_Of_Third_Paragraph_From_WhoWeAre_Section_Has_Correct_Value_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.ModuleSequenceThirdParagraphNumber);
        Assert.assertEquals("03",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Текст 3-го обзаца из секции \"WHO WE ARE\" отображен на странице \"About Us\"")
    public void Text_Of_Third_Paragraph_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(10);
        boolean bool = checkPresenseOfElement(aboutUsPage.ModuleSequenceThirdParagraph);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст 3-го обзаца из секции \"WHO WE ARE\" на странице \"About Us\" соответствует требованиям")
    public void Third_Paragraph_From_WhoWeAre_Section_Has_Correct_Text_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.ModuleSequenceThirdParagraph);
        Assert.assertEquals(aboutUsPage.ModuleSequenceThirdParagraphText,actual);
    }


    // Написать тесты проверяющие, что отображен только 1 пункт в списке, 1 и 2 и все 3 вместе


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Только текст 1-го обзаца из секции \"WHO WE ARE\" отображен на странице \"About Us\"")
    public void Only_text_Of_First_Paragraph_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(2);
        boolean actual = checkPresenseOfElement(aboutUsPage.ModuleSequenceFirstParagraph);
        boolean actual2 = checkPresenseOfElement(aboutUsPage.ModuleSequenceSecondParagraph);
        boolean actual3 = checkPresenseOfElement(aboutUsPage.ModuleSequenceThirdParagraph);
        Assert.assertTrue(actual);
        Assert.assertFalse(actual2);
        Assert.assertFalse(actual3);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Только текст 1-го и 2-го обзацев из секции \"WHO WE ARE\" отображены на странице \"About Us\"")
    public void Texts_Of_First_And_Second_Paragraphs_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(5);
        boolean actual = checkPresenseOfElement(aboutUsPage.ModuleSequenceFirstParagraph);
        boolean actual2 = checkPresenseOfElement(aboutUsPage.ModuleSequenceSecondParagraph);
        boolean actual3 = checkPresenseOfElement(aboutUsPage.ModuleSequenceThirdParagraph);
        Assert.assertTrue(actual);
        Assert.assertTrue(actual2);
        Assert.assertFalse(actual3);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Текст всех 3-х обзацев из секции \"WHO WE ARE\" отображены на странице \"About Us\"")
    public void Texts_Of_Three_Paragraphs_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(2);
        scrollToElementSmoothly(9);
        boolean actual = checkPresenseOfElement(aboutUsPage.ModuleSequenceFirstParagraph);
        boolean actual2 = checkPresenseOfElement(aboutUsPage.ModuleSequenceSecondParagraph);
        boolean actual3 = checkPresenseOfElement(aboutUsPage.ModuleSequenceThirdParagraph);
        Assert.assertTrue(actual);
        Assert.assertTrue(actual2);
        Assert.assertTrue(actual3);
    }



    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок 2-го порядка \"Company Mission\" отображен на странице \"About Us\"")
    public void Company_Mission_Header_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.CompanyMission_H2);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 2-го порядка \"Company Mission\" на странице \"About Us\" имеет текст соответствует требованиям")
    public void Company_Mission_Header_From_AboutUs_Page_Has_Correct_Text_expect_pass() throws InterruptedException {
        scrollToElementSmoothly(1);
        String actual = getTextOfElement(aboutUsPage.CompanyMission_H2);
        Assert.assertEquals("Company Mission and Strategic Challenges",actual);
    }

    @Epic("Цвет элемента соответствует требованиям")


    @Epic("Размер шрифта элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 2-го порядка \"Company Mission\" на странице \"About Us\" имеет размер шрифта соответствующий требованиям ")
    public void Company_Mission_Header_From_AboutUs_Page_Has_Correct_FontSize_expect_pass() throws InterruptedException {
        String actual = get_FontSize_of_Element(aboutUsPage.CompanyMission_H2);
        Assert.assertEquals("60px",actual);
    }

    @Epic("Цвет элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 2-го порядка \"Company Mission\" на странице \"About Us\" имеет цвет соответствующий требованиям ")
    public void Company_Mission_Header_Has_Correct_Color_expect_pass() {
        String actual = getColorAs_HEX_OfElements_Name(aboutUsPage.CompanyMission_H2);
        Assert.assertEquals("#51dacd",actual);
    }


    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок 1-го обзаца из секции \"Company mission...\" отображен на странице \"About Us\"")
    public void First_Header_From_Company_Mission_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.CompanyMissionSectionFirstHeader);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст заголовка 1-го обзаца из секции \"Company mission...\" на странице \"About Us\" соответствует требованиям")
    public void Name_Of_First_Header_From_WhoWeAre_Section_Has_Correct_Value_expect_pass()  {
        String actual = getTextOfElement(aboutUsPage.CompanyMissionSectionFirstHeader);
        Assert.assertEquals("Professionalism",actual);
    }

    @Epic("Цвет элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 1-го обзаца из секции \"Company mission...\" на странице \"About Us\" имеет цвет соответствующий требованиям ")
    public void First_Header_From_Company_Mission_Section_Has_Correct_Color_expect_pass() {
        String actual = getColorAs_HEX_OfElements_Name(aboutUsPage.CompanyMissionSectionFirstHeader);
        Assert.assertEquals("#001c33",actual);
    }

    @Epic("Размер шрифта элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 1-го обзаца из секции \"Company mission...\" на странице \"About Us\" имеет размер шрифта соответствующий требованиям ")
    public void First_Header_From_Company_Mission_Section_Has_Correct_FontSize_expect_pass() {
        String actual = get_FontSize_of_Element(aboutUsPage.CompanyMissionSectionFirstHeader);
        Assert.assertEquals("24px",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Текст 1-го обзаца из секции \"Company mission...\" отображен на странице \"About Us\"")
    public void Text_Of_First_Paragraph_From_Company_Mission_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.CompanyMissionSectionFirstParagraph);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст 1-го обзаца из секции \"Company mission...\" на странице \"About Us\" соответствует требованиям")
    public void First_Paragraph_From_Company_Mission_Section_Has_Correct_Text_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.CompanyMissionSectionFirstParagraph);
        Assert.assertEquals(aboutUsPage.CompanyMissionSectionFirstParagraphText,actual);
    }




    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заголовок 2-го обзаца из секции \"Company mission...\" отображен на странице \"About Us\"")
    public void Second_Header_From_Company_Mission_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.CompanyMissionSectionSecondHeader);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст заголовка 2-го обзаца из секции \"Company mission...\" на странице \"About Us\" соответствует требованиям")
    public void Name_Of_Second_Header_From_WhoWeAre_Section_Has_Correct_Value_expect_pass()  {
        String actual = getTextOfElement(aboutUsPage.CompanyMissionSectionSecondHeader);
        Assert.assertEquals("Responsibility",actual);
    }

    @Epic("Цвет элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 2-го обзаца из секции \"Company mission...\" на странице \"About Us\" имеет цвет соответствующий требованиям ")
    public void Second_Header_From_Company_Mission_Section_Has_Correct_Color_expect_pass() {
        String actual = getColorAs_HEX_OfElements_Name(aboutUsPage.CompanyMissionSectionSecondHeader);
        Assert.assertEquals("#001c33",actual);
    }

    @Epic("Размер шрифта элемента соответствует требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Заголовок 2-го обзаца из секции \"Company mission...\" на странице \"About Us\" имеет размер шрифта соответствующий требованиям ")
    public void Second_Header_From_Company_Mission_Section_Has_Correct_FontSize_expect_pass() {
        String actual = get_FontSize_of_Element(aboutUsPage.CompanyMissionSectionSecondHeader);
        Assert.assertEquals("24px",actual);
    }

    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Текст 2-го обзаца из секции \"Company mission...\" отображен на странице \"About Us\"")
    public void Text_Of_Second_Paragraph_From_Company_Mission_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(3);
        scrollToElementSmoothly(1);
        boolean bool = checkPresenseOfElement(aboutUsPage.CompanyMissionSectionSecondParagraph);
        Assert.assertTrue(bool);
    }

    @Epic("Элемент содержит текст,соответствующий требованиям")
    @Severity(value = SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Текст 2-го обзаца из секции \"Company mission...\" на странице \"About Us\" соответствует требованиям")
    public void Second_Paragraph_From_Company_Mission_Section_Has_Correct_Text_expect_pass() throws InterruptedException {
        String actual = getTextOfElement(aboutUsPage.CompanyMissionSectionSecondParagraph);
        Assert.assertEquals(aboutUsPage.CompanyMissionSectionSecondParagraphText,actual);
    }

/*    @Epic("Элемент(ы) отображается после выполнения определенных действий пользователем")
    @Severity(value = SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Текст всех 3-х обзацев из секции \"WHO WE ARE\" отображены на странице \"About Us\"")
    public void Texts_fsdOf_Three_Paragraphs_From_WhoWeAre_Section_Is_Displayed_expect_pass() throws InterruptedException {
        scrollToElement(1);
        WebDriverWait((By) aboutUsPage.ImageWebElem);
        String actual = get_Naturel_Size_Of_Element();
        Assert.assertEquals("124235",actual);
    }*/










    @After
    public void TearDown(){
        tearDown();
    }


}





