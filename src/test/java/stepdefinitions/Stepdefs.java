package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pom.*;
import utils.WebDriverService;

import static org.testng.Assert.assertTrue;

public class Stepdefs extends WebDriverService {

    private HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    private SignInPage signinPage = PageFactory.initElements(driver, SignInPage.class);
    private LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    private CategoryPage categoryPage = PageFactory.initElements(driver,CategoryPage.class);
    private CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
    private OrderVerifyPage orderverifyPage = PageFactory.initElements(driver, OrderVerifyPage.class);

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

    @And("User clicks on T-Shirts button")
    public void userClicksOnTShirtsButton() {landingPage.clickontshirt();
    }

    @Then("User should be navigated to category page")
    public void userShouldBeNavigatedToCategoryPage() {
        assertTrue(driver.getCurrentUrl().contains("controller=category"), "Verify CategoryPage is opened");
    }

    @And("User clicks on add to card button")
    public void userClicksOnAddToCardButton() {categoryPage.clickonaddtocart();

    }

    @And("User clicks on proceed to checkout button")
    public void userClicksOnProceedToCheckoutButton() { categoryPage.clickproceedtocheckout();
    }

    @Then("User should be navigated to order summary page")
    public void userShouldBeNavigatedToOrderSummaryPage() {
        assertTrue(driver.getCurrentUrl().contains("order"), "Verify Order Summary Page");
    }

    @And("User clicks on proceed to checkout button for address")
    public void userClicksOnProceedToCheckoutButtonForAddress() { checkoutPage.clickonProceedtocheckout();
    }

    @And("User clicks on proceed to checkout button for shipping")
    public void userClicksOnProceedToCheckoutButtonForShipping() { checkoutPage.clickonstep1Proceedtocheckout();
    }

    @And("User accepts the terms and condition by clicking the check box")
    public void userAcceptsTheTermsAndConditionByClickingTheCheckBox() { checkoutPage.clickonagreeTandC();
    }

    @And("User clicks on proceed to checkout button for payment")
    public void userClicksOnProceedToCheckoutButtonForPayment() { checkoutPage.clickonstep4Proceedtocheckout();
    }


    @Then("User should be navigated to payment method page")
    public void userShouldBeNavigatedToPaymentMethodPage() {
        assertTrue(driver.getCurrentUrl().contains("multi-shipping"), "Verify Payment page is opened");
    }

    @When("User clicks on Pay by bank wire button")
    public void userClicksOnPayByBankWireButton() { checkoutPage.clickonPaybybankwire();
    }

    @And("User clicks on I confirm my order button")
    public void userClicksOnIConfirmMyOrderButton() { checkoutPage.clickonconfirmorder();
    }

    @Then("User should see the order confirmation message")
    public void userShouldSeeTheOrderConfirmationMessage() {orderverifyPage.getConfimationMsg();
    }

    @When("User should clicks on back to order link")
    public void userShouldClicksOnBackToOrderLink() { orderverifyPage.clickonbacktoorder();
    }

    @Then("User should be navigated to order history page")
    public void userShouldBeNavigatedToOrderHistoryPage() {
        assertTrue(driver.getCurrentUrl().contains("history"), "Verify User is on Order History Page");
    }

    @And("User should able to verify the order reference number with transaction order reference number")
    public void userShouldAbleToVerifyTheOrderReferenceNumberWithTransactionOrderReferenceNumber() {
        assertTrue(orderverifyPage. verifyOrderRefFromTransactionHistory(), "Check - Order Ref matched");
    }



}
