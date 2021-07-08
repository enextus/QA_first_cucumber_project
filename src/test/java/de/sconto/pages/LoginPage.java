package de.sconto.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    public void validLoginInput() {

        $(emailInput).val(validEmail);
        $(passwordInput).val(validPassword);
    }

    public void clickOnSubmitButton() {
        $(loginButton).click();
    }

    public SelenideElement validMyAccount () {
        return $(validMyAccount);
    }
}
