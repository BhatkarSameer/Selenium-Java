package org.selenium.pomFramework.utilities;

import Base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class webDefinitions extends Page {

    public static List<WebElement> handleHREFS(String locator) {

        //Helps filter which links to work on by assigning div block as a WebElement
        WebElement block = driver.findElement (By.cssSelector (locator));

        //Locates all links from the div block
        List<WebElement> href_links = block.findElements (By.tagName ("a"));

        System.out.println ("Values from total links on webpage are stored as list of WebElements with size of" + href_links.size ());

        for (WebElement href : href_links) {
            //Write code to specify action on links e.g.Click or getAttribute.value
            System.out.println (href.getText () + " represents url " + href.getAttribute ("href"));
        }
        return href_links;
    }

}
