package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            clickCatalog = $("a[href='https://www.drom.ru/catalog/']"),
            region = $("div[data-ftid='component_header_region']"),
            regionList = $(".b-selectCars__section"),
            tabCars = $("a[data-ftid='component_header_main-menu-item']"),
            loginTab = $("a[data-ftid='component_header_login']"),
            youtubeIcon = $("a[href='https://www.youtube.com/drom/']");

    public void clickTabCatalog() {

        clickCatalog.click();
    }

    public void changingRegion() {
        region.click();
    }

    public void choiceRegion(String value) {
        regionList.$(byText(value)).click();
    }

    public void checkingRegion(String value) {
        region.shouldHave(text(value));
    }

    public void clickTabCars() {
        tabCars.click();
    }

    public void clickTabLogin() {
        loginTab.parent().click();
    }

    public void clickYoutubeIcon() {

        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        sleep(1000);
        youtubeIcon.hover().click();
    }


}
