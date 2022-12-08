package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;

    private By txt_username = By.id("name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login");
    private By btn_logout = By.id("logout");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        //Verifying the home page
        if (!driver.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not Login page. The current URL is: " + driver.getCurrentUrl());
        };
    }

    public void enterUsername(String username){

        driver.findElement(txt_username).sendKeys(username);

    }

    public void enterPassword(String password){

        driver.findElement(txt_password).sendKeys(password);

    }

    public void clickLoginButton(){

        driver.findElement(btn_login).click();
    }

    public void clickLogoutButton(){

        driver.findElement(btn_logout).click();
    }


    public void checkLogoutIsDisplayed(){

        driver.findElement(btn_logout).isDisplayed();
    }

    public void checkLogoutIsNotDisplayed(){

        driver.findElement(btn_logout).isEnabled();
    }

    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }

}
