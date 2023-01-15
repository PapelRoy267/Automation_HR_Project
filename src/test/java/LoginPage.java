import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {


    @FindBy(className = "oxd-input ")
    List<WebElement> txtcreads;

    @FindBy(css = "[type=submit]")
    WebElement btnSubmit;

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void doLogin(String Username, String Password) {

        txtcreads.get(0).sendKeys(Username);
        txtcreads.get(1).sendKeys(Password);
        btnSubmit.click();


    }
}
