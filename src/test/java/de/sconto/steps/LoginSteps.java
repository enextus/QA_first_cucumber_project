package de.sconto.steps;

import com.codeborne.selenide.Condition;
import de.sconto.pages.LoginPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class LoginSteps implements En {

    LoginPage loginPage;

    public LoginSteps() {

        When("I click on the Login icon", () -> {

            loginPage = page(LoginPage.class);
            loginPage.clickOnLoginTab();
        });

        Then("I see login page", () -> {

            loginPage.loginPageHeader().should(Condition.exist);
            loginPage.loginPageHeader().shouldHave(text("Anmelden"));
        });

        When("I insert valid user credentials", () -> {

            loginPage.validLoginInput();
        });

        And("I click on Login button", () -> {

            loginPage.clickOnSubmitButton();
        });

        Then("I should see MyAccount icon", () -> {

            loginPage.validMyAccountIcon().should(exist);
        });

        When("I click on MyAccount icon", () -> {

            loginPage.validMyAccountIcon();
        });

        Then("I should see my name", () -> {
            loginPage.accountTitle().should(exist);
            loginPage.accountTitle().shouldHave(text("aaa aaa"));
        });
    }

}
