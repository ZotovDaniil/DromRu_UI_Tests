package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class FillFormAllCarsTest extends TestBase {
    @Test
    @DisplayName("Заполнение формы поиска автомобилей из раздела 'Все'")
    public void FillFormForSearchInAllCarsTest() {
        step("Заходим в раздел Автомобили в верхнем меню", () ->
                mainPage.clickTabCars()
        );

        step("Проверяем, что зашли во вкладку о продаже автомобилей", () ->
                fillFormPage.checkingSaleCarsItem("Продажа автомобилей")
        );

        step("Выбираем марку автомобиля", () ->
                fillFormPage.setChoiceCarBrandTab("Лада")
        );

        step("Выбираем модель автомобиля", () ->
                fillFormPage.setChoiceModelCarsTab("Приора")
        );

        step("Выбираем поколение автомобиля", () ->
                fillFormPage.setChoiceGenerationCarsTab("2007 - 2014")
        );

        step("Указываем ценовой диапазон ОТ", () ->
                fillFormPage.setSalesFilterFrom("50000")
        );

        step("Указываем ценовой диапазон ДО", () ->
                fillFormPage.setSalesFilterTo("300000")
        );

        step("Указываем год выпуска ОТ", () ->
                fillFormPage.setYearsFilterTo("2010")
        );

        step("Нажимаем кнопку 'Показать'", () ->
                fillFormPage.clickButtonSaveParam()
        );

        step("Проверяем результаты поиска", () ->
                fillFormPage.checkResultsSearching("Лада Приора")
        );
    }

}
