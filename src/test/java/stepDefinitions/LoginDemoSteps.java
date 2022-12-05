package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {

        System.out.println("Inside Step - browser is open");

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();

        //Somethimes internet can be slow, so thats good to prevent delays
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.id("name")).sendKeys("Pedro Duarte");
        driver.findElement(By.id("password")).sendKeys("12345");
    }

    @And("user clicks on login")
    public void user_clicks_on_login() {
        driver.findElement(By.id("login")).submit();
    }

    @Then("user is navigated to the home")
    public void user_is_navigated_to_the_home() {

      //  Assert.assertTrue(driver.getPageSource().contains("Logout"));.
        driver.findElement(By.id("logout")).isDisplayed();
        driver.close();
        driver.quit();

    }


}
