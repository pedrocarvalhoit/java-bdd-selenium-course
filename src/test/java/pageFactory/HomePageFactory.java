package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {

    WebDriver driver;

    @FindBy(id = "logout")
    WebElement btn_logout;

    public void checkLogoutIsDisplyed(){
        btn_logout.isDisplayed();
    }

    public HomePageFactory(WebDriver driver) {
        this.driver = driver;
        //This PF initialize all the elements on this class
        PageFactory.initElements(driver, LoginPageFactory.class);
    }

}
