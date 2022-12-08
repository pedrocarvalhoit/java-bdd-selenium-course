package stepDefinitions.backGround.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

/**Background allows you to create a starting point and
 * test multiple scenarios from there*/
public class BackGroundSteps {

    WebDriver driver = null;
    LoginPage loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.navigate().to("https://example.testproject.io/web/");

    }
    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {

        loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("12345");

        Thread.sleep(300);
    }
    @When("user clicks on login")
    public void user_clicks_on_login() {
        loginPage.clickLoginButton();
    }
    @Then("user is navigated to the homepage")
    public void user_is_navigated_to_the_homepage() {
        loginPage.checkLogoutIsDisplayed();
    }

    @Given("user is logged in")
    public void user_is_logged_in(){
        loginPage.checkLogoutIsDisplayed();
    }
    @When("user clicks on logout button")
    public void user_clicks_on_logout_button() {

    }
    @Then("logout button is not displayed")
    public void logout_button_is_not_displayed() {

    }

    @When("user clicks on dashboard link")
    public void user_clicks_on_dashboard_link() {
    }
    @Then("quick launch toolbar is displayed")
    public void quick_launch_toolbar_is_displayed() {
    }
}
