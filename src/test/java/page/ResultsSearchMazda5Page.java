package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultsSearchMazda5Page {
    private final SelenideElement
    resultsSearch = $("#russia");

    public void checkingResultsSearchMazda5 (String value){
        resultsSearch.shouldHave(text(value));
    }
}
