package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement
    loginForm = $("#sign"),
    passwordForm = $("#password"),
    buttonLoginUsingPassword = $("#signbutton"),
    errorLogin = $("#sign_errors"),
    errorPassword = $("#password_errors");

    public void setLoginForm(String value){
        loginForm.setValue(value);
    }

    public void setPasswordForm(String value){
        passwordForm.setValue(value);
    }

    public void enterLogin(){
        buttonLoginUsingPassword.click();
    }

    public void checkErrorLogin (String value){
        errorLogin.shouldHave(text(value));
    }

    public void checkErrorPassword (String value){
        errorPassword.shouldHave(text(value));
    }

}
