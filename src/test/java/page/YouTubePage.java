package page;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YouTubePage {
    public void checkUrlAfterSwitchToYouTube(String value) {
        switchTo().window(1);
        sleep(35000);
        String currentUrl = url();

        assertEquals(value, currentUrl);
    }
}
