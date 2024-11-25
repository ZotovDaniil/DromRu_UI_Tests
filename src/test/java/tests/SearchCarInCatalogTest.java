package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SearchCarInCatalogTest extends TestBase {

    @Test
    @DisplayName("Поиск автомобиля Mazda 5 через вкладку Каталог")
    public void searchCarTest() {

        step("Кликаем на вкладку Каталог", () ->
                mainPage.clickTabCatalog()
        );

        step("Кликаем на раздел Mazda", () ->
                catalogCarsPage.clickComponentMazda()
        );

        step("Кликаем на раздел Mazda 5", () ->
                mazdaCatalogPage.clickTabWithMazda5("Mazda5")
        );

        step("Проверяем, что поиск выдал объявления именно с Маздой 5", () ->
                resultsSearchMazda5Page.checkingResultsSearchMazda5("Модельный ряд Mazda Mazda5 для России")
        );
    }
}
