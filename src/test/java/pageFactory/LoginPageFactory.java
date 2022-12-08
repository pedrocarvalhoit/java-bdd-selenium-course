package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

    @FindBy(id = "name")
    WebElement txt_username;

    @FindBy(id = "password")
    WebElement txt_password;

    @FindBy(id = "login")
    WebElement btn_login;

    protected WebDriver driver;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        //This PF initialize all the elements on this class
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username){

        txt_username.sendKeys(username);

    }

    public void enterPassword(String password){

        txt_password.sendKeys(password);

    }

    public void clickLoginButton(){

        btn_login.click();
    }
}
