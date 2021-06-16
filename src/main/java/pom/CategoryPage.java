package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverService;

public class CategoryPage extends WebDriverService {
    @FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]")
    public WebElement addtocart;
    @FindBy(linkText = "Proceed to checkout")
    public WebElement checkout;


    public void clickonaddtocart(){ addtocart.click();}

    public void clickproceedtocheckout(){ checkout.click();}



}
