package stepDefinitions.loginDemo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

import java.util.concurrent.TimeUnit;

public class LoginDemoStepsPF {

//    WebDriver driver = null;
//    LoginPageFactory login;
//    HomePageFactory homePage;
//
//    @Given("browser is open")
//    public void browser_is_open() {
//
//        System.out.println("------ Login Steps With Page Factory");
//
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//
//        //Somethimes internet can be slow, so thats good to prevent delays
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//    }
//
//    @And("user is on login page")
//    public void user_is_on_login_page() {
//
//        driver.navigate().to("https://example.testproject.io/web/");
//    }
//
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//        login = new LoginPageFactory(driver);
//
//        login.enterUsername(username);
//        login.enterPassword(password);
//
//        Thread.sleep(2000);
//    }
//
//    @And("user clicks on login")
//    public void user_clicks_on_login() {
//        login.clickLoginButton();
//    }
//
//    @Then("user is navigated to the home")
//    public void user_is_navigated_to_the_home() {
//
//        homePage.checkLogoutIsDisplyed();
//
//        driver.close();
//        driver.quit();
//
//    }


}
