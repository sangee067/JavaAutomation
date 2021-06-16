package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverService;

public class HomePage extends WebDriverService {

    @FindBy(linkText = "Sign in")
    public WebElement signinButton;

    public boolean verifySignInButtonText() {
        driver.get("http://automationpractice.com/index.php");
        waitForElement(signinButton, 10);
        return (signinButton.getText().equalsIgnoreCase("Sign in"));
    }
    public void clickSignUpButton() {
        clickOnElement(signinButton, "Sign in");
    }


}
