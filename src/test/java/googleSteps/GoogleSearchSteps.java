package googleSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();

        //Somethimes internet can be slow, so thats good to prevent delays
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters a text in google search box")
    public void user_enters_a_text_in_google_search_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("hits Enter")
    public void hits_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user is navegated to the Search Results Page")
    public void user_is_navegated_to_the_search_results_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
