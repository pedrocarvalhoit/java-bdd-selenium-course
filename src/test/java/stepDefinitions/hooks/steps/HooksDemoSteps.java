package stepDefinitions.hooks.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HooksDemoSteps {

    WebDriver driver = null;

    @Before
    public void browserSetup(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    @BeforeStep
    public void beforeSteps(){
        System.out.println("---BEFORE S----");
    }

    @AfterStep
    public void afterSteps(){
        System.out.println("---AFTER S----");
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User in login page");
    }
    @And("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("User enters username and password");
    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("User clicks on login button");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Home page");
    }
}
