package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pom.*;
import utils.WebDriverService;

import static org.testng.Assert.assertTrue;

public class Stepdefs1 extends WebDriverService {

    private HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    private SignInPage signinPage = PageFactory.initElements(driver, SignInPage.class);
    private LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    private PersonalInfoPage personalinfoPage = PageFactory.initElements(driver, PersonalInfoPage.class);


    @Given("User is on the Home page")
    public void userIsOnTheHomePage() {
        assertTrue(homePage.verifySignInButtonText(), "Verify HomePage is Displayed");
    }

    @When("User clicks on the SignIn button")
    public void userClicksOnTheSignInButton() {
        homePage.clickSignUpButton();
    }

    @Then("User should be navigated to the signin page")
    public void userShouldBeNavigatedToTheSigninPage() {
        assertTrue(driver.getCurrentUrl().contains("authentication&back"), "Verify SignIn page is opened");
    }

    @And("User enters username \"([^\"]*)\"$")
    public void userEntersUsername(String email) { signinPage.enterTextusername(email);
    }

    @And("User enters password \"([^\"]*)\"$")
    public void userEntersPassword(String password) { signinPage.enterTextpassword(password);
    }

    @And("User clicks on Sign in button")
    public void userClicksOnSignInButton() { signinPage.clickonsigninbtn();
    }

    @Then("User should be navigated to Login Landing page")
    public void userShouldBeNavigatedToLoginLandingPage() {
        assertTrue(driver.getCurrentUrl().contains("-account"), "Verify LandingPage is opened");
    }

    @And("User clicks on my personal information button")
    public void userClicksOnMyPersonalInformationButton() { landingPage.clickonMyPersonalInfo();
    }

    @And("User should be navigates to your personal information page")
    public void userShouldBeNavigatesToYourPersonalInformationPage() {
        assertTrue(driver.getCurrentUrl().contains("identity"), "Verify Personal Information page is opened");
    }

    @And("User enters first name \"([^\"]*)\"$")
    public void userEntersFirstName(String fname) {personalinfoPage.EnterFirstName(fname);
    }

    @And("User enters current password \"([^\"]*)\"$")
    public void userEntersCurrentPassword(String opassword) { personalinfoPage.EnterOldPassword(opassword);
    }

    @And("User enters new password \"([^\"]*)\"$")
    public void userEntersNewPassword(String newpassword) {personalinfoPage.EnterNewPassword(newpassword);
    }

    @And("User enters confirmation password \"([^\"]*)\"$")
    public void userEntersConfirmationPassword(String confirmnewpassword) { personalinfoPage.EnterconfirmnewPassword(confirmnewpassword);
    }

    @And("User clicks on save button")
    public void userClicksOnSaveButton() {personalinfoPage.ClickonSaveBtn();
    }

    @Then("User should able to the success message")
    public void userShouldAbleToTheSuccessMessage() { personalinfoPage.getSuccessMsg();
    }


}
