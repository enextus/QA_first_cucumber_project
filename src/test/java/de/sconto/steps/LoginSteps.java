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

        Given("I am on the homepage", () -> {
            // Write code here that turns the phrase above into concrete actions

            //public void I_am_on_the_homepage();

            throw new io.cucumber.java8.PendingException();
        });

        When("I click on the Login icon", () -> {

            loginPage = page(LoginPage.class);
            loginPage.clickOnLoginTab();

            throw new io.cucumber.java8.PendingException();
        });

        Then("I see login page", () -> {

            loginPage.loginPageHeader().should(Condition.exist);
            loginPage.loginPageHeader().shouldHave(text("Anmelden"));

            throw new io.cucumber.java8.PendingException();
        });




        When("I insert valid user credentials", () -> {

            loginPage.validLoginInput();

            throw new io.cucumber.java8.PendingException();
        });

        And("I click on Login button", () -> {

            loginPage.clickOnSubmitButton();

            throw new io.cucumber.java8.PendingException();
        });

        Then("I should see MyAccount icon", () -> {

            loginPage.validMyAccountIcon().should(exist);

            throw new io.cucumber.java8.PendingException();
        });




        When("I click on MyAccount icon", () -> {

            loginPage.clickOnMyAccountIcon();

            throw new io.cucumber.java8.PendingException();
        });

        Then("I should see my name", () -> {
            loginPage.accountTitle().should(exist);
            loginPage.accountTitle().shouldHave(text("aaa aaa"));

            throw new io.cucumber.java8.PendingException();
        });

    }

}

 /*When I click on the Login icon
    Then I see Login page
    When I insert valid user credentials
    And I click on Login button
    Then I should see MyAccount icon
    When I click on MyAccount icon
    Then I should see my name

  */
