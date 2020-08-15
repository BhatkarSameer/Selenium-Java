package PageFactory;

import Base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class homePage extends Page {

    public void homePageHeader() {

        try {
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
        } catch (Exception exception) {
            System.out.println (exception.getMessage ());
        }
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

    public void seleniumScreen() {

        WebElement seleniumJava = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li.expanded.active.dropdown.open > ul > li.first.leaf"));

        WebElement seleniumPython = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li.expanded.active.dropdown.open > ul > li.last.leaf"));

        seleniumJava.click ();
        System.out.println (driver.findElement (By.cssSelector ("div.section-title")).getText ());

        seleniumPython.click ();
        System.out.println (driver.findElement (By.xpath ("//div[3]/div/section/div[1]")).getText ());

    }

    public void testNGScreen() {

        WebElement testNG = driver.findElement (By.xpath ("//*[@id='navbar-collapse']/nav/ul/li[4]"));
        testNG.click ();

        System.out.println (driver.findElement (By.cssSelector ("body > div.main-container.container-fluid > div > section > div.section-title")).getText ());

    }

    public void mavenScreen() {

        WebElement maven = driver.findElement (By.xpath ("//*[@id=\"navbar-collapse\"]/nav/ul/li[4]"));
        maven.click ();

        System.out.println (driver.findElement (By.cssSelector ("body > div.main-container.container-fluid > div > section > div.section-title")).getText ());

    }

    public void jenkinsScreen() {

        WebElement jenkins = driver.findElement (By.cssSelector ("//*[@id=\"navbar-collapse\"]/nav/ul/li[5]"));
        jenkins.click ();

        System.out.println (driver.findElement (By.xpath ("//div[3]/div/section/div[1]")).getText ());

    }

    public void protractorScreen() {

        WebElement protractor = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li:nth-child(6)"));
        protractor.click ();

        System.out.println (driver.findElement (By.xpath ("//div[3]/div/section/div[1]")).getText ());

    }

    public void appiumScreen() {

        WebElement appium = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li:nth-child(7)"));
        appium.click ();

        System.out.println (driver.findElement (By.xpath ("//div[3]/div/section/div[1]")).getText ());

    }

    public void apacheScreen() {

        WebElement apache = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li:nth-child(8)"));
        apache.click ();

        System.out.println (driver.findElement (By.xpath ("//div[3]/div/section/div[1]")).getText ());

    }

    public void katalonScreen() {

        WebElement katalon = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li:nth-child(9)"));
        katalon.click ();

        System.out.println (driver.findElement (By.xpath ("//div[3]/div/section/div[1]")).getText ());

    }

    public void log4jScreen() {

        WebElement log4j = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li:nth-child(10)"));
        log4j.click ();

        System.out.println (driver.findElement (By.xpath ("//div[3]/div/section/div[1]")).getText ());

    }

}
