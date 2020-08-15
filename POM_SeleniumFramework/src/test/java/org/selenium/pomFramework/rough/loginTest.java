package org.selenium.pomFramework.rough;

import Base.Page;
import PageFactory.homePage;
import PageFactory.seleniumPages.page_SeleniumJava;
import PageFactory.seleniumPages.page_SeleniumPython;

public class loginTest extends Page {

    public static void main(String[] args) {

        //Instantiating objects of child classes
        homePage home = new homePage ();
        home.headerSection ();

        page_SeleniumJava seleniumJava = new page_SeleniumJava ();
        //method calling for Selenium Java screens

        page_SeleniumPython seleniumPython = new page_SeleniumPython ();
        //method calling for Selenium Py
        // screens

    }

}
