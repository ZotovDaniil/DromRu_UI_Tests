package tests;

import config.WebDriverProvider;
import helpers.Attach;
import page.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.remote;
import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    MainPage mainPage = new MainPage();
    MazdaCatalogPage mazdaCatalogPage = new MazdaCatalogPage();
    ResultsSearchMazda5Page resultsSearchMazda5Page = new ResultsSearchMazda5Page();
    CatalogCarsPage catalogCarsPage = new CatalogCarsPage();
   FillFormPage fillFormPage = new FillFormPage();
   LoginPage loginPage = new LoginPage();
   YouTubePage youTubePage = new YouTubePage();

    @BeforeAll
    static void setUp() {
        WebDriverProvider.config();
    }

    @BeforeEach
    void addListener() {
        open("https://www.drom.ru/");
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//        sleep(30000);
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        if (remote != null) {
            Attach.browserConsoleLogs();
            Attach.addVideo();
        }
        closeWebDriver();
    }
}
