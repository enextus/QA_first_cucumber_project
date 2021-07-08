package de.sconto.pages;

import de.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import java.util.concurrent.locks.Condition;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static java.util.concurrent.locks.Condition.*;

public class HomePage {

    public static String baseURL = PropertiesLoader.loadProperty("url");
    private static By acceptBtn = By.xpath("//*[@data-accept-action='all']");
    private static By acceptBanner = By.cssSelector(".consentForm__root");

    public void acceptCookies() {

        $(acceptBtn).click();
        $(acceptBanner).shouldNot(exist);

    }

}
