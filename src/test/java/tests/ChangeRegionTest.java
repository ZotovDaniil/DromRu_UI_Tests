package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ChangeRegionTest extends TestBase {

    @Test
    @DisplayName("Проверка на изменение региона")
    public void cityChangesTest() {

        step("Переход на вкладу изменение региона", () ->
                mainPage.changingRegion());

        step("Выбрать города", () ->
                mainPage.choiceRegion("Волгоградская область"));

        step("Проверить выбранный город", () ->
                mainPage.checkingRegion("Волгоградская область"));
    }
}
