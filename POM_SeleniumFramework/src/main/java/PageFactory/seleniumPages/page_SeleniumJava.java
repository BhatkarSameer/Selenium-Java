package PageFactory.seleniumPages;

import Base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class page_SeleniumJava extends Page {

    public void  navigateSeleniumJava(){

        WebElement seleniumJava = driver.findElement (By.cssSelector ("#navbar-collapse > nav > ul > li.expanded.active.dropdown.open > ul > li.first.leaf"));

        seleniumJava.click ();
        String screenTitle = driver.findElement (By.cssSelector ("div.section-title")).getText ();

        System.out.println ("Navigated to " +screenTitle);

    }

}
