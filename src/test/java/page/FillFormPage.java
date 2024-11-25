package page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class FillFormPage {

    private final SelenideElement
            saleCarsTab = $("span[data-ftid='header_breadcrumb-item']"),
            choiceCarBrandTab = $("div[data-ftid='sales__filter_fid']"),
            choiceModelCarsTab = $("div[data-ftid='sales__filter_mid']"),
            inputChoice = $(".css-avhi0e"),
            inputChoiceAfterClick = $(".css-1u4ih5a"),
            choiceGenerationCar = $(".e16yenfe0 "),
            inputChoiceGenerationCar = $(".css-1i9mk74 "),
            salesFilterFrom = $("input[data-ftid='sales__filter_price-from']"),
            salesFilterTo = $("input[data-ftid='sales__filter_price-to']"),
            yearFilterFrom = $("div[data-ftid='sales__filter_year-from']"),
            inputSaveFilterSearch = $("button[data-ftid='sales__filter_submit-button']");

    private final ElementsCollection
//    salesList = $$("div[data-ftid='data-bulletin-list']");
    salesList = $$("div[data-ftid='bulls-list_bull']");

    public void checkingSaleCarsItem(String value) {
        saleCarsTab.shouldHave(text(value));
    }

    public void setChoiceCarBrandTab(String value) {
        choiceCarBrandTab.click();
        inputChoice.setValue(value);
        inputChoiceAfterClick.$(withText(value)).click();
        sleep(5000);

    }

    public void setChoiceModelCarsTab(String value) {
        choiceModelCarsTab.click();
        inputChoice.setValue(value);
        inputChoiceAfterClick.$(withText(value)).click();
        sleep(5000);
    }

    public void setChoiceGenerationCarsTab(String value) {
        choiceGenerationCar.click();
        inputChoiceGenerationCar.$(withText(value)).click();

    }

    public void setSalesFilterFrom(String value) {
        salesFilterFrom.click();
        salesFilterFrom.setValue(value);

    }

    public void setSalesFilterTo(String value) {
        salesFilterTo.click();
        salesFilterTo.setValue(value);

    }

    public void setYearsFilterTo(String value) {
        yearFilterFrom.click();
        yearFilterFrom.$(withText(value)).click();

    }

    public void clickButtonSaveParam() {
        inputSaveFilterSearch.click();

    }

    public void checkResultsSearching(String value) {
        salesList.get(0).shouldHave(text(value));

    }

}
