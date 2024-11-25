package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class LoginTest extends TestBase {
    @Test
    @DisplayName("Неуспешная авторизация пользователя")

    public void unsuccessfulLoginUser() {
        step("Заходим во вкладку Вход", () ->
                mainPage.clickTabLogin()
        );

        step("Вводим неправильный логин", () ->
                loginPage.setLoginForm("user1234@mail.com")
        );

        step("Вводим неправильный пароль", () ->
                loginPage.setPasswordForm("123123123")
        );

        step("Нажимаем Войти через пароль", () ->
                loginPage.enterLogin()
        );

        step("Проверка, что логин неверный", () ->
                loginPage.checkErrorLogin("Данные для входа неверны")
        );

        step("Проверка, что пароль неверный", () ->
                loginPage.checkErrorPassword("Данные для входа неверны")
        );


    }

}
