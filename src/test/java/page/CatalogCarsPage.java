package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CatalogCarsPage {
    private final SelenideElement
            componentCarCatalogMazda = $("a[href='https://www.drom.ru/catalog/mazda/']");

    public void clickComponentMazda(){
        componentCarCatalogMazda.click();
    }
}
