package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class homePage {

    WebDriver driver;

    public homePage(WebDriver driver) {

        this.driver = driver;

    }

    public void homePageHeader() {

            try{
                driver.manage ().timeouts ().implicitlyWait (50, TimeUnit.SECONDS);
                WebElement element = driver.findElement (By.xpath ("//*[@id=\"site-name\"]"));
                if (element != null) {
                    element.click ();
                    System.out.println ("Reached home page of " + element.getText ());
                }

                element = driver.findElement (By.cssSelector ("//*[@class='easy-title']"));
                if (element != null) {
                    System.out.println ("Validating reaching home page" + element.getText ());
                }
            }
            catch (Exception exception){
                System.out.println (exception.getMessage ());
            }

        headerSection ();

    }

    public void headerSection() {

        String locator = "#navbar-collapse > nav > ul";

        List<WebElement> webElementList = driver.findElements (By.cssSelector ("#navbar-collapse > nav > ul > li"));
        int counter = 1;

        for (WebElement element : webElementList) {
            System.out.println ("Registered " + element.getText () + " link menu");
            counter++;
        }
        System.out.println (counter);

        //Helps filter which links to work on by assigning div block as a WebElement
        WebElement block = driver.findElement (By.cssSelector (locator));

        //Locates all links from the div block
        List<WebElement> href_links = block.findElements (By.tagName ("a"));

        System.out.println ("Values from total links on webpage are stored as list of WebElements with size of" + href_links.size ());

        for (WebElement href : href_links) {
            //Write code to specify action on links e.g.Click or getAttribute.value
            System.out.println (href.getText () + " represents url " + href.getAttribute ("href"));
        }
    }

    public void selenium() {

        WebElement seleniumJava = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li.expanded.active.dropdown.open > ul > li.first.leaf"));

        WebElement seleniumPython = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li.expanded.active.dropdown.open > ul > li.last.leaf"));

        seleniumJava.click ();
        System.out.println (driver.findElement (By.cssSelector ("div.section-title")).getText ());

    }

    public void testng() {

    }

    public void maven() {

    }

    public void jenkins() {

    }

    public void protractor() {

    }

    public void appium() {

    }

    public void apache() {

    }

    public void katalon() {

    }

    public void log4j() {

    }

}
