package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MazdaCatalogPage {
    private final SelenideElement
    tabMazda5 = $("div[data-ftid='component_cars-list']");

    public void clickTabWithMazda5(String value){
        tabMazda5.$(byText(value)).click();
    }
}
