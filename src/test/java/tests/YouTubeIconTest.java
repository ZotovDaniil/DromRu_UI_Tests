package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static io.qameta.allure.Allure.step;


public class YouTubeIconTest extends TestBase {

    @Test
    @DisplayName("Проверка перехода на ютуб-канал Дром.ру через иконку ютуба на сайте")
    public void FollowTheLinkToYoutube() {

        step("В нижнем меню сайта переходим по иконке Ютуб на ютуб-канал Дром.ру", () ->
                mainPage.clickYoutubeIcon()
        );

        step("Проверяем переход на ютуб", () ->
            youTubePage.checkUrlAfterSwitchToYouTube("https://www.youtube.com/drom")
        );

    }

}
