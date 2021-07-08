package de.sconto.pages;

import de.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

public class HomePage {

    public static String baseURL = PropertiesLoader.loadProperty("url");

    private static By acceptBtn = By.xpath("//*[@data-accept-action='all']");


}
