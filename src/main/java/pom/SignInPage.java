package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverService;

public class SignInPage extends WebDriverService {
    @FindBy(id = "email")
    public WebElement usernameTextField;
    @FindBy(id = "passwd")
    public WebElement passwordTextField;
    @FindBy(id="SubmitLogin")
    public WebElement clickSubmit;



    private static String user = null;
    private static String pswd = null;

    public void enterTextusername(String username) {
        user = username;
        enterValueInTextField(usernameTextField, username);
    }

    public void enterTextpassword(String password) {
        pswd = password;
        enterValueInTextField(passwordTextField, password);
    }

    public void clickonsigninbtn(){
        clickSubmit.click();
    }
}
