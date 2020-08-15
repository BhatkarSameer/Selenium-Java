package org.selenium.pomFramework.rough;

import PageFactory.homePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginTest {

    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver ().setup ();
        driver = new FirefoxDriver ();
        System.out.println ("Firefox is being launched to Run the tests");

        driver.get ("https://www.seleniumeasy.com/");

        driver.manage ().window ().maximize ();

        homePage home = new homePage (driver);
        home.homePageHeader ();

    }

}
