package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Page {

    public static WebDriver driver;

    public Page(){

        WebDriverManager.firefoxdriver ().setup ();
        driver = new FirefoxDriver ();
        System.out.println ("Firefox is being launched to Run the tests");

        driver.get ("https://www.seleniumeasy.com/");
        driver.manage ().timeouts ().implicitlyWait (50, TimeUnit.SECONDS);
        driver.manage ().window ().maximize ();

    }

}
