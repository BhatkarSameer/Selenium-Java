package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testRunner.runnerCukes;

public class stepDefinitions extends runnerCukes {

    //Declarations
    WebDriver driver;
    String userDir = System.getProperty("user.dir");

    public void openbrowser() {

        System.setProperty("webdriver.chrome.driver", userDir + "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https:\\ww.google.com");
    }

    @Given("^User navigates to Webpage$")
    public void user_navigates_to_Webpage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@Given User navigates to Webpage");
        System.out.println(userDir);
    }

    @When("^User validates the Webpage title$")
    public void user_validates_the_Webpage_title() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@When User validates the Webpage title");
    }

    @Then("^User navigates the webpage$")
    public void user_navigates_the_webpage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@Then User navigates the webpage");
    }

    @Then("^User reaches the desired screen successfully$")
    public void user_reaches_the_desired_screen_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@Then User reaches the desired screen successfully");
    }

    @When("^User verifies the screen is correct$")
    public void user_verifies_the_screen_is_correct() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@When User verifies the screen is correct");
    }

    @Then("^User can perform actions$")
    public void user_can_perform_actions() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@Then User can perform actions");
    }

}
