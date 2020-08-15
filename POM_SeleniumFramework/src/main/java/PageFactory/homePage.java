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

        headerSection ();

    }

    public void headerSection() {

/*        WebElement seleniumLink = driver.findElement (By.xpath ("//*[@id='navbar-collapse']/nav/ul/li[1]"));
        System.out.println ("Clicked on Header section menu 1 is " +seleniumLink.getText ());

        WebElement testNgLink = driver.findElement (By.xpath ("//*[@id='navbar-collapse']/nav/ul/li[3]"));
        System.out.println ("Clicked on Header section menu 1 is " +testNgLink.getText ());

        WebElement mavenLink = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li:nth-child(4)"));
        System.out.println ("Clicked on Header section menu 1 is " +mavenLink.getText ());*/


        List<WebElement> webElementList = driver.findElements (By.cssSelector ("#navbar-collapse > nav > ul > li"));
        int counter = 1;

        for (WebElement element : webElementList) {
            System.out.println ("Clicked on Header section menu " + element.getText () + " link number " + counter);
            counter++;
        }

    }

    public void supportSection() {

    }

    public void salesSection() {

    }

    public void loginSection() {

        driver.findElement (By.cssSelector (".zh-login")).click ();
        System.out.println ("Clicked on login");

    }

    public void signUpSection() {

        driver.findElement (By.cssSelector (".zh-signup")).click ();
        System.out.println ("Clicked on Sign Up section");

    }

    public void translateSection() {

    }

    public void searchSection() {

    }

    public void homePageFooter() {

    }

}
