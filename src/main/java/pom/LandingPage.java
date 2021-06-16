package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverService;

public class LandingPage extends WebDriverService {
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    public WebElement tshirtbtn;
    @FindBy(linkText = "My personal information")
    public WebElement myPersonalInfo;


    public void clickontshirt(){ tshirtbtn.click();}

    public void clickonMyPersonalInfo(){ myPersonalInfo.click();}

}
