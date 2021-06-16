package pom;

import com.google.errorprone.annotations.ForOverride;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverService;

public class CheckoutPage extends WebDriverService {

    @FindBy(linkText = "Proceed to checkout")
    public WebElement proceedtocheckout;
    @FindBy(xpath = "//*[@id='center_column']/form/p/button")
    public WebElement proceedtocheckout2;
    @FindBy(id="cgv")
    public WebElement agreetandc;
    @FindBy(xpath = "//*[@id='form']/p/button)")
    public WebElement proceedtocheckout3;
    @FindBy(linkText = "Pay by bank wire")
    public WebElement bankpayment;
    @FindBy(xpath = "//*[@id='cart_navigation']/button")
    public WebElement confirmorder;



    public void clickonProceedtocheckout(){ proceedtocheckout.click();}

    public void clickonstep1Proceedtocheckout(){ proceedtocheckout2.click();};

    public void clickonagreeTandC(){agreetandc.click();}

    public void clickonstep4Proceedtocheckout(){proceedtocheckout3.click();};

    public void clickonPaybybankwire(){ bankpayment.click();}

    public void clickonconfirmorder(){confirmorder.click();}
}
